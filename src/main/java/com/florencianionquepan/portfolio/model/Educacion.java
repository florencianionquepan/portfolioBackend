
package com.florencianionquepan.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idEdu;
    private String nombreUniversidad;
    private String ubicacion;
    private String titulo;
    private Boolean finalizado;
    private String fechaInicio;
    private String fechaFin;
    private String urlFoto;

    public Educacion() {
    }

    public Educacion(Long  idEdu, String nombreUniversidad, String ubicacion, String titulo, Boolean finalizado, String fechaInicio, String fechaFin, String urlFoto) {
        this. idEdu=  idEdu;
        this.nombreUniversidad = nombreUniversidad;
        this.ubicacion = ubicacion;
        this.titulo = titulo;
        this.finalizado = finalizado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.urlFoto = urlFoto;
    }
    
    
    
}
