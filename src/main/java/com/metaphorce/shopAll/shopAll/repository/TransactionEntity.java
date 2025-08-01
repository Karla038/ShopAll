package com.metaphorce.shopAll.shopAll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface TransactionEntity extends JpaRepository<TransactionEntity, Integer> {

    // Obtener transacciones por usuario
    List<TransactionEntity> findByUsuario(UserEntity usuario);

}
