package com.metaphorce.shopAll.shopAll.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class CarDTO {

    @NotNull(message = "El usuario no puede ser nulo")
    private Integer usuarioId;

    @NotNull(message = "El producto no puede ser nulo")
    private Integer productoId;

    @Min(value = 1, message = "La cantidad debe ser al menos 1")
    private int cantidad;


    public CarDTO() {}

    public CarDTO(Integer usuarioId, Integer productoId, int cantidad) {
        this.usuarioId = usuarioId;
        this.productoId = productoId;
        this.cantidad = cantidad;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
