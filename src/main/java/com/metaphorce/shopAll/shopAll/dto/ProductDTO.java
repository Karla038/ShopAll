package com.metaphorce.shopAll.shopAll.dto;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProductDTO {

    @NotNull(message = "El nombre no puede estar vacío")
    @Size(min = 3, message = "El nombre del producto debe tener al menos 3 caracteres")
    private String nombre;

    @Size(max = 500, message = "La descripción no puede tener más de 500 caracteres")
    private String descripcion;

    @DecimalMin(value = "0.1", message = "El precio debe ser mayor que cero")
    private double precio;

    @NotNull(message = "La categoría no puede estar vacía")
    private Integer categoriaId;

    public ProductDTO() {}

    public ProductDTO(String nombre, String descripcion, double precio, Integer categoriaId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoriaId = categoriaId;
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

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }
}
