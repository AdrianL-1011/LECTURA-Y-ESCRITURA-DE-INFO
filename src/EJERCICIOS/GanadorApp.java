package EJERCICIOS;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GanadorApp {
	public static void main(String[] args) {
		final String FICHERO1 = "jugador1.dat";
		final String FICHERO2 = "jugador2.dat";
		Jugador jugador1 = new Jugador(3, "Pablo", 4);
		Jugador jugador2 = new Jugador(2, "Carlos", 1);
		Jugador jugador3 = new Jugador(7, "Adrian", 9);
		Jugador jugador4 = new Jugador(9, "Hugo", 2);
		Jugador jugador5 = new Jugador(8, "Noah", 7);

		ArrayList<Jugador> jugadores1 = new ArrayList<>();
		jugadores1.add(jugador1);
		jugadores1.add(jugador2);
		jugadores1.add(jugador3);

		ArrayList<Jugador> jugadores2 = new ArrayList<>();
		jugadores2.add(jugador4);
		jugadores2.add(jugador5);

		for (Jugador j : jugadores1) {
			System.out.println(j);
		}
		for (Jugador j : jugadores2) {
			System.out.println(j);
		}
		try (ObjectOutputStream datos_jugador1 = new ObjectOutputStream(new FileOutputStream(FICHERO1))) {

			for (Jugador j : jugadores1) {
				datos_jugador1.writeObject(j);
			}
			System.gc();

			try (ObjectOutputStream datos_jugador2 = new ObjectOutputStream(new FileOutputStream(FICHERO1))) {
				for (Jugador j : jugadores2) {
					datos_jugador2.writeObject(j.toString());
				}
				System.gc();
			}
			Jugador maxPuntos1 = jugadores1.get(0);
			try (ObjectInputStream puntuacion_jugador1 = new ObjectInputStream(new FileInputStream(FICHERO1))) {
				for (Jugador j : jugadores1) {
					if (j.getValor_puntuacion() > maxPuntos1.getValor_puntuacion()) {
						j = maxPuntos1;
					}
				}
				System.out.println("El jugador con mas puntuacion es " + maxPuntos1);
			}
			Jugador maxPuntos2 = jugadores2.get(0);
			try (ObjectInputStream puntuacion_jugador1 = new ObjectInputStream(new FileInputStream(FICHERO1))) {
				for (Jugador j : jugadores1) {
					if (j.getValor_puntuacion() > maxPuntos2.getValor_puntuacion()) {
						j = maxPuntos2;
					}
				}
				System.out.println("El jugador con mas puntuacion es " + maxPuntos2);
			}
		} catch (IOException ioe) {
			System.out.println("ERROR Escritura:" + ioe);
		}
	}
	public static Jugador jugador_maxpuntuacion(String fichero) {
		Jugador jmax_puntuacion =null;
		try (ObjectInputStream datos_jugador = new ObjectInputStream(new FileInputStream(fichero))) {
			if (fichero.length() == 0) {
                System.out.println("El archivo está vacío.");
                return null;
            }
			ArrayList<Jugador>lista = (ArrayList<Jugador>) datos_jugador.readObject();
			for (Jugador j: lista) {
				if (jmax_puntuacion == null || j.getValor_puntuacion() > jmax_puntuacion.getValor_puntuacion()) {
					jmax_puntuacion = j ;
                }
			}
		}catch (IOException ioe) {
			System.out.println("ERROR Escritura:" + ioe);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jmax_puntuacion;
	}
	
	}

