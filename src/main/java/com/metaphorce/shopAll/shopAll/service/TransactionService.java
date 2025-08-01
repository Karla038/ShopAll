package com.metaphorce.shopAll.shopAll.service;

import com.metaphorce.shopAll.shopAll.model.TransactionEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;

import java.util.List;

public interface TransactionService {

    List<TransactionEntity> getTransactionsByUser(UserEntity usuario);
    TransactionEntity createTransaction(TransactionEntity transactionEntity);

}
