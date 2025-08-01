package com.metaphorce.shopAll.shopAll.model;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private double precio;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoryEntity categoria;  // Relación con la categoría

    @ManyToOne
    @JoinColumn(name = "vendedor_id")
    private UserEntity vendedor; // Relación con el vendedor

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public CategoryEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoryEntity categoria) {
        this.categoria = categoria;
    }

    public UserEntity getVendedor() {
        return vendedor;
    }

    public void setVendedor(UserEntity vendedor) {
        this.vendedor = vendedor;
    }
}
