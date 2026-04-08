
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="jugadores")
public class Jugador {
    
    // Clave Primaria
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
   
    
    private String nombre;
    private String apellidos;
    private String demarcacion;
    private Integer nrogoles;
    private Integer valoracion;
    
    
    public Jugador()
    {
        
    }
    
   
}
