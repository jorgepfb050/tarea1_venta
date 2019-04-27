package com.mitocode.services;

import java.util.List;

public interface ICluodService <T>{
	
	T registrar(T obj);
	T leer(Integer id);
	T modificar (T obj);
	void eliminar(Integer id);
	List<T> listar();

}
