package com.mitocode.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="detalleVenta")
public class DetalleVenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalleVente;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="idVenta",nullable = false,foreignKey = @ForeignKey(name="FK_detalleVenta_venta"))
	private Venta venta;
	
	@Column(name = "cantidad",nullable = false)
	private Integer cantidad;
	
	

	public Integer getIdDetalleVente() {
		return idDetalleVente;
	}

	public void setIdDetalleVente(Integer idDetalleVente) {
		this.idDetalleVente = idDetalleVente;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	

}
