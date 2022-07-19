
package com.florencianionquepan.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologia {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idTec;
    private String nombre;
    private String aniosExperiencia;
    private String urlLogo;

    public Tecnologia() {
    }

    public Tecnologia(Long idTec, String nombre, String aniosExperiencia, String urlLogo) {
        this.idTec = idTec;
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
        this.urlLogo = urlLogo;
    }
    
}
