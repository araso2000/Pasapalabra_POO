package texto;

import anexos.Fichero;

public class Mensaje {
	
	public String titulo,textoPrincipal;
	public Fichero f1,f2;
	
	public Mensaje(Fichero f1,Fichero f2,String titulo,String texto) {
		if(titulo!=null || !Fichero.iguales(f1, f2)) {
			this.f1=f1;
			this.f2=f2;
			this.titulo=titulo;
			this.textoPrincipal=texto;
		}
	}
	
	public Mensaje(Mensaje men) {
		this.f1=men.getF1();
		this.f2=men.getF2();
		this.titulo=men.getTitulo();
		this.textoPrincipal="COPIA " + men.getTexto();
	}
	
	public Fichero getF1() {
		return(this.f1);
	}
	
	public Fichero getF2() {
		return(this.f2);
	}
	
	public String getTitulo() {
		return(this.titulo);
	}
	
	public String getTexto() {
		return(this.textoPrincipal);
	}
}
