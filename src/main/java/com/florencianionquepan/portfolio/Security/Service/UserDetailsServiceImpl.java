
package com.florencianionquepan.portfolio.Security.Service;

import com.florencianionquepan.portfolio.Security.Entity.Usuario;
import com.florencianionquepan.portfolio.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario=usuarioService.getByNombreUsuario(nombreUsuario);
        return UsuarioPrincipal.build(usuario);
    }
}
