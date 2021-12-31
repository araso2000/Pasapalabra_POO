package pasapalabra;

import java.time.LocalDateTime;

public class Partida {

	private int precio,numPalabras;
	private LocalDateTime fecha;
	
	public Partida(LocalDateTime fecha) {
		this.fecha=fecha;
	}
	
	public void jugar() {
		this.fecha = LocalDateTime.now();
	}
}
