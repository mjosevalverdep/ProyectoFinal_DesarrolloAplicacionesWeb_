package com.Proyecto_IQ23.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "resena")
public class Resena implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResena;
    String nombre;
    String destino;
    String descripcion;
    int puntuacion;

    public Resena() {
    }

    public Resena(Long idResena, String nombre, String destino, String descripcion, int puntuacion) {
        this.idResena = idResena;
        this.nombre = nombre;
        this.destino = destino;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
    }
}
