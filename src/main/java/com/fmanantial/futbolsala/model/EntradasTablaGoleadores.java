
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.HashMap;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="tablagoleadores")
public class EntradasTablaGoleadores {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    
    @OneToOne        
    Jugador jugador;

    int posicion;
    int nro_goles;
    
    
}
