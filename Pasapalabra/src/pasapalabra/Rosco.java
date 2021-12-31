package pasapalabra;

public class Rosco {
	
	private Palabra[] palabras;
	private AlmacenPalabras almacen;
	
	public Rosco(int numeroLetras,AlmacenPalabras almacen) {
		this.almacen=almacen;
		palabras = new Palabra[numeroLetras];
		almacen=new AlmacenPalabras();
		for(int ii=0;ii<numeroLetras;ii++) {
			palabras[ii]=almacen.getArray(ii).get((int)Math.random()*(almacen.getArray(ii).size()+1)).getObject();
		}
	}

	public Palabra[] getRosco() {
		return(palabras);
	}
}
