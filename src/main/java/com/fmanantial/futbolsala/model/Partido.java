
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="partidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Partido {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;    
    
    Long idLocal;
    Long idVisitante;
    
    int nro_goles_local;
    int nro_goles_visitante;
    
}
