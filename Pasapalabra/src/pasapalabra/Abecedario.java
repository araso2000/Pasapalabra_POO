package pasapalabra;

import java.util.ArrayList;

public class Abecedario {
	
	private ArrayList<Constantes> letras;
		
	public Abecedario() {
		letras = new ArrayList<Constantes>();
		int array[] = {0,1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20,21,23,24,25};
		for(int ii=0;ii<24;ii++) {
			letras.add(new Constantes(ii,(char)('a'+array[ii])));
		}
	}
	
	public ArrayList<Constantes> getAbecedario(){
		return(this.letras);
	}
	
	public int indice(char letra) {
		int indice = -1;
		for(int ii=0;ii<letras.size();ii++) {
			if(letra==this.letras.get(ii).getLetra()) {
				indice = this.letras.get(ii).getNumero();
			}
		}
		return(indice);
	}
}
