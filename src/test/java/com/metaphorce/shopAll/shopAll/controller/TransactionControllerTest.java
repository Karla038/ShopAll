package com.metaphorce.shopAll.shopAll.controller;


import com.metaphorce.shopAll.shopAll.model.TransactionEntity;
import com.metaphorce.shopAll.shopAll.service.TransactionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TransactionControllerTest {

    @InjectMocks
    private TransactionController transactionController;


    @Mock
    private TransactionService transactionService;

    @Mock
    private TransactionEntity transactionEntity;

    @Test
    void getTransactionsByUserTest(){
        ResponseEntity<List<TransactionEntity>> response = transactionController.getTransactionsByUser(1);
        Assertions.assertNotNull(response);
    }

    @Test
    void createTransactionTest(){
        ResponseEntity<TransactionEntity> response = transactionController.createTransaction(transactionEntity);
        Assertions.assertNotNull(response);
    }


}
