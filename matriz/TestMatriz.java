/**
 * 
 */
package matriz;

import menu.Menu;
import utiles.Teclado;

/**
 * @author Victor
 *
 */
public class TestMatriz {
	static Menu menu;
	static Menu menuCrearMatrices;
	static Matriz matriz1;
	static Matriz matriz2;
	static Matriz resultado;
	
	public static void main(String[] args) {
		int opcion;
		menu = new Menu("*** Matrices ***", new String[] {"Crear matriz 1", "Crear matriz 2", "Sumar matrices","Mostrar matrices", "Restar matrices", "Trasponer", "Multiplicarmatrices", "Salir"});
		menuCrearMatrices = new Menu("*** Creacion de matrices ***", new String[] {"Valores a 0", "Aleatoria", "Salir"});
		
		do {
			opcion = menu.gestionar();
			gestionarOpciones(opcion);
		} while (opcion != 7);
	}
	
	/**
	 * Gestiona las opciones del menu
	 * @param opcion Entero con la opcion recogida
	 */
	private static void gestionarOpciones(int opcion) {
		switch (opcion) {
		case 1:
			matriz1 = crearMatriz();
			break;
		case 2:
			matriz2 = crearMatriz();
			break;
		case 3:
			sumarMatrices();
			break;
		case 4:
			mostrarMatrices();
			break;
		case 5:
			restarMatrices();
			break;
		case 6:
			trasponerMatrices();
			break;
		case 7:
			multiplicarMatrices();
			break;
		default:
			System.out.println("Adios!");
			System.exit(0);
			break;
		}
	}
	
	/**
	 * Muestra las matrices creadas, si las hay
	 */
	private static void mostrarMatrices() {
		if (matriz1 == null) {
			System.out.println("La matriz 1 no esta creada");
		}
		else {
			System.out.println("Matriz 1:\n");
			System.out.println(matriz1.toString());
		}
		if (matriz2 == null) {
			System.out.println("La matriz 2 no esta creada");
		}
		else {
			System.out.println("Matriz 2:\n");
			System.out.println(matriz2.toString());
		}
	}

	/**
	 * Resta dos matrices
	 */
	private static void restarMatrices() {
		if (matriz1 == null || matriz2 == null) {
			System.out.println("\nHay que crear la matriz antes!");
			return;
		}
		System.out.println("Sumando 1:\n" + matriz1.toString());
		System.out.println("Sumando 2:\n" + matriz2.toString());
		resultado = matriz1.restar(matriz2);
		System.out.println("\nResultado: " + resultado.toString());
	}
	
	/**
	 * Suma dos matrices
	 */
	private static void sumarMatrices() {
		if (matriz1 == null || matriz2 == null) {
			System.out.println("\nHay que crear la matriz antes!");
			return;
		}
		else {
		System.out.println("Sumando 1:\n");
		System.out.println(matriz1.toString() + "\n");
		System.out.println("Sumando 2:\n");
		System.out.println(matriz2.toString() + "\n");
		resultado = matriz1.sumar(matriz2);
		System.out.println("\nResultado: ");
		System.out.println(resultado.toString() + "\n");
		}
	}
	
	/**
	 * Multiplica dos matrices
	 */
	private static void multiplicarMatrices() {
		if (matriz1 == null || matriz2 == null) {
			System.out.println("\nHay que crear la matriz antes!");
			return;
		}
		System.out.println("Factor 1:\n");
		System.out.println(matriz1.toString() + "\n");
		System.out.println("Factor 2:\n");
		System.out.println(matriz2.toString() + "\n");
		resultado = matriz1.multiplicar(matriz2);
		System.out.println("\nResultado: " );
		System.out.println(resultado.toString() + "\n");
	}

	/**
	 * Traspone una matriz
	 */
	private static void trasponerMatrices() {
		if (matriz1 == null) {
			System.out.println("\nHay que crear la matriz antes!");
			return;
		}
		resultado = matriz1.trasponer();
		System.out.println(resultado.toString());
	}

	/**
	 * Crea la matriz de forma aleatoria o a cero
	 * @return Una matriz aleatoria o a cero
	 */
	private static Matriz crearMatriz() {
		switch (menuCrearMatrices.gestionar()) {
		case 1:
			return new Matriz(Teclado.leerEntero("Numero de filas:"), Teclado.leerEntero("Numero de columnas:"));
		case 2:
			return new Matriz(Teclado.leerEntero("Numero de filas:"), Teclado.leerEntero("Numero de columnas:"),Teclado.leerEntero("Minimo:"), Teclado.leerEntero("Maximo:"));
			
		}
		return null;
	}
}
