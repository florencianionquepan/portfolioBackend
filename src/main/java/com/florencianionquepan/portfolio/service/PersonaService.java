
package com.florencianionquepan.portfolio.service;

import com.florencianionquepan.portfolio.model.Persona;
import com.florencianionquepan.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
       return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long idPersona) {
        persoRepo.deleteById(idPersona);
    }

    @Override
    public Persona buscarPersona(Long idPersona) {
         return  persoRepo.findById(idPersona).orElse(null);
    }

    @Override
    public void modificarPersona(Persona per) {
       persoRepo.save(per);
    }
    
}
