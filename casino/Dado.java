package casino;
/**
 * Crea la clase Dado de seis caras (valores del 1 al 6). 
 * Mételo en el paquete casino. 
 * Implementa al menos los métodos:
 * a. toString(). 
 * b. lanzar()
 *
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class Dado {
	private int cara;

	/**
	 * Constructor vacio
	 */
	public Dado() {
	}

	/**
	 * Obtiene la cara del dado
	 * 
	 * @return
	 */
	public int getCara() {
		return cara;
	}

	/**
	 * Modifica el valor de la cara del dado.
	 * 
	 * @param cara
	 */
	public void setCara(int cara) {
		this.cara = cara;
	}

	/**
	 * Landa un dazo
	 * 
	 * @return Un entero entre 1 y 6
	 */
	public int lanzar() {
		return cara = (int) ((Math.random() * 6) + 1);
	}

	/**
	 * Non-Javadoc
	 */
	@Override
	public String toString() {
		return "Sale " + getCara();
	}
}
