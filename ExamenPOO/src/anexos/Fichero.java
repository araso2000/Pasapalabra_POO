package anexos;

public class Fichero {

	public String nombre;
	public int tam;
	
	public Fichero(String nombre,int tam) {
		if(nombre!=null) {
			this.nombre=nombre;
		}else {
			this.nombre="sin nombre";
		}
		if(tam>=0) {
			this.tam=tam;
		}		
	}
	
	public void setTam(int tam) {
		this.tam=tam;
	}
	
	public String getNombre() {
		return(this.nombre);
	}
	
	public int getTam() {
		return(this.tam);
	}
	
	public static boolean iguales(Fichero nom1,Fichero nom2) {
		if(nom1.getNombre().toLowerCase().equals(nom2.getNombre().toLowerCase())) {
			return(true);
		}else {
			return(false);
		}
	}
}
