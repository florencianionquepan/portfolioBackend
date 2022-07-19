
package com.florencianionquepan.portfolio.model;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private String nacionalidad;
    private String ubicacion;
    private String telefono;
    private String mail;
    private String  posicion;
    private String sobreMi;
    private String urlFoto;
    private String urlFondo;

    public Persona() {
    }

    public Persona(Long idPersona, String nombre, String apellido, String fechaNac, String nacionalidad, String ubicacion, String telefono, String mail, String posicion, String sobreMi, String urlFoto, String urlFondo) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.mail = mail;
        this.posicion = posicion;
        this.sobreMi = sobreMi;
        this.urlFoto = urlFoto;
        this.urlFondo = urlFondo;
    }
    
    
/**    //Aca voy a crear las listas de experiencia, educacion, proyectos, tecnologias:
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idTec")
    private List<Tecnologia> TecnologiaLista;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idExp")
    private List<ExperienciaLaboral> ExperienciaLista;
    
     @OneToMany(fetch=FetchType.LAZY, mappedBy="idEdu")
    private List<Educacion> EducacionLista;
    
         @OneToMany(fetch=FetchType.LAZY, mappedBy="idProyecto")
    private List<Proyecto> ProyectoLista;
    
    */
}
