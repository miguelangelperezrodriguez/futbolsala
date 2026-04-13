
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="jugadores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jugador {
    
    // Clave Primaria
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
   
    private String nombre;
    private String apellidos;
    
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition="VARCHAR(255) DEFAULT 'OTRA'")
    private DemarcacionJugador demarcacion;
    
    private Integer nrogoles;
    private Integer valoracion;
    
}
