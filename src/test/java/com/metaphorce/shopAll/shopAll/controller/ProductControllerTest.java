package com.metaphorce.shopAll.shopAll.controller;


import com.metaphorce.shopAll.shopAll.model.ProductEntity;
import com.metaphorce.shopAll.shopAll.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {


    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductService productService;


    @Test
    void buscarProductosTest(){
        ResponseEntity<List<ProductEntity>> response = productController.buscarProductos("name");
        Assertions.assertNotNull(response);
    }

    @Test
    void obtenerProductosPorVendedorTest(){
        ResponseEntity<List<ProductEntity>> response = productController.obtenerProductosPorVendedor(1);
        Assertions.assertNotNull(response);
    }


    @Test
    void obtenerProductosPorCategoriaTest(){
        ResponseEntity<List<ProductEntity>> response = productController.obtenerProductosPorCategoria(1);
        Assertions.assertNotNull(response);
    }


}
