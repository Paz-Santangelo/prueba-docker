package com.pruebaDeLuigi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoDto {
    
    private String nombre;

    private Float precio;

    public ProductoDto() {
    }

    public ProductoDto(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}
