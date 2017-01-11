package sieteYMedia;

public class Carta {
	private final Palos palos;
	private final Figuras figuras;

	public Carta(Figuras figuras, Palos palos) {
		this.figuras = figuras;
		this.palos = palos;
	}

	public Palos getPalos() {
		return palos;
	}

	public Figuras getFiguras() {
		return figuras;
	}

	public double getValor() {
		return figuras.getValor();
	}

	@Override
	public String toString() {
		return "" + figuras + " de " + palos + "";
	}

}
