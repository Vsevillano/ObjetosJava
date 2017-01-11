package casino;
/**
 * Implementa la clase JuegoDado().
 * Consiste en lanzar el dado. Ganar� aquel que saque el mayor valor. 
 * Mediante un men� se lanza el dado tantas veces como se quiera, mostr�ndose su valor. 
 * Tendr�s al menos las clases: 
 * a.casino.Dado.java, 
 * b. casino.JuegoDado.java. Has de implementar al menos el m�todo jugar()
 * c. utiles.Menu.java. Deber�s crear al menos un men� con las opciones �jugar� y �salir� 
 * d. testCasino.TestJuegoDado.java, donde se crear� el juego
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class JuegoDado {
	/**
	 * Dado para el juego
	 */
	private Dado dado;
	
	/**
	 * Numero de jugadores
	 */
	private int[] jugadores = new int[2];
	
	/**
	 * Array donde guardaremos las puntuaciones
	 */
	private int[] puntuacion;

	/**
	 * Constructor del juego
	 * 
	 * @param jugadores
	 */
	public JuegoDado(int[] jugadores) {
		dado = new Dado();
		setJugadores(jugadores);
	}

	/**
	 * Metodo de obtencion de jugadores
	 * 
	 * @param jugadores
	 */
	public void setJugadores(int[] jugadores) {
		this.jugadores = jugadores;
	}

	/**
	 * 2 jugadores juegan al dado
	 */
	public void jugar() {
		puntuacion = new int[jugadores.length];
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println("Turno de " + (i + 1));
			dado.lanzar();
			System.out.println(dado.toString());
			puntuacion[i] += dado.getCara();
		}
		comprobarGanador();
	}

	/**
	 * Comprueba la puntuacion de dos jugadores.
	 */
	private void comprobarGanador() {
		for (int i = 0; i < puntuacion.length - 1; i++) {
			if (puntuacion[i] > puntuacion[i + 1])
				System.out.println("Gana jugador " + (i + 1));
			else if (puntuacion[i] < puntuacion[i + 1])
				System.out.println("Gana jugador " + (i + 2));
			else
				System.out.println("Empate");
		}
	}

}
