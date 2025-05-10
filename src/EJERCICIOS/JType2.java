package EJERCICIOS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JType2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Quieres el texto mayuscula (M) ,minuscula (m) o igual (i)");
		String opcion = teclado.nextLine();
		System.out.printf("Introduzca el nombre del fichero");
		String nombre = teclado.nextLine();
		String linea;
		try (BufferedReader fichero = new BufferedReader(new FileReader(nombre)))
		{
		linea = fichero.readLine();
		while (linea != null) {
			switch (opcion) {
			case "M":
				System.out.println(linea.toUpperCase());
				break;
			case "m":
				System.out.println(linea.toLowerCase());
				break;
			default: System.out.println();
			break;
			}
			linea = fichero.readLine();	
		}
		
		}catch(IOException ioe) {
			System.out.println("ERROR E/S:" + ioe.getMessage());
		}

	}
		

}
