package sieteYMedia;

import utiles.Teclado;

public class TestSieteYMedia {
	private static Jugador[] jugadores;
	
	public static void main(String[] args) {
		jugadores = crearJugadores();
		Partida partida = new Partida(jugadores);
		
		partida.jugar();
		System.out.println(partida.compararPuntuacion(jugadores));
	}

	private static Jugador[] crearJugadores() {
		jugadores = new Jugador[2];
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i] = new Jugador(Teclado.leerCadena("Introduzca el nombre del jugador " + (i+1)));
		}
		return jugadores;
	}

}
