
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
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
    
    private LocalDateTime fechahoraPartido;
    
    int nro_goles_local;
    int nro_goles_visitante;
   
    // Lista de dos equipos
    @ManyToMany
    @JoinTable(name="equipos_partido")
    List<Equipo> equipos;
    
    public Partido (int golesLocal,int golesVisitante)
    {
        this.nro_goles_local = golesLocal; 
        this.nro_goles_visitante = golesVisitante;
    }
    
}
