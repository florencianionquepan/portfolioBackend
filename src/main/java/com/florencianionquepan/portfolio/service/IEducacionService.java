
package com.florencianionquepan.portfolio.service;

import com.florencianionquepan.portfolio.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion (Educacion edu);
    
    public void borrarEducacion (Long idEdu);
    
    public Educacion buscarEducacion (Long idEdu);
    
    public void modificarEducacion(Educacion edu);
    
    
}
