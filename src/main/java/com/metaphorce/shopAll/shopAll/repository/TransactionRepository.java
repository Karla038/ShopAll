package com.metaphorce.shopAll.shopAll.repository;

import com.metaphorce.shopAll.shopAll.model.TransactionEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {

    // Obtener transacciones por usuario
    List<TransactionEntity> findByUsuario(UserEntity usuario);

}
