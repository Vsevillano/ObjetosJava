package circulo;
import menu.Menu;
import utiles.Teclado;
/**
 * Crea una clase TestCirculoConMenu que muestre un menú para manipular una
 * instancia de círculo.
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 */
public class TestCirculoConMenu {
	static Menu menu;
	static Circulo circulo;

	public static void main(String[] args) {
		int opcion;
		menu = new Menu("Menu del circulo: ",
				new String[] { "Salir", "Crear", "Crecer", "Menguar", "Mostrar area", "Mostrar" });

		do {
			opcion = menu.gestionar();
			gestionarOpciones(opcion);
		} while (opcion != 1);

	}

	/**
	 * Gestiona las opciones del circulo
	 * 
	 * @param opcion
	 *            Entero con el valor de la opcion seleccionada
	 */
	private static void gestionarOpciones(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("Adios!");
			break;
		case 2:
			circulo = new Circulo(pedirRadio());
			break;
		case 3:
			crecer();
			break;
		case 4:
			menguar();
			break;
		case 5:
			mostrarArea();
			break;
		case 6:
			mostrar();
			break;
		}
	}

	/**
	 * Muestra el circulo
	 */
	private static void mostrar() {
		if (circulo == null) {
			System.out.println("El circulo debe ser creado antes de mostrarlo!");
		} else {
			System.out.println(circulo.toString());
		}
	}

	/**
	 * Muestra el area del circulo
	 */
	private static void mostrarArea() {
		if (circulo == null) {
			System.out.println("El circulo debe ser creado primero!");
		} else {
			System.out.println("Area: " + circulo.areaCirculo());
		}
	}

	/**
	 * Mengua el circulo en una unidad
	 */
	private static void menguar() {
		if (circulo == null) {
			System.out.println("Antes de menguar hay que crear un circulo!");
		} else {
			circulo.menguar();
		}
	}

	/**
	 * Hace crecer el circulo en una unidad
	 */
	private static void crecer() {
		if (circulo == null) {
			System.out.println("Antes de crecer hay que crear un circulo!");
		} else {
			circulo.crecer();
		}
	}

	/**
	 * Pide un radio valido por teclado
	 * 
	 * @return Un entero mayor o igual que 0
	 */
	private static int pedirRadio() {
		int radio;
		do {
			radio = Teclado.leerEntero("Introduzca el radio");
			if (radio < 0) {
				System.err.println("El radio no puede ser negativo.");
			}
		} while (radio < 0);
		return radio;
	}
}
