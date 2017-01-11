package punto;
/**
 * Implementa las siguientes Clases: 
 * 
 * Punto: 
 * Campos: Las coordenadas enteras x e y 
 * Contructor: Con dos parámetros x e y 
 * Método: toString() 
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class Punto {
	/**
	 * Eje de abcisas
	 */
	int x;
	/**
	 * Eje de ordenadas
	 */
	int y;

	/**
	 * Constructor del punto
	 * 
	 * @param x
	 *            Eje x
	 * @param y
	 *            Eje y
	 */
	public Punto(int x, int y) {
		setX(x);
		setY(y);
	}

	/**
	 * Modifica X
	 * 
	 * @param x
	 *            Eje x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Modifica y
	 * 
	 * @param y
	 *            Eje y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Non-Javadoc
	 */
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
