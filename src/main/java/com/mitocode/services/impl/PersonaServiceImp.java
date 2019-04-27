package com.mitocode.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.entidad.Persona;
import com.mitocode.repo.IPersonaRepo;
import com.mitocode.services.IPersonaService;

@Service

public class PersonaServiceImp implements IPersonaService{

	@Autowired
	IPersonaRepo repo;
	
	
	@Override
	public Persona registrar(Persona obj) {
		// TODO Auto-generated method stub
		
		return repo.save(obj);
	}

	@Override
	public Persona leer(Integer id) {
		// TODO Auto-generated method stub
		return repo.findOne(id);
	}

	@Override
	public Persona modificar(Persona obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.delete(id);
	}

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
