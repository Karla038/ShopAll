package com.metaphorce.shopAll.shopAll.service;

import com.metaphorce.shopAll.shopAll.model.ProductEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductEntity> buscarProductos(String nombre) {
        return productRepository.findByNombreContaining(nombre);
    }

    @Override
    public List<ProductEntity> obtenerProductosPorVendedor(UserEntity vendedor) {
        return productRepository.findByVendedor(vendedor);
    }

    @Override
    public List<ProductEntity> obtenerProductosPorCategoria(Integer categoriaId) {
        return productRepository.findByCategoriaId(categoriaId);
    }

}
