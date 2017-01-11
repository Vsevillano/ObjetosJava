package sieteYMedia;

public class Jugador {
	private final String nombre;
	private int partidasGanadas;
	private int partidasJugadas;

	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return getNombre();
	}
	
	
	

}
