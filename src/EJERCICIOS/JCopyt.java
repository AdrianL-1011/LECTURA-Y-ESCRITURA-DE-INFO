package EJERCICIOS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JCopyt {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 System.out.printf("Introduzca el nombre del fichero");
		 String nombre = teclado.nextLine();
		 String nombre_copy = nombre + "_copy";
		 String linea;
		 int car='?';
		 try(BufferedReader fichero = new BufferedReader(new FileReader (nombre));
			 BufferedWriter fcopia = new BufferedWriter(new FileWriter (nombre_copy)))
		 {
			 linea=fichero.readLine();	
			 while(linea != null) {
				 System.out.printf(linea);
				 System.out.println();
				 fcopia.write(linea);
				 fcopia.newLine();
				 linea=fichero.readLine();
			 }

		 }catch (IOException ioe){
			 System.out.println("ERROR E/S:" + ioe.getMessage()); 
			  }

}
}
