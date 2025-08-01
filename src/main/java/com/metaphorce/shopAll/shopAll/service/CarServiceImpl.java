package com.metaphorce.shopAll.shopAll.service;

import com.metaphorce.shopAll.shopAll.model.CarEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<CarEntity> obtenerCarritoPorUsuario(UserEntity usuario) {
        return carRepository.findByUsuario(usuario);
    }

    @Override
    public CarEntity agregarCarrito(CarEntity carEntity) {
        return carRepository.save(carEntity);
    }

    @Override
    public void eliminarCarrito(Integer id) {
        carRepository.deleteById(id);
    }
}
