package lampara;

/**
 * <p>
 * Envía los ficheros “Lampara.java”, “TestLampara.java” y la respuesta
 * “preguntas.txt” en un único fichero comprimido “LamparaMiNombreCompleto”
 * Disponemos del siguiente código: class Lampara { boolean encendida = false;
 * encender(){ encendida = true; System.out.println("Ilumninando"); } apagar(){
 * encendida = false; System.out.println("Oscuridad"); } }
 * </p>
 * <ul>
 * <li>El código actual contiene errores de compilación. Corrígelos.</li>
 * <li>Encapsula en la medida de lo posible</li>
 * <li>Empaqueta la clase Lampara en una biblioteca</li>
 * <li>Haciendo uso de la clase lámpara ya modificada, simula el funcionamiento
 * de una lámpara en una nueva clase TestLampara (con método main()). El
 * resultado de la ejecución será este: Ilumninando Oscuridad</li>
 * </ul>
 * <p>
 * Añadiendo comentarios de línea en la nueva clase TestLampara, indica en qué
 * parte del código se: Instancia un objeto Invoca a un método Accede a un campo
 * ¿Aparece el constructor? ¿Por qué?
 * <p>
 * 
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 */
public class Lampara {

	private boolean encendida; // Solo declaramos el campo. Le ponemos private
								// para que no se pueda acceder desde otra clase
								// Haremos lo mismo con los metodos

	/**
	 * Metodo que muestra la luz encendida (true)
	 */
	public void encender() {
		setEncendida(true);
	}

	/**
	 * Metodo que muestra la luz apagada (false)
	 */
	public void apagar() {
		setEncendida(false);
	}

	/**
	 * Getter de encendida. Lee el valor de encendida
	 * 
	 * @return
	 */
	private boolean isEncendida() {
		return encendida;
	}

	/**
	 * Setter de encendida. Establece un valor a encendida.
	 * 
	 * @param encendida
	 */
	private void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	/**
	 * Devuelve el mensaje Iluminando en funcion de true y Oscuridad en funcion
	 * de false
	 * 
	 * @return Iluminando (true) / Oscuridad (false)
	 */
	String averiguarEstado() {
		return isEncendida() ? "Iluminando" : "Oscuridad";
	}

}
