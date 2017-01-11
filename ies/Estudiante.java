package ies;
/**
 * Crea la Clase Estudiante. Mételo en el paquete ies. 
 * Implementa al menos los siguientes métodos y atributos. 
 * a. nombre 
 * b. apellido primero 
 * c. apellido segundo 
 * d. curso (sólo se admitirán los valores 1ESO, 2ESO, 3ESO, 4ESO,1BACH, 2BACH, 1DAW, 2DAW) 
 * e. setCurso() 
 * f. incCurso(), que hará la promoción del alumno dentro de la etapa, que es: 
 * i. 1ESO ->2ESO->3ESO->4ESO 
 * ii. 1BACH->2BACH, 
 * iii. 1DAW -> 2DAW
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 *
 */
public class Estudiante {
	/**
	 * Nombre del estudiante
	 */
	private String nombre;
	/**
	 * Primer apellido del estudiante
	 */
	private String apellido1;
	/**
	 * Segundo apellido del estudiante
	 */
	private String apellido2;
	/**
	 * Enumeracion con los posibles cursos
	 */
	private Curso curso;

	/**
	 * Constructor del Estudiante
	 * 
	 * @param nombre
	 *            Nombre del estudiante
	 * @param apellido1
	 *            Primer apellido
	 * @param apellido2
	 *            Segundo apellido
	 * @param curso
	 *            Curso al que pertenece
	 */
	public Estudiante(String nombre, String apellido1, String apellido2, Curso curso) {
		setNombre(nombre);
		setApellido1(apellido1);
		setApellido2(apellido2);
		setCurso(curso);
	}

	/**
	 * Obtiene el nombre del alumno
	 * 
	 * @return Una cadena con el nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene el primer apellido del alumno
	 * 
	 * @return Una cadena con el primer apellido del alumno
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Obtiene el segundo apellido del alumno
	 * 
	 * @return Una cadena con el segundo apellido del alumno
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * Modifica el nombre del alumno
	 * 
	 * @param nombre
	 *            Nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Modifica el primer apellido del alumno
	 * 
	 * @param apellido1
	 *            Primer apellido
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Modifica el segundo apellido del alumno
	 * 
	 * @param apellido2
	 *            Segundo apellido
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Obtiene el curso
	 * 
	 * @return Una cadena con el curso
	 */
	public Curso getCurso() {
		return curso;
	}

	/**
	 * Modifica el curso
	 * 
	 * @param curso
	 *            Una cadena con el curso
	 * @return
	 */
	public Curso setCurso(Curso curso) {
		return this.curso = curso;
	}

	/**
	 * Incrementa el curso en funcion de la etapa
	 * 
	 */
	public String incCurso() {
		switch (curso) {
		case ESO1:
		case ESO2:
		case ESO3:
		case BACH1:
		case DAW1:
			setCurso(Curso.values()[getCurso().ordinal() + 1]);
			return "Curso incrementado";
		default:
			return "No se puede promocionar mas";
		}
	}

	/**
	 * Cambia la etapa del alumno en los casos 4ESO y 2BACH
	 * 
	 * @param curso
	 *            Curso del alumno
	 */
	public String cambiarEtapa() {
		switch (curso) {
		case ESO4:
			setCurso(Curso.BACH1);
			return "";
		case BACH2:
			setCurso(Curso.DAW1);
		default:
			return "No esta en un curso adecuado para cambiar de etapa";
		}
	}

	/**
	 * Non-Javadoc
	 */
	@Override
	public String toString() {
		return "El estudiante " + getNombre() + ", " + getApellido1() + " " + getApellido2() + " matriculado en "
				+ getCurso().getNombre();
	}
}
