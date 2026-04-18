
package com.fmanantial.futbolsala.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ligas")
public class Liga {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)            
    Long id;
    
    //Calendario calendarioLiga;
    @OneToOne
    Calendario calendarioLiga;
    
    @OneToMany
    List<EntradasTablaGoleadores> tablaGoleadores;
    
    @OneToMany
    List<EntradasTablaClasificacion> tablaClasificacion;

    
}
