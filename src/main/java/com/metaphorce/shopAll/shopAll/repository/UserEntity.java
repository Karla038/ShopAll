package com.metaphorce.shopAll.shopAll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserEntity extends JpaRepository<UserEntity, Integer> {

    // Buscar un usuario por su correo
    Optional<UserEntity> findByCorreo(String correo);

}
