
package com.florencianionquepan.portfolio.service;

import com.florencianionquepan.portfolio.model.Proyecto;
import com.florencianionquepan.portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyRepo;
    
    @Override
    public List<Proyecto> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long idProyecto) {
       proyRepo.deleteById(idProyecto);
    }

    @Override
    public Proyecto buscarProyecto(Long idProyecto) {
       return proyRepo.findById(idProyecto).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }
    
}
