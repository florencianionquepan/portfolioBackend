
package com.florencianionquepan.portfolio.service;

import com.florencianionquepan.portfolio.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona (Long idPersona);
    
    public Persona buscarPersona (Long idPersona);
    
    public void modificarPersona(Persona per);
    
    
}
