
package com.florencianionquepan.portfolio.controller;

import com.florencianionquepan.portfolio.model.ExperienciaLaboral;
import com.florencianionquepan.portfolio.service.IExperienciaLaboralService;
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
@CrossOrigin(origins= {"https://portfolio-b618d.web.app", "https://florencianionquepan.com"})
public class ControllerExpLaboral {
    @Autowired
    public IExperienciaLaboralService expServ;
    
    @GetMapping("/verExperiencia")
    @ResponseBody
    public List<ExperienciaLaboral> verExperiencias(){
        return expServ.verExperiencia();
    }

    @PostMapping("/newExperiencia")
    public void agregarExperiencia(@RequestBody ExperienciaLaboral exp){
        expServ.crearExperiencia(exp);
    }
    
    @DeleteMapping("/deleteExperiencia/{idExp}")
    public void borrarExperiencia(@PathVariable Long idExp){
        expServ.borrarExperiencia(idExp);
    }
    
    @GetMapping ("/buscarExperiencia/{idExp}")
    public ExperienciaLaboral obtenerExperiencia(@PathVariable Long idExp){
        return expServ.buscarExperiencia(idExp);
    }
    
    @PutMapping("/modificarExperiencia")
    public void modificarExperiencia(@RequestBody ExperienciaLaboral exp){
        expServ.modificarExperiencia(exp);
    }
}
