package pasapalabra;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		AlmacenPalabras palabras = new AlmacenPalabras();
		palabras.aņadirPalabra("alvaro", "me cago en dios hijoputa");
		
		
		AlmacenJugadores almacen = new AlmacenJugadores("admin");
		
		almacen.nuevoJugador("alvaro", "alvaro");
		
		Entrenamiento entrena = new Entrenamiento(almacen.buscarJugador("alvaro", "alvaro"),24,palabras);
		
		entrena.jugar();
		
		/*String temp = scan.nextLine();
		
		System.out.println("Inicial: " + temp.charAt(0));*/
		
		/*int array[] = {0,1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20,21,23,24,25};
		for(int ii=0;ii<24;ii++) {
			
			System.out.println("Numero: " + ii + " - Letra: " + (char)('a'+array[ii]));
			
		}*/
		

	}
}
