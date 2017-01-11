package tetsEstudiante;

import ies.Curso;
import ies.Estudiante;
import menu.Menu;
import utiles.Teclado;

/**
 * Implementa la clase TestEstudiante() para probar la clase Estudiante:
 * Mediante un menú se podrá crear un estudiante, borrarlo, mostrarlo y modificarlo. 
 * Tendrás al menos las clases: 
 * a. ies.Estudiante.java, 
 * b. testEstudiante.TestEstudiante.java, 
 * c. utiles.Menu.java. 
 * Deberás crear al menos un menú con las opciones “alta”, “baja”, “mostrar”, “modificar” y “salir”, 
 * y otro con las opciones “promocionar” o “cambiar de etapa”
 * 
 * @author Victoriano Sevillano Vega
 * @version 1.0
 */
public class TestEstudiante {

	private static Estudiante estudiante;
	private static Menu menuModificar;
	private static Menu menuPpal;
	private static Menu menuCurso;

	public static void main(String[] args) {
		int opcion;
		menuPpal = new Menu("Titulo", new String[] { "Alta", "Baja", "Mostrar", "Modificar", "Salir" });
		menuModificar = new Menu("*** MODIFICAR ESTUDIANTE ***",
				new String[] { "Promocionar", "Cambiar etapa", "Volver" });
		menuCurso = new Menu("Seleccione el curso:",
				new String[] { Curso.ESO1.name(), Curso.ESO2.name(), Curso.ESO3.name(), Curso.ESO4.name(),
						Curso.BACH1.name(), Curso.BACH2.name(), Curso.DAW1.name(), Curso.DAW2.name() });

		do {
			opcion = menuPpal.gestionar();
			gestionarEstudiante(opcion);
		} while (opcion != 5);
	}

	/**
	 * Gestiona las opciones del menu principal
	 * 
	 * @param opcion
	 *            Entero con la opcion seleccionada
	 */
	private static void gestionarEstudiante(int opcion) {
		switch (opcion) {
		case 1:
			estudiante = new Estudiante(Teclado.leerCadena("Nombre:"), Teclado.leerCadena("Primer apellido:"),
					Teclado.leerCadena("Segundo apellido:"), pedirCurso());
			break;
		case 2:
			if (estudiante == null) {
				System.err.println("No hay ningun alumno creado!\n");
			} else {
				estudiante = null;
			}
			break;
		case 3:
			if (estudiante == null) {
				System.err.println("Primero debes crear el estudiante\n");
			} else {
				System.out.println(estudiante.toString());
			}
			break;
		case 4:
			if (estudiante == null) {
				System.err.println("Primero debes crear el estudiante\n");
			} else {
				modificarEstudiante();
			}
			break;
		case 5:
			System.out.println("Adios!");
			break;
		}
	}

	/**
	 * Pide un curso
	 * 
	 * @return Curso seleccionado
	 */
	private static Curso pedirCurso() {
		switch (menuCurso.gestionar()) {
		case 1:
			return Curso.ESO1;
		case 2:
			return Curso.ESO2;
		case 3:
			return Curso.ESO3;
		case 4:
			return Curso.ESO4;
		case 5:
			return Curso.BACH1;
		case 6:
			return Curso.BACH2;
		case 7:
			return Curso.DAW1;
		default: // Mejor que case 7
			return Curso.DAW2;
		}
	}

	/**
	 * Modifica el curso un estudiante o la etapa.
	 */
	private static void modificarEstudiante() {
		switch (menuModificar.gestionar()) {
		case 1:
			System.out.println(estudiante.incCurso());
			break;
		case 2:
			System.out.println(estudiante.cambiarEtapa());
			break;
		case 3:
			break;
		}
	}
}
