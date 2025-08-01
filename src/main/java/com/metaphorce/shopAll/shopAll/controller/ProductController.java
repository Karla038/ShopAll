package com.metaphorce.shopAll.shopAll.controller;

import com.metaphorce.shopAll.shopAll.model.ProductEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tienda/productos")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Buscar productos por nombre
    @GetMapping("/buscar")
    public ResponseEntity<List<ProductEntity>> buscarProductos(@RequestParam String nombre) {
        List<ProductEntity> productos = productService.buscarProductos(nombre);
        return ResponseEntity.ok(productos);
    }

    // Obtener productos por vendedor
    @GetMapping("/vendedor/{vendedorId}")
    public ResponseEntity<List<ProductEntity>> obtenerProductosPorVendedor(@PathVariable Integer vendedorId) {
        UserEntity vendedor = new UserEntity();
        vendedor.setId(vendedorId);
        List<ProductEntity> productos = productService.obtenerProductosPorVendedor(vendedor);
        return ResponseEntity.ok(productos);
    }

    // Obtener productos por categoría
    @GetMapping("/categoria/{categoriaId}")
    public ResponseEntity<List<ProductEntity>> obtenerProductosPorCategoria(@PathVariable Integer categoriaId) {
        List<ProductEntity> productos = productService.obtenerProductosPorCategoria(categoriaId);
        return ResponseEntity.ok(productos);
    }
}
