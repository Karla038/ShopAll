package com.metaphorce.shopAll.shopAll.repository;

import com.metaphorce.shopAll.shopAll.model.ProductEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    // Buscar productos por nombre
    List<ProductEntity> findByNombreContaining(String nombre);

    // Obtener productos por vendedor
    List<ProductEntity> findByVendedor(UserEntity vendedor);

    // Obtener productos por categoría
    List<ProductEntity> findByCategoriaId(Integer categoriaId);
}
