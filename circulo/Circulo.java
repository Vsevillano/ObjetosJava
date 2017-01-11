package circulo;

/**
 * Crea la clase “Circulo” que responda al siguiente comportamiento: 
 * a. Un círculo puede crecer. Aumenta su radio. 
 * b. Un círculo puede menguar. Decrementa su radio. 
 * c. Un círculo me devuelve su área si se la pido. 
 * d. Un círculo me dice su estado, por ejemplo “Soy un círculo de radio 0.5 metros.
 * Ocupo un área de 0.7853981633974483 metros cuadrados”(método toString()).
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class Circulo {
	/**
	 * Radio del circulo
	 */
	private int radio;

	/**
	 * Constructor
	 * 
	 * @param radio
	 *            Radio del circulo
	 */
	public Circulo(int radio) {
		if (radio < 0) 
			setRadio(1);
		else
		setRadio(radio);
	}

	/**
	 * Obtiene el radio del circulo
	 * 
	 * @return entero con el radio
	 */
	private int getRadio() {
		return radio;
	}

	/**
	 * Modifica el radio del circulo
	 * 
	 * @param radio
	 *            Entero que indica el radio
	 * @return Entero con el radio
	 */
	private void setRadio(int radio) {
		this.radio = radio;
	}

	/**
	 * Hace crecer el circulo en 1
	 * 
	 * @return Radio aumentado en 1
	 */
	String crecer() {
		setRadio(getRadio() + 1);
		return "Radio aumentado";
	}

	/**
	 * Hace decrecer el circulo en 1
	 * 
	 * @return Radio decrementado en 1
	 */
	String menguar() {
		if ((getRadio() - 1) < 0)
			return "No se ha podido menguar";
		setRadio(getRadio() - 1);
		return "Radio menguado";
	}

	/**
	 * Area del circulo
	 * 
	 * @return Un decimal con el area
	 */
	double areaCirculo() {
		return Math.PI * Math.pow(getRadio(), 2);
	}

	/**
	 * Non-Javadoc
	 */
	@Override
	public String toString() {
		if (getRadio() == 0) {
			return "Soy un mísero punto";
		}
		return "Circulo (radio=" + getRadio() + ")";
	}

}
