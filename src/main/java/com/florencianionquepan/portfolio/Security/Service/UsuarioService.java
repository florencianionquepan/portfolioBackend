
package com.florencianionquepan.portfolio.Security.Service;

import com.florencianionquepan.portfolio.Security.Entity.Usuario;
import com.florencianionquepan.portfolio.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository IusuarioRepository;
    
    public Usuario getByNombreUsuario(String nombreUsuario){
        return IusuarioRepository.findByNombreUsuario(nombreUsuario).orElse(null);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
    return  IusuarioRepository. existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
    return  IusuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        IusuarioRepository.save(usuario);
    }
    
}
