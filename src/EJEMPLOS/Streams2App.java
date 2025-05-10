package EJEMPLOS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Streams2App {

public static void main(String[] args) {
// EJEMPLO: BufferedReader
// Mostrar la primera linea de un fichero de texto.
final String FICHERO = "prueba";
try (FileReader fichero = new FileReader(FICHERO);
BufferedReader br = new BufferedReader(fichero)) {

// Muestra solo la primera linea ¿y si solo mostrar la 2º linea?
String linea = br.readLine();
linea = br.readLine();
System.out.println("2º"+linea);
if(linea != null) {
System.out.println("3º"+linea);
}else {
System.out.println("3º NO HAY");
}
//EJERCICIO: Contar las palabras de la 2ºlinea
int cPals=0;
String [] palabras = linea.split("\\s+");
cPals = palabras.length;
System.out.printf("Nº Caracteres %d%n",linea.length());
System.out.printf("Nº Palabras: %d%n",cPals);
} catch (IOException ioe) {
System.out.println("ERROR E/S:" + ioe);
}
//EJEMPLO: BufferesWriter
//Escribir varias lineas de texto
try(
  BufferedWriter bw = new BufferedWriter(new FileWriter("resultado.txt"))){
System.out.println("Generando html...");
bw.write("<ul>");
bw.newLine();
bw.write("<li>Item 2</li>");
bw.newLine();
bw.write("<ul>");
bw.newLine();
//EJERCICIO: Hacer copia exacta del fichero index.html
// y añadir al final un footer con el total de líneas
// y de caracteres, fecha actual y vuestro nombre
// Fecha actual
LocalDateTime fecha = LocalDateTime.now();
    bw.write("Fecha: " + fecha + "<br>");
    bw.newLine();

    // Tu nombre
    bw.write("Autor: Adrian");
    bw.newLine();
    bw.write("</footer>");
    bw.newLine();

    System.out.println("Copia completada con footer añadido.");

System.out.println("[Hecho]");
}catch(IOException ioe) {
System.out.println("ERROR E/S:"+ioe);
}
}
}

