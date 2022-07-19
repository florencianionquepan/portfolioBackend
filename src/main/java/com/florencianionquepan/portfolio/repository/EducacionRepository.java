
package com.florencianionquepan.portfolio.repository;

import com.florencianionquepan.portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long> {
    
}
