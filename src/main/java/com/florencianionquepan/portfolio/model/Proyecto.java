
package com.florencianionquepan.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idProyecto;
    private String titulo;
    private String descripcion;
    private String url;

    public Proyecto() {
    }

    public Proyecto(Long id, String titulo, String descripcion, String url) {
        this.idProyecto = idProyecto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }
    
}
