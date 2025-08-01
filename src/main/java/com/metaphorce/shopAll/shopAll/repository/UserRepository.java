package com.metaphorce.shopAll.shopAll.repository;

import com.metaphorce.shopAll.shopAll.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // Buscar un usuario por su correo
    Optional<UserEntity> findByCorreo(String correo);

}
