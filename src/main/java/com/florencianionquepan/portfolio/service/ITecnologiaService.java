
package com.florencianionquepan.portfolio.service;

import com.florencianionquepan.portfolio.model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    
    public List <Tecnologia> verTecnologias();
    
    public void crearTecnologia (Tecnologia tec);
    
    public void borrarTecnologia (Long idTec);
    
    public Tecnologia buscarTecnologia (Long idTec);
    
    public void modificarTecnologia (Tecnologia tec);
    
    
}
