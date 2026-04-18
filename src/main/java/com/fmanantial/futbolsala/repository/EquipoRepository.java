
package com.fmanantial.futbolsala.repository;

import com.fmanantial.futbolsala.model.Equipo; // Importa tu entidad
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Anotación opcional pero recomendada [4]
public interface EquipoRepository extends JpaRepository<Equipo, Long> {                
    // Ya incluye métodos como save, findAll, findById, delete
}


