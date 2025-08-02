package com.metaphorce.shopAll.shopAll.controller;


import com.metaphorce.shopAll.shopAll.model.CarEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.service.CarService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarControllerTest {

    @InjectMocks
    private CarController carController;

    @Mock
    private CarService carService;

    @Mock
    private UserEntity user;

    @Mock
    private CarEntity carEntity;

    @Test
    void obtenerCarritoPorUsuarioTest(){
        when(user.getId()).thenReturn(2);
        List<CarEntity> carrito = carService.obtenerCarritoPorUsuario(user);
        carController.obtenerCarritoPorUsuario(user.getId());
        Assertions.assertNotNull(carrito);
    }

    @Test
    void agregarCarritoTest(){
        ResponseEntity<CarEntity> response = carController.agregarCarrito(carEntity);
        Assertions.assertNotNull(response);
    }

    @Test
    void eliminarCarritoTest(){
        ResponseEntity<Void> response = carController.eliminarCarrito(1);
        Assertions.assertNotNull(response);
    }





}
