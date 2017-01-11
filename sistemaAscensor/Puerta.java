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
public class Puerta {
	/**
	 * Estado de la puerta, abierta o cerrada
	 */
	private boolean abierta = true;

	/**
	 * Devuelve el estado del campo abierta
	 * @return
	 */
	public boolean isAbierta() {
		return abierta;
	}

	/**
	 * Modifica el estado de abierta
	 * @param abierta Estado de la puerta
	 */
	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}

	/**
	 * Abre la puerta
	 * @return Mensaje al abrir puerta
	 */
	String abrir(){
		setAbierta(true);
		return "Abriendo puerta";
	}
	
	/**
	 * Cierra la puerta
	 * @return Mensaje al cerrar puerta
	 */
	String cerrar(){
		setAbierta(false);
		return "Cerrando puerta";
	}
	
	/**
	 * Non-javadoc
	 */
	@Override
	public String toString() {
		return "Puerta " + abierta;
	}
	
	
}
