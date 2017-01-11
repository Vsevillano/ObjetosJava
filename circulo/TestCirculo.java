package circulo;

import utiles.Teclado;

/**
 * Crea una clase TestCirculo que cree una instancia de “Circulo”, 
 * muestre su estado, lo haga crecer 27 veces, averigüe su área, 
 * lo haga decrecer 10 veces y muestre su estado final.
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class TestCirculo {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(Teclado.leerEntero("Introduzca el radio"));

		for (int i = 0; i < 27; i++) {
			circulo.crecer();
		}

		System.out.println("El area es: " + circulo.areaCirculo());

		for (int i = 0; i < 10; i++) {
			circulo.menguar();
		}

		System.out.println(circulo.toString());
	}

}
