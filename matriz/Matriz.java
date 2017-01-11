package matriz;
/**
 * Crea una clase matriz que modele una matriz
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 * 
 */
public class Matriz {
	/**
	 * Matriz que se va a generar
	 */
	private int[][] matriz;

	/**
	 * Constructor que inicia todos sus valores a 0
	 * 
	 * @param filas
	 *            Numero de filas
	 * @param columnas
	 *            Numero de columnas
	 */
	public Matriz(int filas, int columnas) {
		matriz = new int[filas][columnas];
	}

	/**
	 * Crea una matriz de valores aleatorios
	 * 
	 * @param filas
	 *            Numero de filas
	 * @param columnas
	 *            Nuero de columnas
	 * @param min
	 *            Minimo aleatorio
	 * @param max
	 *            Maximo aleatorio
	 */
	public Matriz(int filas, int columnas, int min, int max) {
		matriz = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = (int) (Math.random() * (max - min + 1) + min);
			}
		}
	}

	/**
	 * Muestra el estado de la matriz
	 * 
	 * @param string
	 *            Mensaje para la matriz
	 */
	public void mostrar(String string) {

	}

	/**
	 * Muestra el estado de la matriz
	 */
	public void mostrar() {

	}

	/**
	 * Non-javadoc
	 */
	@Override
	public String toString() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}
		return "";
	}

	/**
	 * Suma dos matrizes
	 * 
	 * @param s2
	 *            Sumando dos
	 * @return La matriz resultante de la suma
	 */
	public Matriz sumar(Matriz s2) {
		if (!mismasDimensiones(s2)) {
			System.out.println("\nNo puedo sumar las matrices porque no son de las mismas dimensiones");
			return null;
		}
		else {
		int filas = filas();
		int columnas = columnas();

		Matriz suma = new Matriz(filas, columnas);

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				suma.matriz[i][j] = matriz[i][j] + s2.matriz[i][j];
			}
		}
		return suma;
		}
	}

	/**
	 * Resta dos matrices
	 * 
	 * @param sustraendo
	 *            Matriz sustraendo
	 * @return La matriz resultante
	 */
	public Matriz restar(Matriz sustraendo) {
		if (!mismasDimensiones(sustraendo)) {
			System.out.println("\nNo puedo restar las matrices porque no son de las mismas dimensiones");
			return null;
		}

		int filas = filas();
		int columnas = columnas();

		Matriz resta = new Matriz(filas, columnas);

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				resta.matriz[i][j] = matriz[i][j] - sustraendo.matriz[i][j];
			}
		}
		return resta;
	}

	/**
	 * Traspone la matriz
	 * 
	 * @return Devuelve la matriz traspuesta
	 */
	public Matriz trasponer() {
		int filas = filas();
		int columnas = columnas();

		Matriz resultado = new Matriz(filas, columnas);
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				resultado.matriz[i][j] = matriz[j][i];
			}
		}
		return resultado;
	}

	/**
	 * Multiplica dos matrices
	 * 
	 * @param Segunda
	 *            matriz
	 * @return La matriz resultante de la multiplicacion
	 */
	public Matriz multiplicar(Matriz p2) {
		Matriz resultado = new Matriz(matriz.length, p2.matriz[0].length);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < p2.matriz[0].length; j++) {
				for (int k = 0; k < matriz[0].length; k++) {
					resultado.matriz[i][j] += matriz[i][k] * p2.matriz[k][j];
				}
			}
		}
		return resultado;
	}

	/**
	 * Comprueba las dimensiones de dis matrices
	 * 
	 * @param m
	 *            Matriz a comparar
	 * @return True si son iguales y false si no lo son
	 */
	private boolean mismasDimensiones(Matriz m) {
		if (matriz[0].length == m.matriz.length && matriz[0].length == m.matriz[0].length) {
			return true;
		} else {
		}
		return false;
	}

	/**
	 * Averigua la primera dimension de la matriz
	 * 
	 * @return Numero de filas de la matriz
	 */
	private int filas() {
		return matriz.length;
	}

	/**
	 * Averigua la segunda dimension de la matriz
	 * 
	 * @return El numero de columnas
	 */
	private int columnas() {
		return matriz[0].length;

	}
}
