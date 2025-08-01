package com.metaphorce.shopAll.shopAll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarEntity extends JpaRepository<CarEntity, Integer> {

    List<CarEntity> findByUsuario(UserEntity usuario);

}
