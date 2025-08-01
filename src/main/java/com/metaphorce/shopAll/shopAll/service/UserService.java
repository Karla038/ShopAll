package com.metaphorce.shopAll.shopAll.service;

import com.metaphorce.shopAll.shopAll.model.UserEntity;

import java.util.Optional;

public interface UserService {

    Optional<UserEntity> findUserByEmail(String correo);
    UserEntity saveUser(UserEntity userEntity);

}
