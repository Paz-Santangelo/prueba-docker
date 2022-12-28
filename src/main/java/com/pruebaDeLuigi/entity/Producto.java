package com.pruebaDeLuigi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private Float precio;

    public Producto() {
    }

    public Producto(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
}
