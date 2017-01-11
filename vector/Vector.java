package vector;

import java.util.Arrays;

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
public class Vector {

	int tamanio, maximo, minimo;
	private int[] vector;

	/**
	 * Constructor de la clase Vector
	 * 
	 * @param tamanio
	 *            Tamaño del vector
	 * @param maximo
	 *            Valor maximo a contener dentro del vector
	 * @param minimo
	 *            Valor minimo a contener dentro del vector
	 */
	public Vector(int tamanio, int minimo, int maximo) {
		vector = new int[tamanio];
		inicializar(minimo, maximo);
	}

	/**
	 * Constructor de la clase Vector
	 * 
	 * @param vector
	 *            Valor del vector
	 */
	public Vector(int[] vector) {
		this.vector = vector;
	}

	/**
	 * Constructor de la clase Vector
	 * 
	 * @param longitud
	 *            Longitud del vector a crear
	 */
	public Vector(int longitud) {
		vector = new int[longitud];
	}

	/**
	 * Inicializa el vector con numeros aleatorios entre un maximo y minimo
	 * 
	 * @param maximo
	 *            Valor maximo a generar
	 * @param minimo
	 *            Valor minimo a generar
	 * @return Un vector inicializado aleatoriamente
	 */
	void inicializar(int minimo, int maximo) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * (maximo - minimo) + minimo);
		}
	}

	/**
	 * Calcula el maximo valor de un vector
	 * 
	 * @return El valor maximo del vector
	 */
	int clacularMaximo() {
		int maximo = vector[0];

		for (int i = 1; i < vector.length; i++) {
			if (maximo < vector[i]) {
				maximo = vector[i];
			}
		}
		return maximo;
	}

	/**
	 * Calcula el minimo valor de un vector
	 * 
	 * @return El valor minimo del vector
	 */
	int clacularMinimo() {
		int minimo = vector[0];

		for (int i = 1; i < vector.length; i++) {
			if (minimo > vector[i]) {
				minimo = vector[i];
			}
		}
		return minimo;
	}

	/**
	 * Calcula la suma de los valores de un vector
	 * 
	 * @return La suma de los valores del vector
	 */
	double suma() {
		int suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}
		return suma;
	}

	/**
	 * Calcula la media de los valores de un vector
	 * 
	 * @return La media de los valores del vector
	 */
	double calcularMedia() {
		return suma() / vector.length;
	}

	/**
	 * Suma dos vectores
	 * 
	 * @param vector2
	 *            Vector que vamos a sumar
	 * @return Vector con la suma de los dos vectores
	 */
	public Vector sumarVectores(Vector vector2) {
		if (vector.length != vector2.getTamanio()) {
			return null;
		}
		Vector suma = new Vector(vector.length);
		for (int i = 0; i < vector.length; i++) {
			suma.vector[i] = vector[i] + vector2.getVector()[i];
		}
		return suma;
	}

	/**
	 * Capta el tamaño del vector
	 * 
	 * @return El tamaño del vector
	 */
	public int getTamanio() {
		return tamanio;
	}

	/**
	 * Obtiene el valor de vector
	 * 
	 * @return El vector
	 */
	public int[] getVector() {
		return vector;
	}

	/**
	 * Metodo toString que devuelve el valor del array en forma de cadena
	 * 
	 * @return Una cadena con los datos del vector.
	 */
	@Override
	public String toString() {
		return "Vector:" + Arrays.toString(vector);
	}

}
