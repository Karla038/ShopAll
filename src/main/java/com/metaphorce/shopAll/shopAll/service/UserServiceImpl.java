package com.metaphorce.shopAll.shopAll.service;

import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<UserEntity> findUserByEmail(String correo) {
        return userRepository.findByCorreo(correo);
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

}
