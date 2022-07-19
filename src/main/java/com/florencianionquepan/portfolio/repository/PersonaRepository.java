
package com.florencianionquepan.portfolio.repository;

import com.florencianionquepan.portfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
