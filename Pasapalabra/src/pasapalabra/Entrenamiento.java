package pasapalabra;

import java.util.Scanner;

public class Entrenamiento {

	private Jugador j1;
	private Rosco r1;
	private int numeroLetras;
	
	public Entrenamiento(Jugador j,int num,AlmacenPalabras almacen) {
		this.j1=j;
		r1 = new Rosco(num,almacen);
		this.numeroLetras=num;
	}
	
	public void jugar() {
		Scanner scan = new Scanner(System.in);
		if(j1.getPuntos()<=0) {
			j1.setPuntosEntrenamiento();
		}
		System.out.println("*Rosco de hoy*");
		imprimirRosco();
		
		for(int ii=0;ii<numeroLetras;ii++) {
			System.out.println("Letra " + ii+1 + ": " + r1.getRosco()[ii].getInicial() + " - Definición: " + r1.getRosco()[ii].getDefinicion());
			int opt=0;
			while(opt==0) {
				System.out.println("1.Contestar - 2.Aplazar");
				opt = scan.nextInt();
				if(opt!=1 && opt!=2) {
					System.out.println("Opcion INCORRECTA");
				}
			}
			
			if(opt==1) {
				System.out.println("Introduce palabra: ");
				String pal = scan.nextLine();
				if(pal.equals(r1.getRosco()[ii].getPalabra())) {
					System.out.println("CORRECTO =)");
					r1.getRosco()[ii].setAcertada();
				}else {
					System.out.println("INCORRECTO =(");
					r1.getRosco()[ii].setFallada();
				}
			}else {
				System.out.println("PASAPALABRA --> Siguiente letra...");
			}
		}
	}
	
	public void imprimirRosco() {
		char temp[] = new char[24];
		for(int ii=0;ii<24;ii++) {
			temp[ii]=0;
		}
		for(int ii=0;ii<numeroLetras;ii++) {
			if(r1.getRosco()[ii].getEstado()[0]) {
				temp[ii]=3;
			}else if(r1.getRosco()[ii].getEstado()[1]) {
				temp[ii]=2;
			}else if(r1.getRosco()[ii].getEstado()[0]) {
				temp[ii]=1;
			}else {
				temp[ii]=r1.getRosco()[ii].getInicial();
			}
		}
		
		System.out.println("     " + temp[23] + temp[0]);
		System.out.println("    " + temp[22] + " " + temp[1]);
		System.out.println("   " + temp[21] + "  " + temp[2]);
		System.out.println("  " + temp[20] + "   " + temp[3]);
		System.out.println(" " + temp[19] + "    " + temp[4]);
			 System.out.println(temp[18] + "     " + temp[5]);
			 System.out.println(temp[17] + "     " + temp[6]);
		System.out.println(" " + temp[16] + "    " + temp[7]);
		System.out.println("  " + temp[15] + "   " + temp[8]);
		System.out.println("   " + temp[14] + "  " + temp[9]);
		System.out.println("    " + temp[13] + " " + temp[10]);
		System.out.println("     " + temp[12] + temp[11]);
	}
}
