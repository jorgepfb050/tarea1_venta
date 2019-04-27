package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.entidad.Venta;

public interface IVentaRepo  extends JpaRepository<Venta,Integer> {

}
