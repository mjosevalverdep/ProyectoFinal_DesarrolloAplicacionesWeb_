package com.Proyecto_IQ23.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
    private String rutaImagen;

    public Tour() {
    }

    public Tour(String tipo, String localidad, String descripcion, int precio, String rutaImagen) {
        this.tipo = tipo;
        this.localidad = localidad;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
    }
}
