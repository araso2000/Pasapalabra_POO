package pasapalabra;

public class Jugador {

	private String jugador;
	private String clave;
	private int puntos;
	private boolean admin;
	private Estadisticas estad;
	
	public Jugador(String jugador,String clave) {
		this.jugador=jugador;
		this.clave=clave;
		this.admin=false;
		this.estad=new Estadisticas(this.jugador);
		this.puntos=25;
	}
	
	public Jugador(String clave) {
		this.jugador="admin";
		this.clave=clave;
		this.admin=true;
	}
	
	public void mostrarHistorial() {
		estad.mostrarEstadisticas();
	}
	
	public void guardarPartida(boolean ganada,boolean empate,int puntos) {
		this.puntos=this.puntos+puntos;
		estad.guardarPartida(ganada, empate, puntos);
	}
	
	public String[] getDatos() {
		String[] temp = {this.jugador,this.clave};
		return(temp);
	}
	
	public int getPuntos() {
		return(this.puntos);
	}
	
	public int getGanadas() {
		return(this.estad.getGanadas());
	}
	
	public void setPuntosEntrenamiento() {
		this.puntos=this.puntos+5;
	}
}
