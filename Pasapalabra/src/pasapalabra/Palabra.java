package pasapalabra;

public class Palabra {
	
	private char inicial;
	private String palabra;
	private boolean acertada,fallada,aplazada;
	private String definicion;
	
	public Palabra(String palabra,String definicion) {
		this.palabra=palabra.toLowerCase();
		this.definicion=definicion;
		this.inicial=this.palabra.charAt(0);
	}
	
	public String getPalabra() {
		return(this.palabra);
	}
	
	public char getInicial() {
		return(this.inicial);
	}
	
	public String getDefinicion() {
		return(this.definicion);
	}
	
	public void modDefinicion(String definicion) {
		this.definicion=definicion;
	}
	
	public void modPalabra() {
		this.palabra=palabra;
		this.inicial=this.palabra.charAt(0);
	}
	
	public void mostrarTodo() {
		System.out.println("Inicial: " + this.inicial + "");
	}
	
	public Palabra getObject() {
		return(this);
	}
	
	public boolean[] getEstado() {
		boolean temp[] = {this.acertada,this.aplazada,this.fallada};
		return temp;
	}
	
	public void setAcertada() {
		this.acertada=true;
	}
	
	public void setAplazada() {
		this.aplazada=true;
	}
	
	public void setFallada() {
		this.fallada=true;
	}
}
