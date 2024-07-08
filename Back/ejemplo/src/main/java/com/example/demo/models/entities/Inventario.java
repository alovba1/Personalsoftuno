package com.example.demo.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventario")
public class Inventario {
@Id
@Column
//@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column
private String producto;
@Column
private int cantidad;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProducto() {
	return producto;
}
public void setProducto(String producto) {
	this.producto = producto;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}


}
