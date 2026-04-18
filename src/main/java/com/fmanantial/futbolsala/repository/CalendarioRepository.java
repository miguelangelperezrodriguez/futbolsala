
package com.fmanantial.futbolsala.repository;

import com.fmanantial.futbolsala.model.Calendario; // Importa tu entidad
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Anotación opcional pero recomendada [4]
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {                
    // Ya incluye métodos como save, findAll, findById, delete
}


