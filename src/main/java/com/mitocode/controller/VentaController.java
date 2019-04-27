package com.mitocode.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mitocode.dto.VentaDetalleDTO;
import com.mitocode.entidad.Venta;
import com.mitocode.services.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	
	@Autowired
	IVentaService service;
	
	
	/*@GetMapping(value = "/ventaDadetalleHATEOAS",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VentaDetalleDTO>  listarConsultaDetalle(){
		
		List<Venta> lisVenta = new ArrayList<>();
		List<VentaDetalleDTO> lisVentaDeDto = new ArrayList<>();
		lisVenta = service.listar();
		for(Venta v : lisVenta ) {
			VentaDetalleDTO vd = new VentaDetalleDTO();
			vd.setIdVenta(v.getIdVenta());
			vd.setPersona(v.getPersona());
			vd.setProducto(v.getProducto());
			lisVentaDeDto.add(vd);			
		}
		return lisVentaDeDto;
	}*/
	
	
	@PostMapping
	public ResponseEntity<Venta> registrar(@RequestBody Venta per) {
		per = service.registrar(per);
		return new ResponseEntity<Venta>(per,HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Venta> leerPorId(@PathVariable("id") Integer id) {
		Venta per = service.leer(id);
		return new ResponseEntity<Venta>(per,HttpStatus.OK);
	}
		
	
	@GetMapping
	public ResponseEntity<Object> listar(){
		List<Venta> list = service.listar();
		return new ResponseEntity<Object>(list,HttpStatus.OK);
	}
	

}
