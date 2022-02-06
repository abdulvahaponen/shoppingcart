package com.shoppingcart.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(name = "ad")
private String ad;
	@Column(name = "resim1")
private String resim1;
	@Column(name = "resim2")
private String resim2;
	@Column(name = "fiyat")
private float fiyat;
	@Column(name = "aciklama")
private String aciklama;
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
	public String getResim1() {
		return resim1;
	}
	public void setResim1(String resim1) {
		this.resim1 = resim1;
	}
	public String getResim2() {
		return resim2;
	}
	public void setResim2(String resim2) {
		this.resim2 = resim2;
	}
	public float getFiyat() {
		return fiyat;
	}
	public void setFiyat(float fiyat) {
		this.fiyat = fiyat;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	
}
