package com.metaphorce.shopAll.shopAll.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "trasaccion")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UserEntity usuario;

    @ElementCollection
    private List<Long> productosIds; // Lista de productos comprados

    private double total;
    private LocalDateTime fecha;
}
