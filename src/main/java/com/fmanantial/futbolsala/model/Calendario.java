
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.ArrayList;


@Entity
@Table(name="calendario")
public class Calendario {
    
    @Id         
    Long idLiga;
    
    //ArrayList<Partido> partidosPlaneados;

}
