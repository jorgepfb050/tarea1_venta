package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.entidad.Producto;
import com.mitocode.services.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	IProductoService service;
	
	
	@PostMapping
	public ResponseEntity<Producto> registrar(@RequestBody Producto prod) {
		Producto producto= service.registrar(prod);		
		return new ResponseEntity<Producto>(producto,HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Producto> leer(@PathVariable("id") Integer id) {
		Producto prod = service.leer(id);
		return new ResponseEntity<Producto>(prod,HttpStatus.OK) ;
	}

	@PutMapping
	public ResponseEntity<Producto> modificar(@RequestBody Producto obj) {
		Producto prod= service.modificar(obj);
		return new ResponseEntity<Producto>(prod,HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);		
	}

	@GetMapping
	public ResponseEntity<Object> listar() {
		 List<Producto> listaProd = service.listar();
		// TODO Auto-generated method stub
		return new ResponseEntity<Object>(listaProd,HttpStatus.OK);
	}
}
