package com.metaphorce.shopAll.shopAll.repository;

import com.metaphorce.shopAll.shopAll.model.CarEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {

    List<CarEntity> findByUsuario(UserEntity usuario);

}
