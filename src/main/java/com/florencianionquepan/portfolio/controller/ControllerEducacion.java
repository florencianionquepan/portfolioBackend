
package com.florencianionquepan.portfolio.controller;

import com.florencianionquepan.portfolio.model.Educacion;
import com.florencianionquepan.portfolio.service.IEducacionService;
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
public class ControllerEducacion {
    
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping("/verEducacion")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return eduServ.verEducacion();
    }

    @PostMapping("/newEducacion")
    public void agregarEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @DeleteMapping("/deleteEducacion/{idEducacion}")
    public void borrarEducacion(@PathVariable Long idEducacion){
        eduServ.borrarEducacion(idEducacion);
    }
    
        @GetMapping("/buscarEducacion/{idEducacion}")
    public Educacion obtenerEducacion(@PathVariable Long idEducacion){
        return eduServ.buscarEducacion(idEducacion);
    }
    
    @PutMapping("/modificarEducacion")
    public void modificarEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    
    
}
