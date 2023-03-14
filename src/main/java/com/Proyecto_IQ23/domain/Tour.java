package com.Proyecto_IQ23.domain;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tours")
public class Tour implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTour;
    String tipo;
    String localidad;
    String descripcion;
    int precio;

    public Tour() {
    }

    public Tour(String tipo, String localidad, String descripcion, int precio) {
        this.tipo = tipo;
        this.localidad = localidad;
        this.descripcion = descripcion;
        this.precio = precio;
    } 
}
