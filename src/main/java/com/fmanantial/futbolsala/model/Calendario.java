
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="calendario")
public class Calendario {
    
    @Id         
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idLiga;
    
    //ArrayList<Partido> partidosPlaneados;

    @ManyToMany
    @JoinTable(name="partidos_calendario")
    Set<Partido> partidosLiga;
   
}
