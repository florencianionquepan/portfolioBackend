
package com.florencianionquepan.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idExp;
    private String nombreEmpresa;
    private String posicion;
    private Boolean esTrabajoActual;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    private String urlFoto;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long idExp, String nombreEmpresa, String posicion, Boolean esTrabajoActual, String fechaInicio, String fechaFin, String descripcion, String urlFoto) {
        this.idExp = idExp;
        this.nombreEmpresa = nombreEmpresa;
        this.posicion = posicion;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
    }
    
    
    
}
