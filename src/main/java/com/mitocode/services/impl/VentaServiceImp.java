package com.mitocode.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.entidad.Venta;
import com.mitocode.repo.IVentaRepo;
import com.mitocode.services.IVentaService;

@Service

public class VentaServiceImp implements IVentaService{

	@Autowired
	IVentaRepo repo;
	
	
	@Override
	public Venta registrar(Venta ven) {
		// TODO Auto-generated method stub
		ven.getDetalleVenta().forEach(det -> det.setVenta(ven));
		return repo.save(ven);
	}

	@Override
	public Venta leer(Integer id) {
		// TODO Auto-generated method stub
		return repo.findOne(id);
	}

	@Override
	public Venta modificar(Venta obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.delete(id);
	}

	@Override
	public List<Venta> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
