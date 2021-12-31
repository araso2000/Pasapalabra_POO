package paquete;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String [] texto = new String[125013];
		String[] numeros = new String[125013];

	    try(FileReader fr = new FileReader("C:\\Users\\araso\\Downloads\\prueba4_round1.txt");
	            BufferedReader br = new BufferedReader(fr))
	    {
	        
	        for(int kk=0;kk<125013;kk++) {
	        	texto[kk]=br.readLine();
	        }

	    } 
	    catch (FileNotFoundException e)
	    {
	        e.printStackTrace();
	    } 
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	    
	    try(FileReader fr = new FileReader("C:\\Users\\araso\\Downloads\\file.txt");
	            BufferedReader br = new BufferedReader(fr))
	    {
	        
	        for(int kk=0;kk<125013;kk++) {
	        	numeros[kk]=br.readLine();
	        }

	    } 
	    catch (FileNotFoundException e)
	    {
	        e.printStackTrace();
	    } 
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	    
	    System.out.println(texto[0]);
	    System.out.println("...");
	    int contador = 0;
	    for(int jj=0;jj<125013;jj++) {
	    	contador=contador+1;
	    	if(!numeros[jj].equals(numeros[jj+1])) {
	    		System.out.println(texto[jj]);
	    		System.out.println(texto[jj+1]);
	    		
	    	}
	    }
	}

}

