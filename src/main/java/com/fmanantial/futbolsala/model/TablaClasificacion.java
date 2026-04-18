
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.HashMap;


@Entity
@Table(name="tablaclasificacion")
public class TablaClasificacion {
    
    @Id
    Long idEquipo;
    
    @OneToOne
    Liga ligaTablaClasificacion;
    
    int goles_favor;
    int goles_contra;
    int puntos;
    int posicion; 
   
    
}
