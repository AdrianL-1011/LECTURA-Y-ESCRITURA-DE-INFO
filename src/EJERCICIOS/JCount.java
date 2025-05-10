package EJERCICIOS;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JCount {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 String nombre = teclado.nextLine();
		 int car='?';
		 int cont=0;
try{
	 FileReader fichero = new FileReader(nombre);
	 car =fichero.read();
	 while(car != -1) {
			 car =fichero.read();
			 cont++;
			 } 

	}catch(IOException ioe) {
		System.out.println("ERROR E/S:" + ioe); 
		}
System.out.println("El nuero de caracteres que tiene el fichero es " + cont); 
	}
}

