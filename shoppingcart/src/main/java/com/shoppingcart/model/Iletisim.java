package com.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "iletisim")
public class Iletisim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(name = "ad")
private String ad;
	@Column(name = "soyAd")
private String soyAd;
	@Column(name = "eMail")
private String eMail;
	@Column(name = "cepTelefonu")
private String cepTelefonu;
	@Column(name = "mesaj")
private String mesaj;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyAd() {
		return soyAd;
	}
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getCepTelefonu() {
		return cepTelefonu;
	}
	public void setCepTelefonu(String cepTelefonu) {
		this.cepTelefonu = cepTelefonu;
	}
	public String getMesaj() {
		return mesaj;
	}
	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
}
