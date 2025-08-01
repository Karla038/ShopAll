package com.metaphorce.shopAll.shopAll.controller;

import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tienda/usuarios")
public class UserController {

    @Autowired
    private UserService userService;

    // Buscar usuario por correo electrónico
    @GetMapping("/correo/{correo}")
    public ResponseEntity<UserEntity> findUserByEmail(@PathVariable String correo) {
        Optional<UserEntity> usuario = userService.findUserByEmail(correo);
        return usuario.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Guardar un nuevo usuario
    @PostMapping("/crear")
    public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userEntity) {
        UserEntity nuevoUsuario = userService.saveUser(userEntity);
        return ResponseEntity.status(201).body(nuevoUsuario);
    }

}
