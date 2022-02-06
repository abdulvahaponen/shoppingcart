package com.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "satinal")
public class SatinAl {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(name = "ilce")
private String ilce;
	@Column(name = "mahalle")
private String mahalle;
	@Column(name = "cadde")
private String cadde;
	@Column(name = "sokak")
private String sokak;
	@Column(name = "no")
private String no;
	@Column(name = "apartman")
private String apartman;
	@Column(name = "telefonNo")
private String telefonNo;
	@Column(name = "kartNo")
private int kartNo;
	@Column(name = "taksitTutari")
private int taksitTutari;
@Column(name = "il")
private String il;
}
