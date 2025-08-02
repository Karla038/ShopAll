package com.metaphorce.shopAll.shopAll.service;


import com.metaphorce.shopAll.shopAll.model.CarEntity;
import com.metaphorce.shopAll.shopAll.model.ProductEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @InjectMocks
    private ProductServiceImpl productService;

    @Mock
    private ProductRepository productRepository;

    @Mock
    private UserEntity vendedor;

    @Test
    void obtenerCarritoPorUsuarioTest(){
        List<ProductEntity> productEntities = productService.buscarProductos("nombre");
        Assertions.assertNotNull(productEntities);
    }

    @Test
    void obtenerProductosPorVendedorTest(){
        List<ProductEntity> productEntities = productService.obtenerProductosPorVendedor(vendedor);
        Assertions.assertNotNull(productEntities);
    }

    @Test
    void obtenerProductosPorCategoriaTest(){
        List<ProductEntity> productEntities = productService.obtenerProductosPorCategoria(1);
        Assertions.assertNotNull(productEntities);
    }


}
