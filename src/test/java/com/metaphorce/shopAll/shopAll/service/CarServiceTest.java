package com.metaphorce.shopAll.shopAll.service;


import com.metaphorce.shopAll.shopAll.model.CarEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.repository.CarRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @InjectMocks
    private CarServiceImpl carService;

    @Mock
    private CarRepository carRepository;

    @Mock
    private UserEntity user;

    @Mock
    private CarEntity carEntity;

    @Test
    void obtenerCarritoPorUsuarioTest(){
        List<CarEntity> carEntities = carService.obtenerCarritoPorUsuario(user);
        Assertions.assertNotNull(carEntities);
    }

    @Test
    void agregarCarritoTest(){
        CarEntity carEntities = carService.agregarCarrito(carEntity);
        Mockito.verify(carRepository).save(carEntity);
    }

    @Test
    void eliminarCarritoTest(){
        carService.eliminarCarrito(carEntity.getId());
        Mockito.verify(carRepository).deleteById(carEntity.getId());
    }


}
