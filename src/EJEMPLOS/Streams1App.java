package EJEMPLOS;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Streams1App {
public static void main(String[]args) {
//LECTURA -CARACTERES (la Fuente es el teclado)
int car='?';
//4) Es obligatorio tratar IOException (try-catch)
try{
//1) Creo que el Stream adecuado:
InputStreamReader streamTeclado = new InputStreamReader (System.in);
//2) Leo un caracter
car=streamTeclado.read();
//3) Cierro stream
streamTeclado.close();
}catch(IOException ioe) {
System.out.println("ERROR E/S:"+ioe);
}
System.out.printf("Has tecleado %c %n",car);
// ====================================================
//EJERCICIO 1: Leer el primer caracter  de un fichero de texto
//4) Es obligatorio tratar IOException (try-catch)
try{
//1) Creo que el Stream adecuado:
FileReader streamTeclado = new FileReader ("prueba");
//2) Leo un caracter
car=streamTeclado.read();
//3) Cierro stream
streamTeclado.close();
}catch(IOException ioe) {
System.out.println("ERROR E/S:"+ioe);
}
System.out.printf("Has tecleado %c %n",car);

// =====================================================
//EJERCICIO 2: Mostrar en consola todos los caracteres de un fichero de texto.
System.out.println("Linea 42");
StringBuffer sb = new StringBuffer();
try {
FileReader streamFichero = new FileReader ("prueba");
//2) Leo tres caracter
for(int i=0;i<3;i++) {
	car=streamFichero.read();
	//Añado el caracter
	sb.append((char)car);
}
System.out.println("Estoy en la linea 53 "+ sb);
//3) Cierro stream
streamFichero.close();
}catch(IOException ioe) {
System.out.println("ERROR E/S:"+ioe);
}
System.out.printf("Has tecleado %c %n",car);



//===========================================================
//EJERCICIO 3: Mostrar en consola todos los caracteres
//de un fichero de texto.
final int EOF = -1;
try {
FileReader  streamHola = new FileReader ("prueba2");
//Leo el fichero completo
System.out.printf("%n --------------------- %n");
car = streamHola.read();
while(car != EOF) {
	System.out.printf("%c",car);
	car = streamHola.read();
}
System.out.printf("%n --------------------- %n");
}catch(IOException ioe) {
	System.out.println("Estoy en la linea 77");
	System.out.println("ERROR E/S:"+ioe);
}

//LECTURA FICHERO DE TEXTO => FileReader
//4) Es obligatorio tratar IOException (try-catch)
car='?';
//Pero lo hacemos con
//Uso try-with-resources para que se cierren automaticamente
//los "recursos" abiertos, por ej. un fichero


try(FileReader streamFichero = new FileReader ("hola")){
System.out.println("Fichero abierto");

car=streamFichero.read();
}catch(FileNotFoundException fnf){
System.out.println("ERROR E/S: Fichero no encontrado");
}catch(IOException ioe) {
System.out.println("ERROR E/S:"+ioe);

System.out.printf("Has tecleado %c %n",car);
}




//EJERCICIO 1: Copia completa de un fichero de texto
//      FileReader => "Canal" de lectura para texto
//      FileWriter => "Canal" de escritura para texto
int car1='?';
try (
FileReader entrada = new FileReader("prueba");
//De esta manera, si no existe lo crea y si existe lo sobrescribe.
//(Hay un constructor para añadir por el final si existe)
FileWriter salida = new FileWriter("prueba_copia")
){
System.out.println("Copiando...");
car1= entrada.read();
while(car1 !=-1) {
salida.write(car1);
car1=entrada.read();
}
}catch (FileNotFoundException fnf) {
System.out.println("ERROR E/S: Fichero no encontrado");
}catch (IOException ioe) {
System.out.println("ERROR E/S:"+ioe);
}
System.out.println("[Fin]");



//EJERCICIO 2: Copia completa de un fichero de texto,
//  Transformando a mayuscula lo que este en minúscula y al revés.
//  -o- Transformando el caracter en el siguiente,es decir,
//      A se transforma a B, B en C,a en b, 0 en 1,...

car1='?';
try (
FileReader entrada = new FileReader("prueba");
//De esta manera, si no existe lo crea y si existe lo sobrescribe.
//(Hay un constructor para añadir por el final si existe)
FileWriter salida = new FileWriter("prueba_copia")
){
System.out.println("Copiando...");
car1= entrada.read();
while(car1 !=-1) {
if(Character.isAlphabetic(car1)) {
salida.write(car1+1);
}
car1=entrada.read();
}
}catch (FileNotFoundException fnf) {
System.out.println("ERROR E/S: Fichero no encontrado");
}catch (IOException ioe) {
System.out.println("ERROR E/S:"+ioe);
}
System.out.println("[Fin]");
}
}

