package com.metaphorce.shopAll.shopAll.controller;


import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {


    @InjectMocks
    private UserController userController;


    @Mock
    private UserService userService;

    @Mock
    private UserEntity userEntity;


    @Test
    void findUserByEmailTest(){
        ResponseEntity<UserEntity> response = userController.findUserByEmail("email");
        Assertions.assertNotNull(response);
    }


    @Test
    void saveUserTest(){
        ResponseEntity<UserEntity> response = userController.saveUser(userEntity);
        Assertions.assertNotNull(response);
    }


}
