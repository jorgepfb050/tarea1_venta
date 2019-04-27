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

import com.mitocode.entidad.Persona;
import com.mitocode.services.IPersonaService;

@RestController
@RequestMapping("/personas")
public class Personacontroller {
	
	@Autowired
	IPersonaService service;
	
	@PostMapping
	public ResponseEntity<Persona> registrar(@RequestBody Persona per) {
		per = service.registrar(per);
		return new ResponseEntity<Persona>(per,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Persona> leerPorId(@PathVariable("id") Integer id) {
		Persona per = service.leer(id);
		return new ResponseEntity<Persona>(per,HttpStatus.OK);
	}
	
		
	@PutMapping	
	public ResponseEntity<Persona> modificar(@RequestBody Persona per){
		Persona persona = service.modificar(per);
		return new ResponseEntity<Persona>(persona,HttpStatus.OK);		
		
	}
	
	@DeleteMapping ("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id)
	{		
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);		
	}
	
	
	@GetMapping
	public ResponseEntity<Object> listar(){
		List<Persona> list = service.listar();
		return new ResponseEntity<Object>(list,HttpStatus.OK);
	}
	

}
