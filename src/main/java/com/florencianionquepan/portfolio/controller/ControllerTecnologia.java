
package com.florencianionquepan.portfolio.controller;

import com.florencianionquepan.portfolio.model.Tecnologia;
import com.florencianionquepan.portfolio.service.ITecnologiaService;
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
@CrossOrigin(origins="https://portfolio-b618d.web.app/portfolio")
public class ControllerTecnologia {
    @Autowired
    private ITecnologiaService tecServ;
    
    @GetMapping ("/verTecnologias")
    @ResponseBody
    public List <Tecnologia> verTecnologias(){
        return tecServ.verTecnologias();
    }
    
    @PostMapping("/newTecnologia")
    public void agregarTecnologia(@RequestBody Tecnologia tec){
        tecServ.crearTecnologia(tec);
    }
    
    @DeleteMapping("/deleteTecnologia/{idTecnologia}")
    public void borrarTecnologia(@PathVariable Long idTecnologia){
        tecServ.borrarTecnologia(idTecnologia);
    }
    
    @GetMapping("/buscarTecnologia/{idTecnologia}")
    public Tecnologia obtenerTecnologia(@PathVariable Long idTecnologia){
        return tecServ.buscarTecnologia(idTecnologia);
    }
    
    @PutMapping("/modificarTecnologia")
    public void modificarTecnologia(@RequestBody Tecnologia tec){
        tecServ.modificarTecnologia(tec);
    }
}
