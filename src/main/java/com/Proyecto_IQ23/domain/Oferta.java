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
@Table(name = "ofertas")
public class Oferta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOferta;
    String nombreLugar;
    String localidad;
    String descripcion;
    int precio;

    public Oferta() {
    }

    public Oferta(String nombreLugar, String localidad, String descripcion, int precio) {
        this.nombreLugar = nombreLugar;
        this.localidad = localidad;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
