package com.metaphorce.shopAll.shopAll.service;


import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserEntity userEntity;

    @Test
    void findUserByEmailTest(){
        Optional<UserEntity> optionalUserEntity = userService.findUserByEmail("correo");
        Assertions.assertNotNull(optionalUserEntity);
    }

    @Test
    void saveUserTest(){
        userService.saveUser(userEntity);
        Mockito.verify(userRepository).save(userEntity);
    }


}
