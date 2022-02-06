package com.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "odeme")
public class Odeme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(name = "ad")
private String ad;
	@Column(name = "soyAd")
private String soyAd;
	@Column(name = "kullaniciAdi")
private String kullaniciAdi;
	@Column(name = "eMail")
private String eMail;
	@Column(name = "adres")
private String adres;
	@Column(name = "sehir")
private String sehir;
	@Column(name = "ilce")
private String ilce;
	@Column(name = "zipCode")
private String zipCode;
	@Column(name = "kartNo")
private String kartNo;
	@Column(name = "cvv")
private String cvv;
	@Column(name = "sonKulTarih")
private int sonKultarih;
	
	
public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
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
public String getKullaniciAdi() {
	return kullaniciAdi;
}
public void setKullaniciAdi(String kullaniciAdi) {
	this.kullaniciAdi = kullaniciAdi;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
public String getAdres() {
	return adres;
}
public void setAdres(String adres) {
	this.adres = adres;
}
public String getSehir() {
	return sehir;
}
public void setSehir(String sehir) {
	this.sehir = sehir;
}
 
 
public String getZipCode() {
	return zipCode;
}
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
public String getKartNo() {
	return kartNo;
}
public void setKartNo(String kartNo) {
	this.kartNo = kartNo;
}
public String getCvv() {
	return cvv;
}
public void setCvv(String cvv) {
	this.cvv = cvv;
}
public int getSonKultarih() {
	return sonKultarih;
}
public void setSonKultarih(int sonKultarih) {
	this.sonKultarih = sonKultarih;
}

}
