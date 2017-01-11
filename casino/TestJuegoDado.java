package casino;
import menu.Menu;
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
public class TestJuegoDado {
	/**
	 * Juego del dado
	 */
	private static JuegoDado juego;
	
	public static void main(String[] args) {
		int opcion;
		Menu menu = new Menu("*** JUEGO DEL DADO ***", new String[] {"Jugar","Salir"});
		
		do {
			opcion = menu.gestionar();
			gestionarOpciones(opcion);
		} while (opcion != 2);
			
	}
	
	/**
	 * Gestiona las opciones del juego
	 * @param opcion
	 */
	private static void gestionarOpciones(int opcion) {
		switch (opcion) {
			case 1:
				juego = new JuegoDado(new int[2]);
				juego.jugar();
				break;
			case 2:
				System.out.println("Adios!");
				break;
			}
	}
	
}
