package com.mitocode.exception;

import java.util.Date;

public class ExceptionResponsive {
	private Date timestamp;
	private String mensaje;
	private String detalles;
	
	public ExceptionResponsive(Date timestamp, String mensaje, String detalles) {
		this.timestamp= timestamp;
		this.mensaje= mensaje;
		this.detalles=detalles;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getDetalles() {
		return detalles;
	}
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	

}
