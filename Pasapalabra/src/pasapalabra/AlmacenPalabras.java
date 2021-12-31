package pasapalabra;

import java.util.ArrayList;

public class AlmacenPalabras {
	
	ArrayList<ArrayList<Palabra>> palabras;
	Abecedario abc;
	
	public AlmacenPalabras() {
		this.palabras=new ArrayList<ArrayList<Palabra>>();
		this.abc=new Abecedario();
		for(int ii=0;ii<24;ii++) {
			this.palabras.add(new ArrayList<Palabra>());
		}
	}
	
	public boolean añadirPalabra(String palabra,String definicion) {
		char inicial = palabra.charAt(0);
		if(!comprobar(palabra)) {
			palabras.get(abc.indice(inicial)).add(new Palabra(palabra,definicion));
			return(true);
		}else {
			return(false);
		}
	}
	
	public boolean comprobar(String palabra) {
		palabra=palabra.toLowerCase();
		char inicial = palabra.charAt(0);
		ArrayList<Palabra> temp = palabras.get(abc.indice(inicial));
		
		boolean existe = false;
		
		for(int ii=0;ii<temp.size();ii++) {
			if(temp.get(ii).getPalabra().equals(palabra)) {
				existe=true;
			}
		}
		return(existe);
	}
	
	public ArrayList<Palabra> getArray(int num){
		return(palabras.get(num));
	}

}
