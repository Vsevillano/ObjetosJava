package posicion;

/**
 * <p>
 * Diseña la clase Posicion que represente un punto (x,y) en el eje de
 * coordenadas. Cada posición viene definida por dos valores enteros x e y.
 * </p>
 * <p>
 * Constará de los siguietes métodos:
 * </p>
 * <ul>
 * <li>Constructor por defecto. Se corresponde con la posición (0,0).</li>
 * <li>Constructor al que se le pasa como argumento los valores inciales de las
 * coordenadas x e y.</li>
 * <li>Constructor de copia. Se le pasa como argumento un objeto de la misma
 * clase.</li>
 * <li>Se inicializan los campos del nuevo objeto con los mismos valores de los
 * campos del objeto que se pasa como parámetro.</li>
 * <li>Métodos para modificación y consulta (set/get) de los atributos de la
 * clase.</li>
 * <li>Métodos para incrementar y decrementar los valores de cada una de las
 * coordenadas de la posición (incX, incY, decX, decY).</li>
 * <li>Un método para establecer los valores de las coordenadas (setXY).</li>
 * </ul>
 * <p>
 * Para su comprobación, crea la clase TestPosición
 * </p>
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class Posicion extends Object{
	private int x;
	private int y;

	/**
	 * Constructor por defecto
	 * 
	 * @param x
	 * @param y
	 */
	public Posicion() {
		setX(0); // this.x = x;
		setY(0); // this.y = y;
	}

	/**
	 * Constructor que contiene los valores iniciales de x,y
	 * 
	 * @param posicion
	 */
	public Posicion(int x, int y) {
		setX(x); // x = posicion.x;
		setY(y); // y = posicion.y;
	}

	/**
	 * Constructor de copia
	 * 
	 * @param posicion
	 */
	public Posicion(Posicion posicion) {
		setX(posicion.getX());
		setY(posicion.getY());
	}

	// Metodos para la modificacion y consulta
	/**
	 * Obtiene el valor de x
	 * 
	 * @return
	 */
	public int getX() {
		return x;
	}

	/**
	 * Modifica el valor de x
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Obtiene el valor de y
	 * 
	 * @return
	 */
	public int getY() {
		return y;
	}

	/**
	 * Modifica el valor de y
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	// Metodos para incrementar y decrementar x,y
	/**
	 * Incrementa el valor de x
	 * 
	 */
	void incrementarX() {
		setX(getX() + 1);
	}

	/**
	 * Decrementa el valor de x
	 * 
	 */
	void decrementarX() {
		setX(getX() - 1);
	}

	/**
	 * Incrementa el valor de y
	 * 
	 */
	void incrementarY() {
		setY(getY() + 1);
	}

	/**
	 * Decrementa el valor de y
	 * 
	 */
	void decrementarY() {
		setY(getY() - 1);
	}

	// Metodo para establecer las coordenadad de XY
	/**
	 * Establece los valores de x,y
	 * 
	 * @param x
	 * @param y
	 */
	public void setXY(int x, int y) {
		setX(x);
		this.y = y; // Es lo mismo que setY(y);
	}
	
	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(x=" + x + ", y=" + y + ")";
	}
	
	

}
