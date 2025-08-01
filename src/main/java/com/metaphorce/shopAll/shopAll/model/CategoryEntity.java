package com.metaphorce.shopAll.shopAll.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;
}
