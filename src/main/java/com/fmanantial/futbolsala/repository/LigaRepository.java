
package com.fmanantial.futbolsala.repository;

import com.fmanantial.futbolsala.model.Liga; // Importa tu entidad
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Anotación opcional pero recomendada [4]
public interface LigaRepository extends JpaRepository<Liga, Long> {                
    // Ya incluye métodos como save, findAll, findById, delete
}


