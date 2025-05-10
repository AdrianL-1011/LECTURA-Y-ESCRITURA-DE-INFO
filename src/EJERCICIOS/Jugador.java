package EJERCICIOS;


public class Jugador implements java.io.Serializable {


private static final long serialVersionUID = -8991752848226498227L;

private int numero;

private String nombre;

private int valor_puntuacion;


public Jugador(int numero,String nombre,int valor_puntuacion) {

this.numero=numero;

this.nombre=nombre;

this.valor_puntuacion=valor_puntuacion;

}

public Jugador(int numero,String nombre) {

this.valor_puntuacion=0;

}


public void SumarPuntos(int valor_puntuacion) {

this.valor_puntuacion += valor_puntuacion;

}

public int getValor_puntuacion() {

return valor_puntuacion;

}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public boolean equals(String nombre) {

return this.nombre.equals(nombre);

}

@Override

public String toString() {

return "Jugador{" +

"nombre = '" + nombre + '\'' +

", puntuacion = " + valor_puntuacion + "numero = " + numero+

'}';

}

}