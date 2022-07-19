
package com.florencianionquepan.portfolio.service;

import com.florencianionquepan.portfolio.model.Tecnologia;
import com.florencianionquepan.portfolio.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class TecnologiaService implements ITecnologiaService{
     
     @Autowired 
     public TecnologiaRepository tecRepo;
     
     
    @Override
    public List<Tecnologia> verTecnologias() {
        return tecRepo.findAll();
    }

    @Override
    public void crearTecnologia(Tecnologia tec) {
        tecRepo.save(tec);
    }

    @Override
    public void borrarTecnologia(Long idTec) {
        tecRepo.deleteById(idTec);
    }

    @Override
    public Tecnologia buscarTecnologia(Long idTec) {
        return tecRepo.findById(idTec).orElse(null);
    }

    @Override
    public void modificarTecnologia(Tecnologia tec) {
       tecRepo.save(tec);
    }
    
}
