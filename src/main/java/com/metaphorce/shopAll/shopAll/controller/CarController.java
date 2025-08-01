package com.metaphorce.shopAll.shopAll.controller;

import com.metaphorce.shopAll.shopAll.model.CarEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tienda/carrito")
public class CarController {


    @Autowired
    private CarService carService;

    // Obtener carrito por usuario
    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<CarEntity>> obtenerCarritoPorUsuario(@PathVariable Integer usuarioId) {
        UserEntity usuario = new UserEntity();
        usuario.setId(usuarioId);  // Suponiendo que el ID de usuario es único
        List<CarEntity> carrito = carService.obtenerCarritoPorUsuario(usuario);
        return ResponseEntity.ok(carrito);
    }

    // Agregar producto al carrito
    @PostMapping("/agregar")
    public ResponseEntity<CarEntity> agregarCarrito(@RequestBody CarEntity carEntity) {
        CarEntity nuevoCarrito = carService.agregarCarrito(carEntity);
        return ResponseEntity.status(201).body(nuevoCarrito);
    }

    // Eliminar producto del carrito
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminarCarrito(@PathVariable Integer id) {
        carService.eliminarCarrito(id);
        return ResponseEntity.noContent().build();
    }
}
