package com.example.parcial2.clases;

public class Usuario {

    private String imagen;
    private String nombre;
    private String estado;
    private String tipo;

    public Usuario(String imagen, String nombre, String estado, String tipo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.estado = estado;
        this.tipo = tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
