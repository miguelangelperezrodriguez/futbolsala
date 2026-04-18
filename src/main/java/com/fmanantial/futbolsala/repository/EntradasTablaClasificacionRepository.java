
package com.fmanantial.futbolsala.repository;

import com.fmanantial.futbolsala.model.EntradasTablaClasificacion; // Importa tu entidad
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Anotación opcional pero recomendada [4]
public interface EntradasTablaClasificacionRepository extends JpaRepository<EntradasTablaClasificacion, Long> {                
    // Ya incluye métodos como save, findAll, findById, delete
}


