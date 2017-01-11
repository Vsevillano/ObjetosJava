package circulo;

/**
 * Crea la clase �Circulo� que responda al siguiente comportamiento: 
 * a. Un c�rculo puede crecer. Aumenta su radio. 
 * b. Un c�rculo puede menguar. Decrementa su radio. 
 * c. Un c�rculo me devuelve su �rea si se la pido. 
 * d. Un c�rculo me dice su estado, por ejemplo �Soy un c�rculo de radio 0.5 metros.
 * Ocupo un �rea de 0.7853981633974483 metros cuadrados�(m�todo toString()).
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
			return "Soy un m�sero punto";
		}
		return "Circulo (radio=" + getRadio() + ")";
	}

}
