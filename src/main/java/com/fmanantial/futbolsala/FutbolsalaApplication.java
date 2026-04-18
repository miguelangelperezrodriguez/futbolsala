package com.fmanantial.futbolsala;

import com.fmanantial.futbolsala.model.Jugador;
import com.fmanantial.futbolsala.repository.EquipoRepository;
import com.fmanantial.futbolsala.repository.JugadorRepository;
import com.fmanantial.futbolsala.repository.PartidoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FutbolsalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutbolsalaApplication.class, args);
        
                
        var context = SpringApplication.run(FutbolsalaApplication.class,args);
        // Abrir repositorios
        JugadorRepository repositorioJugadores = context.getBean(JugadorRepository.class);
        EquipoRepository  repositorioEquipos = context.getBean(EquipoRepository.class);
        PartidoRepository repositorioPartidos = context.getBean(PartidoRepository.class);
                
        // Datos de prueba
        Jugador jugador1 = new Jugador("Miguel");
        Jugador jugador2 = new Jugador("Luis");
        Jugador jugador3 = new Jugador("Marcos");
                
        repositorioJugadores.save(jugador1);
        repositorioJugadores.save(jugador2);
        repositorioJugadores.save(jugador3);
        
        
        
        
                
	}
        
}
