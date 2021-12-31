package texto;

import anexos.Fichero;

public class Buzon {

	public Mensaje array[];
	public int contador;
	
	public Buzon() {
		this.array=new Mensaje[100];
		contador=0;
	}
	
	public void nuevoMensaje(Fichero f1,Fichero f2,String titulo,String texto) {
		Mensaje nuevo = new Mensaje(f1,f2,titulo,texto);
		if(!this.iguales(nuevo)) {
			array[contador]=nuevo;
			contador++;
		}	
	}
	
	public boolean iguales(Mensaje temp) {
		boolean iguales=false;
		for(int ii=0;ii<100;ii++) {
			if(temp.getF1()==array[ii].getF1() && temp.getF2()==array[ii].getF2() && temp.getTitulo()==array[ii].getTitulo() && temp.getTexto()==array[ii].getTexto()) {
				iguales=true;
			}
		}
		return(iguales);
	}
}
