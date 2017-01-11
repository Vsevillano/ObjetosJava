package ies;
/**
 * Enumeracion con los distintos cursos posibles para el Estudiante
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public enum Curso {
	/**
	 * Primero de la ESO
	 */
	ESO1("1� de E.S.O"),
	/**
	 * Segundo de la ESO
	 */
	ESO2("2� de E.S.O"), 
	/**
	 * Tercero de la ESO
	 */
	ESO3("3� de E.S.O"),
	/**
	 * Cuarto de la ESO
	 */
	ESO4("4� de E.S.O"),
	/**
	 * Primero de Bachillerato
	 */
	BACH1("1� de Bachillerato"), 
	/**
	 * Segundo de Bachillerato
	 */
	BACH2("2� de Bachillerato"), 
	/**
	 * Primero de DAW
	 */
	DAW1("1� de D.A.W"), 
	/**
	 * Segundo de DAW
	 */
	DAW2("2� D.A.W");

	/**
	 * Nombre del curso
	 */
	private String nombre;

	/**
	 * Constructor con nombre
	 * @param nombre Nombre del curso
	 */
	private Curso(String nombre) {
		setNombre(nombre);
	}
	
	/**
	 * Obtiene el nombre del curso
	 * @return Nombre del curso
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
