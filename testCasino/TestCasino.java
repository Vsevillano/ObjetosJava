package testCasino;

import casino.Dado;
import menu.Menu;
/**
 * Implementa la clase TestDado() para probar la clase Dado: 
 * Mediante un menú se lanza el dado tantas veces como se quiera, mostrándose su valor. 
 * Tendrás al menos las clases:
 * a. casino.Dado.java, 
 * b.testCasino.TestDado.java, 
 * c. utiles.Menu.java. 
 * Deberás crear al menos un menú con al menos las opciones “lanzar dado” y “salir”
 * 
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class TestCasino {
	/**
	 * Dado para el juego
	 */
	static Dado dado;

	public static void main(String[] args) {
		Menu menu = new Menu("Test Dado", new String[] { "Lanzar dado", "Salir" });
		int opcion;
		do {
			opcion = menu.gestionar();
			gestionarOpciones(opcion);
		} while (opcion != 2);
	}

	/**
	 * Gestiona las opciones del menu
	 * 
	 * @param opcion
	 *            Entero con la opcion seleccionada
	 */
	private static void gestionarOpciones(int opcion) {
		switch (opcion) {
		case 1:
			dado = new Dado();
			dado.lanzar();
			System.out.println(dado);
			break;
		case 2:
			System.out.println("Adios!");
			break;
		}
	}
}
