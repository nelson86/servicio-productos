package com.narabel.servicioproductos.models.service;

import java.util.List;

import com.narabel.servicioproductos.models.entity.Producto;

public interface IProductoService {

	List<Producto> findAll();
	Producto findById(Long id);

}
