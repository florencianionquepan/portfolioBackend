
package com.florencianionquepan.portfolio.repository;

import com.florencianionquepan.portfolio.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository <Tecnologia, Long> {
    
}
