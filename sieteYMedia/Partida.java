package sieteYMedia;

import utiles.Teclado;

public class Partida {
	private Jugador[] jugadores;
	private final double PUNTUACION_MAXIMA = 7.5;
	private Baraja baraja;
	double[] puntuacion = new double[2];

	/**
	 * Constructor de la partida
	 * @param jugadores Array con el numero de jugadores
	 */
	public Partida(Jugador[] jugadores) {
		setJugadores(jugadores);
		baraja = new Baraja();
	}
	
	/**
	 * Modifica el estado de jugadores 
	 * @param jugadores
	 */
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	
	/**
	 * Juega la partida. Saca carta y suma puntuaciones
	 */
	public void jugar() {

		for (int i = 0; i < jugadores.length; i++) {
			System.out.println("Es el turno de " + jugadores[i]);
			do {
				Carta mano = baraja.darMano();
				if (mano == null)
					break;
				System.out.println(mano.toString());
				puntuacion[i] += mano.getValor();
				if (puntuacion[i] > PUNTUACION_MAXIMA)
					System.out.println("\n" + puntuacion[i] + " . Te has pasado!");
				else
					System.out.println("\nPuntuacion: " + puntuacion[i]);
					
			} while (puntuacion[i] <= PUNTUACION_MAXIMA && continuar());
		}
	}

	/**
	 * Compara la puntuacion de ambos jugadores
	 * @param jugadores
	 * @param puntuacion
	 */
	public String compararPuntuacion(Jugador[] jugadores) {
		Jugador ganador = null;
		for (int i = 0; i < jugadores.length; i++) {
			if (puntuacion[0] > PUNTUACION_MAXIMA && puntuacion[1] > PUNTUACION_MAXIMA) {
				return "Ambos pierden";
			}
			if (puntuacion[0] <= PUNTUACION_MAXIMA && puntuacion[1] <= PUNTUACION_MAXIMA && puntuacion[0] > puntuacion[1])
				ganador =  jugadores[0];
			else if (puntuacion[0] <= PUNTUACION_MAXIMA && puntuacion[1] <= PUNTUACION_MAXIMA && puntuacion[0] < puntuacion[1])
				ganador = jugadores[1];
			else if (puntuacion[0] > PUNTUACION_MAXIMA && puntuacion[1] <= PUNTUACION_MAXIMA) 
				ganador = jugadores[1];
			else if (puntuacion[1] > PUNTUACION_MAXIMA && puntuacion[0] <= PUNTUACION_MAXIMA)
				ganador = jugadores[0];
		}
		return "Gana " + ganador;
	}

	/**
	 * Devuelve true en funcion de S y false en funcion de N
	 * @return
	 */
	private static boolean continuar() {
		char c;
		do {
			c = Character.toUpperCase(Teclado
					.leerCaracter("¿Desea continuar? (S/N)"));
		} while (c != 'S' && c != 'N');
		return c == 'S' ? true : false;
	}
}
