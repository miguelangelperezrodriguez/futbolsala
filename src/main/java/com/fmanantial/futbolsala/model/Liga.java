
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="ligas")
public class Liga {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)            
    Long id;
    
    //Calendario calendarioLiga;
    
    
}
