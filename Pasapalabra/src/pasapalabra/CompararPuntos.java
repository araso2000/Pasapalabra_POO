package pasapalabra;

import java.util.Collections;
import java.util.Comparator;

public class CompararPuntos implements Comparator <Jugador>{

	@Override
	public int compare(Jugador o1, Jugador o2) {
		if(o1.getPuntos()>o2.getPuntos()){
            return 0;
        }else{
            return 1;
        }
	}    
}
