package com.narabel.servicioproductos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.narabel.servicioproductos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
