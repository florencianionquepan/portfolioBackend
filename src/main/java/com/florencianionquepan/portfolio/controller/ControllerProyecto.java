
package com.florencianionquepan.portfolio.controller;

import com.florencianionquepan.portfolio.model.Proyecto;
import com.florencianionquepan.portfolio.service.IProyectoService;
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
public class ControllerProyecto {
    
    @Autowired
    private IProyectoService proyServ;
    
    @GetMapping ("/verProyecto")
    @ResponseBody
    public List <Proyecto> verProyectos(){
        return proyServ.verProyectos();
    }
    
    @PostMapping("/newProyecto")
    public void agregarProyecto(@RequestBody Proyecto pro){
        proyServ.crearProyecto(pro);
    }
    
    @DeleteMapping("/deleteProyecto/{idProyecto}")
    public void borrarProyecto(@PathVariable Long idProyecto){
        proyServ.borrarProyecto(idProyecto);
    }
    
    @GetMapping("/buscarProyecto/{idProyecto}")
    public Proyecto obtenerProyecto(@PathVariable Long idProyecto){
        return proyServ.buscarProyecto(idProyecto);
    }

    @PutMapping("/modificarProyecto")
    public void modificarProyecto(@RequestBody Proyecto pro){
        proyServ.modificarProyecto(pro);
    }
    
    
    
    
}
