package pasapalabra;

import java.util.Comparator;

public class CompararGanadas implements Comparator <Jugador>{

	@Override
	public int compare(Jugador o1, Jugador o2) {
		if(o1.getGanadas()>o2.getGanadas()){
            return 0;
        }else{
            return 1;
        }
	}
}
