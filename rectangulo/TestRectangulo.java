package rectangulo;

import menu.Menu;
import utiles.Teclado;
/**
 * Crea la clase Rectangulo y su respectivo TestRectangulo que nos permita manipular una instancia de rectángulo mediante un menú.
 *  a. Un rectángulo no puede tener dimensiones negativas 
 *  b. Comprueba que el rectángulo no desaparezca (siempre un ancho y un alto mayor que cero).
 *  
 *  Cuando se convierta en cuadrado, aparecerá un mensaje que diga “Ahora soy un cuadrado”
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class TestRectangulo {
	/**
	 * Objeto rectangulo
	 */
	static Rectangulo rectangulo;

	public static void main(String[] args) {
		int opcion;
		Menu menu = new Menu("Menu del rectangulo:", new String[] { "Salir", "Crear rectangulo", "Incrementar base",
				"Decrementar base", "Incrementar altura", "Decrementar altura", "Mostrar" });
		do {
			opcion = menu.gestionar();
			gestionarOpciones(opcion);
		} while (opcion != 1);

	}

	/**
	 * Gestiona las opciones del menu
	 * 
	 * @param opcion
	 *            Entero con el numero de la opcion seleccionada
	 */
	private static void gestionarOpciones(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("Adios!");
			break;
		case 2:
			// Crea el rectangulo
			int base = pedirDato("Introduzca la base:");
			int altura = pedirDato("Introduzca la altura:");
			rectangulo = new Rectangulo(base, altura);
			break;
		case 3:
			// Incrementa base
			if (rectangulo == null) {
				System.out.println("Debes crear antes el rectangulo");
			} else {
				System.out.println(rectangulo.incBase());
			}
			break;
		case 4:
			// Decrementa base
			if (rectangulo == null) {
				System.out.println("Debes crear antes el rectangulo");
			} else {
				System.out.println(rectangulo.decBase());
			}
			break;
		case 5:
			// Incrementa altura
			if (rectangulo == null) {
				System.out.println("Debes crear antes el rectangulo");
			} else {
				System.out.println(rectangulo.incAltura());
			}
			break;
		case 6:
			// Decrementa altura
			if (rectangulo == null) {
				System.out.println("Debes crear antes el rectangulo");
			} else {
				System.out.println(rectangulo.decAltura());
			}
			break;
		case 7:
			// Muestra el rectangulo
			if (rectangulo == null) {
				System.out.println("Debes crear antes el rectangulo");
			} else {
				System.out.println(rectangulo.toString());
			}
			break;
		}
	}

	/**
	 * Pide un entero por teclado mayor que cero acompañado de un mensaje
	 * 
	 * @param string
	 *            Mensaje a mostrar
	 * @return Un entero mayor que cero
	 */
	private static int pedirDato(String string) {
		int dato;
		do {
			dato = Teclado.leerEntero(string);
		} while (dato < 1);
		return dato;
	}

}
