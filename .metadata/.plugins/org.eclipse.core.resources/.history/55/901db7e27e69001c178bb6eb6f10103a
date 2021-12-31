package pasapalabra;

public class Estadisticas {
	
	private int partidasJugadas;
	private int partidasGanadas;
	private int partidasEmpatadas;
	private int partidasPerdidas;
	private int puntos;
	private String nombre;
	
	public Estadisticas(String nombre) {
		this.partidasJugadas=this.partidasGanadas=this.partidasEmpatadas=this.partidasPerdidas=this.puntos=0;
		this.nombre=nombre;
	}
	
	public void guardarPartida(boolean ganada,boolean empate,int puntos) {
		this.puntos=this.puntos+puntos;
		if(ganada && !empate) {
			this.partidasJugadas++;
			this.partidasGanadas++;
		}else if(!ganada && !empate) {
			this.partidasJugadas++;
			this.partidasPerdidas++;
		}else if(empate) {
			this.partidasJugadas++;
			this.partidasEmpatadas++;
		}
	}
	
	public void mostrarEstadisticas() {
		System.out.println("Estadisticas del jugador: " + this.nombre +"\n\t-Partidas Jugadas: " + this.partidasJugadas + "\n\t-Partidas Ganadas: " + this.partidasGanadas + "\n\t-Partidas Perdidas: " + this.partidasPerdidas + "\n\t-Partidas Empatadas: " + this.partidasEmpatadas + "\n\t-Puntos actuales: " + this.puntos);
	}
	
	public int getGanadas() {
		return(this.partidasGanadas);
	}
}
