package EJERCICIOS;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JType {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	 System.out.printf("Introduzca el nombre del fichero");
		 String nombre = teclado.nextLine();
		 int car='?';
 try{
	 FileReader fichero = new FileReader(nombre);
	 System.out.printf("%n --------------------- %n");
	 car =fichero.read();
	 while(car != -1) {
	System.out.printf("%c",car);
	 car =fichero.read();
	 } 
	 System.out.printf("%n --------------------- %n");
 }catch (IOException ioe){
System.out.println("ERROR E/S:" + ioe); 
 }
 
	}

}
