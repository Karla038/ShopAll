package com.metaphorce.shopAll.shopAll.controller;

import com.metaphorce.shopAll.shopAll.model.TransactionEntity;
import com.metaphorce.shopAll.shopAll.model.UserEntity;
import com.metaphorce.shopAll.shopAll.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tienda/transacciones")
public class TransactionController {


    @Autowired
    private TransactionService transactionService;

    // Obtener transacciones por usuario
    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<TransactionEntity>> getTransactionsByUser(@PathVariable Integer usuarioId) {
        UserEntity usuario = new UserEntity();
        usuario.setId(usuarioId);
        List<TransactionEntity> transacciones = transactionService.getTransactionsByUser(usuario);
        return ResponseEntity.ok(transacciones);
    }

    // Crear una nueva transacción
    @PostMapping("/crear")
    public ResponseEntity<TransactionEntity> createTransaction(@RequestBody TransactionEntity transactionEntity) {
        TransactionEntity nuevaTransaccion = transactionService.createTransaction(transactionEntity);
        return ResponseEntity.status(201).body(nuevaTransaccion);
    }

}
