package com.narabel.servicioproductos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.narabel.servicioproductos.models.dao.ProductoDao;
import com.narabel.servicioproductos.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private ProductoDao productoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) this.productoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		return this.productoDao.findById(id).orElse(null);
	}

}
