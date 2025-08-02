package com.metaphorce.shopAll.shopAll.service;


import com.metaphorce.shopAll.shopAll.model.TransactionEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.repository.TransactionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TransactionServiceTest {

    @InjectMocks
    private TransactionServiceImpl transactionService;

    @Mock
    private TransactionRepository transactionRepository;

    @Mock
    private UserEntity userEntity;

    @Mock
    private TransactionEntity transactionEntity;

    @Test
    void getTransactionsByUserTest(){
        List<TransactionEntity> response = transactionService.getTransactionsByUser(userEntity);
        Assertions.assertNotNull(response);
    }

    @Test
    void createTransactionTest(){
        transactionService.createTransaction(transactionEntity);
        Mockito.verify(transactionRepository).save(transactionEntity);
    }


}
