package pasapalabra;

import java.util.ArrayList;
import java.util.Collections;

public class AlmacenJugadores {

	private ArrayList<Jugador> jugadores; 
	private Jugador admin;
	
	public AlmacenJugadores(String clave) {
		this.admin = new Jugador(clave);
		jugadores = new ArrayList<Jugador>();
		
	}
	
	public Jugador buscarJugador(String nombre,String clave){
		Jugador temp = null;
		for(int ii=0;ii<jugadores.size();ii++) {
			if(jugadores.get(ii).getDatos()[0].equals(nombre) && jugadores.get(ii).getDatos()[1].equals(clave)) {
				temp=jugadores.get(ii);
			}
		}
		return(temp);
	}
	
	public boolean nuevoJugador(String nombre,String clave) {
		if(buscarJugador(nombre,clave)!=null) {
			return(false);
		}else {
			Jugador nuevo = new Jugador (nombre,clave);
			jugadores.add(nuevo);
			return(true);
		}
	}
	
	public boolean borrarJugador(String nombre,String clave) {
		if(buscarJugador(nombre,clave)!=null) {
			jugadores.remove(buscarJugador(nombre,clave));
			return(true);
		}else {
			return(false);
		}
	}
	
	public ArrayList<Jugador> ordenarGanadas(){
		ArrayList<Jugador> array = (ArrayList<Jugador>)jugadores.clone();
        Collections.sort(array,new CompararGanadas());
        return(array);
	}
	
	public ArrayList<Jugador> ordenarPuntos(){
		ArrayList<Jugador> array = (ArrayList<Jugador>)jugadores.clone();
        Collections.sort(array,new CompararPuntos());
        return(array);
	}
	
	public boolean iniciarAdmin(String clave) {
		if(admin.getDatos()[1].equals(clave)) {
			return(true);
		}else {
			return(false);
		}
	}
	
	public void mostrarClasificacion(boolean porPuntos) {
		if(porPuntos) {
			for(int ii=0;ii<ordenarPuntos().size();ii++) {
				ordenarPuntos().get(ii).mostrarHistorial();
				System.out.println("\n\n");
			}
		}else {
			for(int ii=0;ii<ordenarGanadas().size();ii++) {
				ordenarGanadas().get(ii).mostrarHistorial();
				System.out.println("\n\n");
			}
		}
	}
}
