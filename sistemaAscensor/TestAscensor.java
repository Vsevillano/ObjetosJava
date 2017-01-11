package sistemaAscensor;

import utiles.Teclado;

/**
 * Crea una clase TestAscensor que simule el funcionamiento de un ascensor. 
 * Para ello, tendr�s que crear un paquete sistemaAscensor que contenga las clases Ascensor y Puerta. 
 * Un ascensor podr� subir y bajar. 
 * Cada vez que se modifique el estado del objeto, se mostrar�n todos los atributos. 
 * Para ello sobreescribe el m�todo toString() en la clase Ascensor.
 * 
 * Una puerta podr� abrir y cerrarse
 * 
 * Crea la clase TestAscensor fuera del paquete para probarlo.
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class TestAscensor {

	public static void main(String[] args) {
		char c;
		Ascensor ascensor = new Ascensor(Teclado.leerEntero("Elige la altura dle edificio (plantas en total):"));
		do {
		System.out.println("Estas en la planta " + ascensor.getPlantaActual());
		System.out.println(ascensor.viajar(Teclado.leerEntero("Seleccione el destino:")));
		c = Teclado.leerCaracter("�Quieres dejar el ascensor ya?");
		} while(c == 'n' || c == 'N');
	}

}
