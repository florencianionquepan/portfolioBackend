
package com.florencianionquepan.portfolio.Security.Service;

import com.florencianionquepan.portfolio.Security.Entity.Rol;
import com.florencianionquepan.portfolio.Security.Enums.RolNombre;
import com.florencianionquepan.portfolio.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository IRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return IRolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        IRolRepository.save(rol);
    }
}
