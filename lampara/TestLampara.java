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
