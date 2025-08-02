package com.metaphorce.shopAll.shopAll.service;

import com.metaphorce.shopAll.shopAll.model.TransactionEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<TransactionEntity> getTransactionsByUser(UserEntity usuario) {
        return transactionRepository.findByUsuario(usuario);
    }

    @Override
    public TransactionEntity createTransaction(TransactionEntity transactionEntity) {
        return transactionRepository.save(transactionEntity);
    }
}
