
package com.florencianionquepan.portfolio.controller;

import com.florencianionquepan.portfolio.model.Persona;
import com.florencianionquepan.portfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="https://portfolio-b618d.web.app")
public class ControllerPersona {
    
    @Autowired
    private IPersonaService persoServ;
   
    @GetMapping ("/verPersonas")
    @ResponseBody
    public List <Persona> verPersonas(){
        return persoServ.verPersonas();
    }

    @PostMapping("/newPersona")
    public void agregarPersona(@RequestBody Persona per){
        persoServ.crearPersona(per);
    }
    
    @DeleteMapping("/deletePersona/{idPersona}")
    public void borrarPersona(@PathVariable Long idPersona){
        persoServ.borrarPersona(idPersona);
    }
    
    @GetMapping("/buscarPersona/{idPersona}")
    public Persona obtenerPersona(@PathVariable Long idPersona){
        return persoServ.buscarPersona(idPersona);
    }
    
    @PutMapping("/modificarPersona")
    public void modificarPersona(@RequestBody Persona per){
        persoServ.crearPersona(per);
    }
    
}
