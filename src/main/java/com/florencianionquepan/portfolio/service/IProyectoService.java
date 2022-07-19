
package com.florencianionquepan.portfolio.service;

import com.florencianionquepan.portfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verProyectos();
    
    public void crearProyecto(Proyecto proy);
    
    public void borrarProyecto(Long idProyecto);
    
    public Proyecto buscarProyecto (Long idProyecto);
    
    public void modificarProyecto (Proyecto proy);
    
}
