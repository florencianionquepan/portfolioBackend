
package com.florencianionquepan.portfolio.service;

import com.florencianionquepan.portfolio.model.Educacion;
import com.florencianionquepan.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired 
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
       eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long idEdu) {
        eduRepo.deleteById(idEdu);
    }

    @Override
    public Educacion buscarEducacion(Long idEdu) {
       return eduRepo.findById(idEdu).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion edu) {
       eduRepo.save(edu);
    }
    
    
}
