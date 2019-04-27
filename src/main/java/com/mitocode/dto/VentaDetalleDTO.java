package com.mitocode.dto;

import org.springframework.hateoas.ResourceSupport;

import com.mitocode.entidad.Persona;
import com.mitocode.entidad.Producto;

public class VentaDetalleDTO extends ResourceSupport{
	
	private Integer idVenta;
	private Persona persona;
	private Producto producto;
	
	public Integer getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	

}
