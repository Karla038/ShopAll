package com.metaphorce.shopAll.shopAll.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDTO {

    @NotNull(message = "El nombre no puede estar vacío")
    private String nombre;

    @Email(message = "El correo debe ser un correo electrónico válido")
    @NotNull(message = "El correo no puede estar vacío")
    private String correo;

    @Size(min = 6, message = "La contraseña debe tener al menos 6 caracteres")
    private String contrasena;


    public UserDTO() {}

    public UserDTO(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
