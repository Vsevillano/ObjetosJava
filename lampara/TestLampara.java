package lampara;

/**
 * <p>
 * Env�a los ficheros �Lampara.java�, �TestLampara.java� y la respuesta
 * �preguntas.txt� en un �nico fichero comprimido �LamparaMiNombreCompleto�
 * Disponemos del siguiente c�digo: class Lampara { boolean encendida = false;
 * encender(){ encendida = true; System.out.println("Ilumninando"); } apagar(){
 * encendida = false; System.out.println("Oscuridad"); } }
 * </p>
 * <ul>
 * <li>El c�digo actual contiene errores de compilaci�n. Corr�gelos.</li>
 * <li>Encapsula en la medida de lo posible</li>
 * <li>Empaqueta la clase Lampara en una biblioteca</li>
 * <li>Haciendo uso de la clase l�mpara ya modificada, simula el funcionamiento
 * de una l�mpara en una nueva clase TestLampara (con m�todo main()). El
 * resultado de la ejecuci�n ser� este: Ilumninando Oscuridad</li>
 * </ul>
 * <p>
 * A�adiendo comentarios de l�nea en la nueva clase TestLampara, indica en qu�
 * parte del c�digo se: Instancia un objeto Invoca a un m�todo Accede a un campo
 * �Aparece el constructor? �Por qu�?
 * <p>
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 */
public class TestLampara {

	public static void main(String[] args) {
		Lampara lampara = new Lampara(); // Instanciamos el objeto Lampara
		System.out.println(lampara.averiguarEstado());
		lampara.encender(); // Invicamos un metodo de la clase Lampara
		System.out.println(lampara.averiguarEstado());
		lampara.apagar(); // Dentro del metodo apagar() o encender() accedemos al campo encendida
		System.out.println(lampara.averiguarEstado());// No aparece ningun constructor porque coge el constructor vacio por defecto.
	}
}
