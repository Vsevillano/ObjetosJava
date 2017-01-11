package sieteYMedia;

import java.util.Arrays;

public class Baraja {
	private final int MAX_VALOR = 40;
	Carta[] carta = new Carta[MAX_VALOR];
	private int numCartasRestantes = MAX_VALOR;
	
	/**
	 * Constructor de la baraja formada por todas las cartas
	 */
	public Baraja() {
		int i = 0;
		for (Palos palos : Palos.values()) {
			for (Figuras figuras : Figuras.values()) {
				carta[i++] = new Carta(figuras, palos);
			}
		}
	}
	
	/**
	 * Non-javadoc
	 */
	@Override
	public String toString() {
		return "" + Arrays.toString(getCarta()) + "";
	}

	/**
	 * Obtiene la carta
	 * @return
	 */
	public Carta[] getCarta() {
		return carta;
	}

	/**
	 * Da una mano valida
	 * @return
	 */
	public Carta darMano(){
		if (numCartasRestantes == 0)
			return null;
		int aleatorio = (int) (Math.random() * numCartasRestantes);
		if (carta[aleatorio] != null) {
			Carta mano = carta[aleatorio];
			carta[aleatorio] = null;
			numCartasRestantes--;
			return mano;
		} else {
			aleatorio++;
		}
		return null;
	}
	
	
	
	
}