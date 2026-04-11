
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.HashMap;


@Entity
@Table(name="tablagoleadores")
public class TablaGoleadores {

    @Id
    Long idJugador;
    
    int posicion;
    int nro_goles;
    
    
}
