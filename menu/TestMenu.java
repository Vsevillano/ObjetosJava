package menu;

/**
 * <p>Crea la clase Menu. Mételo en el paquete utiles.</p> 
 * <p>Implementa al menos los siguientes métodos y atributos:</p> 
 * <ul>
 * <li>a. titulo</li> 
 * <li>b. opciones</li>
 * <li>c. numOpciones</li> 
 * <li>d. gestionar()</li> 
 * <li>e. mostrar()</li> 
 * <li>f. recogerOpcion()</li>
 * </ul>
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class TestMenu {

	public static void main(String[] args) {		
		Menu menu = new Menu("MENU EXAMEN NOVIEMBRE:", new String[] { "Salir", "El triple de un numero",
			  "Dibuja un cuadrado. Se pedira la dimension entre 3 y 9.", "¿Es consonante o vocal?",
			  "Mostrar hasta que sea mayor que 0.95", "80 primeros numeos multiplos de 7 impares" });
		
		menu.gestionar();

	}

}
