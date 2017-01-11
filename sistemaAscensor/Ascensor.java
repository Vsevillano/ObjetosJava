package sistemaAscensor;
/**
 * Crea una clase TestAscensor que simule el funcionamiento de un ascensor. 
 * Para ello, tendrás que crear un paquete sistemaAscensor que contenga las clases Ascensor y Puerta. 
 * Un ascensor podrá subir y bajar. 
 * Cada vez que se modifique el estado del objeto, se mostrarán todos los atributos. 
 * Para ello sobreescribe el método toString() en la clase Ascensor.
 * 
 * Una puerta podrá abrir y cerrarse
 * 
 * Crea la clase TestAscensor fuera del paquete para probarlo.
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class Ascensor {
	private int plantaActual = 1;
	private int numPlantas;
	Puerta puerta;

	/**
	 * Constructor del ascensor
	 * 
	 * @param numPlantas
	 *            Numero total de plantas del ascensor
	 */
	public Ascensor(int numPlantas) {
		setPlantaActual(plantaActual);
		if (numPlantas < 1) 
			setNumPlantas(2);
		else
		setNumPlantas(numPlantas);
		setPuerta(new Puerta());
	}

	/**
	 * Obitene la planta actual;
	 * 
	 * @return
	 */
	public int getPlantaActual() {
		return plantaActual;
	}

	/**
	 * Modifica el valor de la planta actual
	 * 
	 * @param plantaActual
	 */
	public void setPlantaActual(int plantaActual) {
		this.plantaActual = plantaActual;
	}

	/**
	 * Obtiene el numero de plantas
	 * 
	 * @return
	 */
	public int getNumPlantas() {
		return numPlantas;
	}

	/**
	 * Modifica el valor del numero de plantas
	 * 
	 * @param numPlantas
	 */
	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}

	/**
	 * Obtiene el estado de puerta
	 * 
	 * @return
	 */
	public Puerta getPuerta() {
		return puerta;
	}

	/**
	 * Modifica el estado de puerta;
	 * 
	 * @param puerta
	 */
	public void setPuerta(Puerta puerta) {
		this.puerta = puerta;
	}

	/**
	 * 
	 * @param plantaDestino
	 * @return
	 */
	String subir(int plantaDestino) {
		String mensaje = "";
		for (int i = plantaActual; i < plantaDestino; i++) {
			plantaActual++;
			mensaje += "Subiendo. Planta " + getPlantaActual() + "\n";
		}
		return mensaje;
	}

	/**
	 * 
	 * @param plantaDestino
	 * @return
	 */
	String bajar(int plantaDestino) {
		String cadena = "";
		int veces = plantaActual - plantaDestino;
		for (int i = 0; i < veces; i++) {
			plantaActual--;
			cadena += "Bajando. Planta " + getPlantaActual() + "\n";
		}
		return cadena;
	}

	/**
	 * Viaja a la planta destino
	 * 
	 * @param plantaDestino
	 *            Planta destino
	 */
	String viajar(int plantaDestino) {
		if (destinoCorrecto(plantaDestino)) {
			String cadena = puerta.abrir() + "\n" + puerta.cerrar() + "\n";
			if (plantaDestino < plantaActual) {
				cadena += bajar(plantaDestino);
			} else {
				cadena += subir(plantaDestino);
			}
			cadena += destinoConseguido();
			return cadena;
		} else {
			return "Inserte un destino correcto";
		}

	}

	/**
	 * Cuando se consigue el destino se muestra la siguiente cadena
	 * 
	 * @return Cadena con un mensaje
	 */
	String destinoConseguido() {
		String cadena = puerta.abrir() + "\n";
		cadena += "Estas en la planta " + getPlantaActual() + ". Destino conseguido.\n" + puerta.cerrar() + "\n";
		return cadena;
	}

	/**
	 * Controla que el destino sea correcto
	 * 
	 * @param plantaDestino
	 *            Planta a la cual vamos a ir
	 * @return True o false
	 */
	public boolean destinoCorrecto(int plantaDestino) {
		if ((plantaDestino < 1) || (plantaDestino > numPlantas))
			return false;
		return true;

	}

}
