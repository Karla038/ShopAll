package com.metaphorce.shopAll.shopAll.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDTO {

    @NotNull(message = "El usuario no puede ser nulo")
    private Integer usuarioId;

    @NotNull(message = "La lista de productos no puede estar vacía")
    private List<Long> productosIds;

    @NotNull(message = "El total de la transacción no puede ser nulo")
    @DecimalMin(value = "0.01", message = "El total debe ser mayor que cero")
    private double total;

    @NotNull(message = "La fecha de la transacción no puede ser nula")
    private LocalDateTime fecha;

    public TransactionDTO() {}

    public TransactionDTO(Integer usuarioId, List<Long> productosIds, double total, LocalDateTime fecha) {
        this.usuarioId = usuarioId;
        this.productosIds = productosIds;
        this.total = total;
        this.fecha = fecha;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public List<Long> getProductosIds() {
        return productosIds;
    }

    public void setProductosIds(List<Long> productosIds) {
        this.productosIds = productosIds;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
