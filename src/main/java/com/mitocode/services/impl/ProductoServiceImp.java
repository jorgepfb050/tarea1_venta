package com.mitocode.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.entidad.Producto;
import com.mitocode.repo.IProductoRepo;
import com.mitocode.services.IProductoService;

@Service
public class ProductoServiceImp implements IProductoService{
	
	@Autowired
	IProductoRepo repo;

	@Override
	public Producto registrar(Producto prod) {
		
		return repo.save(prod);
	}

	@Override
	public Producto leer(Integer id) {
		
		return repo.findOne(id);
	}

	@Override
	public Producto modificar(Producto obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public void eliminar(Integer id) {
		repo.delete(id);
		
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
