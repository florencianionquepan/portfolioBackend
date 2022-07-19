
package com.florencianionquepan.portfolio.service;

import com.florencianionquepan.portfolio.model.ExperienciaLaboral;
import com.florencianionquepan.portfolio.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService  {

    @Autowired 
    public ExperienciaLaboralRepository expRepo;
    
    @Override
    public List<ExperienciaLaboral> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(ExperienciaLaboral exp) {
       expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long idExp) {
        expRepo.deleteById(idExp);
    }

    @Override
    public ExperienciaLaboral buscarExperiencia(Long idExp) {
        return expRepo.findById(idExp).orElse(null);
    }

    @Override
    public void modificarExperiencia(ExperienciaLaboral exp) {
       expRepo.save(exp);
    }
    
}
