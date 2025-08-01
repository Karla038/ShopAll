package com.metaphorce.shopAll.shopAll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductEntity extends JpaRepository<ProductEntity, Integer> {

    // Buscar productos por nombre
    List<ProductEntity> findByNombreContainingIgnoreCase(String nombre);

    // Obtener productos por vendedor
    List<ProductEntity> findByVendedor(UserEntity vendedor);

    // Obtener productos por categoría
    List<ProductEntity> findByCategoriaId(Integer categoriaId);

}
