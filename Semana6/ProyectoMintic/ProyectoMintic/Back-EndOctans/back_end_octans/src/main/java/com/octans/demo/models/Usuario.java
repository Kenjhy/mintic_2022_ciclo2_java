package com.octans.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity // relacionar tablas
@Table(name = "usuarios" ) // como se quiere que se llame la clase en la base de datos

public class    Usuario implements Serializable {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    private String nombre;

    private char estado;


    @ManyToOne(fetch = FetchType.LAZY)// Un rol puede tener varios usuario
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //arreglar error inicializer
    @JoinColumn(name = "id_rol")//PONER NOMBRE DEL FOREING KEY

    private Rol rol ; // llamar la tabla rol dentro de usuario







    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
