package com.fmanantial.futbolsala;

import com.fmanantial.futbolsala.model.Calendario;
import com.fmanantial.futbolsala.model.EntradasTablaClasificacion;
import com.fmanantial.futbolsala.model.EntradasTablaGoleadores;
import com.fmanantial.futbolsala.model.Equipo;
import com.fmanantial.futbolsala.model.Jugador;
import com.fmanantial.futbolsala.model.Liga;
import com.fmanantial.futbolsala.model.Partido;
import com.fmanantial.futbolsala.repository.CalendarioRepository;
import com.fmanantial.futbolsala.repository.EntradasTablaClasificacionRepository;
import com.fmanantial.futbolsala.repository.EntradasTablaGoleadoresRepository;
import com.fmanantial.futbolsala.repository.EquipoRepository;
import com.fmanantial.futbolsala.repository.JugadorRepository;
import com.fmanantial.futbolsala.repository.LigaRepository;
import com.fmanantial.futbolsala.repository.PartidoRepository;
import java.util.List;
import java.util.Set;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FutbolsalaApplication {

	public static void main(String[] args) {
        

        var context = SpringApplication.run(FutbolsalaApplication.class,args);
        // Abrir repositorios
        JugadorRepository repositorioJugadores = context.getBean(JugadorRepository.class);
        EquipoRepository  repositorioEquipos = context.getBean(EquipoRepository.class);
        PartidoRepository repositorioPartidos = context.getBean(PartidoRepository.class);
        CalendarioRepository repositorioCalendario = context.getBean(CalendarioRepository.class);
        LigaRepository repositorioLiga = context.getBean(LigaRepository.class);
        EntradasTablaClasificacionRepository repclasificacion = context.getBean(EntradasTablaClasificacionRepository.class);
        EntradasTablaGoleadoresRepository repgoleadores = context.getBean(EntradasTablaGoleadoresRepository.class);
        
        // Datos de prueba
        Jugador jugador1 = new Jugador("Miguel");
        Jugador jugador2 = new Jugador("Luis");
        Jugador jugador3 = new Jugador("Marcos");
        
        Set<Jugador> ljugadores = Set.of(jugador1,jugador2,jugador3);
        
        repositorioJugadores.save(jugador1);
        repositorioJugadores.save(jugador2);
        repositorioJugadores.save(jugador3);
        
        Equipo equip1 = new Equipo ("Real Madrid");
        Equipo equip2 = new Equipo ("FC Barcelona");    
        
        equip1.setPlantilla(ljugadores);
        equip2.setPlantilla(ljugadores);        

        repositorioEquipos.save(equip1);
        repositorioEquipos.save(equip2);

        List<Equipo> lequipos = List.of(equip1,equip2);
        
        Partido partido1 = new Partido (2,5);
        Partido partido2 = new Partido (1,1);
        
        
        partido1.setEquipos(lequipos);
        partido2.setEquipos(lequipos);
        
        Set<Partido> lPartidos = Set.of(partido1,partido2);
        
        repositorioPartidos.save(partido1);
        repositorioPartidos.save(partido2);
        
        // Creamos entradas al calendario
         Calendario calendario1 = new Calendario();
         
         calendario1.setPartidosLiga(lPartidos);
         
         repositorioCalendario.save(calendario1);
        
         Liga liga1 = new Liga();
         
         liga1.setCalendarioLiga(calendario1);
         
         repositorioLiga.save(liga1);
         
         // Creamos vacios la tabla de clasificacion y de goleadores
         EntradasTablaClasificacion ent1 = new EntradasTablaClasificacion();
         ent1.setEquipo(equip1);
         repclasificacion.save(ent1);
         EntradasTablaClasificacion ent2 = new EntradasTablaClasificacion();
         ent2.setEquipo(equip2);
         repclasificacion.save(ent2);
        
         EntradasTablaGoleadores gol1 = new EntradasTablaGoleadores();
         gol1.setJugador(jugador1);
         gol1.setNro_goles(6);
         gol1.setPosicion(1);
         repgoleadores.save(gol1);
         
         
	}
        
}
