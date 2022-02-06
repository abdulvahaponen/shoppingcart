package com.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uye")
public class Uye {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(name = "ad")
private String ad;
	@Column(name = "soyad")
private String soyAd;
	@Column(name = "email")
private String eMail;
	@Column(name = "sifre")
private String sifre;
	@Column(name = "telefonNo")
private String telefonNo;
	

public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
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
public String getSifre() {
	return sifre;
}
public void setSifre(String sifre) {
	this.sifre = sifre;
}
public String getTelefonNo() {
	return telefonNo;
}
public void setTelefonNo(String telefonNo) {
	this.telefonNo = telefonNo;
}
 
 

}
