package com.metaphorce.shopAll.shopAll.model;

import jakarta.persistence.*;

@Entity
@Table( name = "carrito")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UserEntity usuario;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private ProductEntity producto;

    private int cantidad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UserEntity usuario) {
        this.usuario = usuario;
    }

    public ProductEntity getProducto() {
        return producto;
    }

    public void setProducto(ProductEntity producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
