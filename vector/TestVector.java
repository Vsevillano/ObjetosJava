package vector;

import utiles.Teclado;

/**
 * <p>
 * Crea la clase vector con el siguiente comportamiento;
 * </p>
 * <ul>
 * <li>calcularMaximo()</li>
 * <li>calcularMinimo()</li>
 * <li>sumar()</li>
 * <li>calcularMedia()</li>
 * </ul>
 * <p>
 * En el constructor, se indicará el tamaño, valores máximo y mínimo para
 * rellenar aleatoriamente
 * </p>
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class TestVector {

	public static void main(String[] args) {
		Vector vector = new Vector(new int[] { 3, 5, 7, 5, 3, 2, 2 }); 
		
		System.out.print(vector.toString());
		System.out.print("\n\nMaximo:" + vector.clacularMaximo());
		System.out.print("\nMinimo:" + vector.clacularMinimo());
		System.out.print("\nSuma:" + vector.suma());
		System.out.print("\nMedia:" + vector.calcularMedia() + "\n");

		
		int tamanio = pedirTamanio();
		int minimo = pedirMinimo();
		int maximo = pedirMaximo(minimo);
		Vector vector2 = new Vector(tamanio, minimo, maximo); 
		
		System.out.print(vector2.toString());
		System.out.print("\n\nMaximo:" + vector2.clacularMaximo());
		System.out.print("\nMinimo:" + vector2.clacularMinimo());
		System.out.print("\nSuma:" + vector2.suma());
		System.out.print("\nMedia:" + vector2.calcularMedia());
		
		System.out.print("\nSuma v1 y v2:" + vector.sumarVectores(vector2));
		
	}

	/**
	 * Recoge el maximo numero aleatorio a generar
	 * 
	 * @return Un entero que indica el maximo numero aleatorio a generar
	 */
	static int pedirMaximo(int minimo) {
		int maximo = 0;
		do {
			maximo = Teclado.leerEntero("Indica el maximo:");
		} while (maximo < minimo);
		return maximo;
	}

	/**
	 * Recoge el minimo numero aleatorio a generar
	 * 
	 * @return Un entero que indica el minimo numero aleatorio a generar
	 */
	static int pedirMinimo() {
		int minimo = 0;
		minimo = Teclado.leerEntero("Indica el minimo:");
		return minimo;
	}

	/**
	 * Recoge el tamaño del vector
	 * 
	 * @return Un entero que indica el tamaño del vector
	 */
	static int pedirTamanio() {
		int tamanio = 0;
		do {
			tamanio = Teclado.leerEntero("Indica el tamaño del vector:");
		} while (tamanio <= 0);
		return tamanio;
	}

}
