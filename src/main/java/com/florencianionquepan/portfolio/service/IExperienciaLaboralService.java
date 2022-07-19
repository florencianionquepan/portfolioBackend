
package com.florencianionquepan.portfolio.service;

import com.florencianionquepan.portfolio.model.ExperienciaLaboral;
import java.util.List;


public interface IExperienciaLaboralService {
    
    public List <ExperienciaLaboral> verExperiencia();
    
    public void crearExperiencia(ExperienciaLaboral exp);
    
    public void borrarExperiencia (Long idExp);
    
    public ExperienciaLaboral buscarExperiencia (Long idExp);
    
    public void modificarExperiencia (ExperienciaLaboral exp);
    
}
