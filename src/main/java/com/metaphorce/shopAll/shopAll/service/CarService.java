package com.metaphorce.shopAll.shopAll.service;

import com.metaphorce.shopAll.shopAll.model.CarEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;

import java.util.List;

public interface CarService {

    List<CarEntity> obtenerCarritoPorUsuario(UserEntity usuario);
    CarEntity agregarCarrito(CarEntity carEntity);
    void eliminarCarrito(Integer id);

}
