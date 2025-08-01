package com.metaphorce.shopAll.shopAll.service;

import com.metaphorce.shopAll.shopAll.model.ProductEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> buscarProductos(String nombre);
    List<ProductEntity> obtenerProductosPorVendedor(UserEntity vendedor);
    List<ProductEntity> obtenerProductosPorCategoria(Integer categoriaId);


}
