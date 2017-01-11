package rectangulo;

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
public class Rectangulo {
	/**
	 * Base del rectangulo
	 */
	private int base;
	/**
	 * Altura del rectangulo
	 */
	private int altura;

	/**
	 * Constructor con base y altura
	 * 
	 * @param base
	 *            Base del rectangulo
	 * @param altura
	 *            Altura del rectangulo
	 */
	public Rectangulo(int base, int altura) {
		setBase(base);
		setAltura(altura);
	}

	/**
	 * Obtiene la base
	 * 
	 * @return Entero con el valor de base
	 */
	int getBase() {
		return base;
	}

	/**
	 * Modifica el valor de base
	 * 
	 * @param base
	 *            Entero con el valor de base
	 */
	private void setBase(int base) {
		this.base = base;
	}

	/**
	 * Obtiene la altura
	 * 
	 * @return Entero con la altura
	 */
	private int getAltura() {
		return altura;
	}

	/**
	 * Modifica la altura
	 * 
	 * @param altura
	 *            Entero con el valor de la altura
	 */
	private void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * Incrementa en 1 la altura
	 */
	String incAltura() {
		setAltura(getAltura() + 1);
		return "Altura incrementada" + "\n" + comprobarEstadoAnchoAlto();
	}

	/**
	 * Decrementa en 1 la altura
	 */
	String decAltura() {
		if (getAltura() - 1 < 1)
			return "No se puede decrementar la altura";
		setAltura(getAltura() - 1);
		return "Altura decrementada" + "\n" + comprobarEstadoAnchoAlto();
	}

	String comprobarEstadoAnchoAlto() {
		if (getAltura() == getBase())
			return "Soy un cuadrado\n" + toString();
		return "";
	}

	/**
	 * Incrementa en 1 la base
	 */
	String incBase() {
		setBase(getBase() + 1);
		return "Base decrementada" + "\n" + comprobarEstadoAnchoAlto();
	}

	/**
	 * Decrementa en 1 la base
	 */
	String decBase() {
		if (getBase() - 1 < 1)
			return "No se puede decrementar la base";
		setBase(getBase() - 1);
		return "Base decrementada" + "\n" + comprobarEstadoAnchoAlto();
	}

	/**
	 * Non-Javadoc
	 */
	@Override
	public String toString() {
		if (getBase() == getAltura()) {
			return "Ahora soy un cuadrado";
		} else {
			return "Rectangulo: Base= " + base + ", Altura= " + altura;
		}
	}

}
