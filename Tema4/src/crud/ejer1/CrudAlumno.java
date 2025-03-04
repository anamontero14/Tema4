package crud.ejer1;

import java.util.ArrayList;
import java.util.List;

public class CrudAlumno {

	/**
	 * Atributo que almacenará todos los alumnos de la lista
	 */
	static List<Alumno> listaAlumnos = new ArrayList<Alumno>();

	/**
	 * muestro todos los objetos de la lista
	 */
	public static void listarAlumnos() {

		for (Alumno a : listaAlumnos) {
			System.out.println(a);
			System.out.println();
		}

	}

	/**
	 * Añade un nuevo alumno a la lista
	 * 
	 * @param nombre
	 * @param media
	 * @return true o false dependiendo de si ha podido realizar la operacion o no
	 */
	public static boolean nuevoAlumno(Alumno alumno) {

		boolean validez = true;

		// si el objeto esta en la lista devuelve que la validez de la operacion es
		// false
		if (listaAlumnos.contains(alumno)) {
			System.err.println("El alumno ya existe");
			validez = false;
		} else {

			// si no esta en la lista lo añade y devuelve true
			listaAlumnos.add(alumno);
			System.out.println("Se añadió el alumno.");
		}

		return validez;
	}

	/**
	 * Modifica un alumno
	 * 
	 * @param alumno
	 * @param media
	 * @return true o false dependiendo de la validez del metodo
	 */
	public static boolean modificarAlumno(Alumno alumno, double media) {

		boolean validez;
		// comprueba si esta o no
		int indice = listaAlumnos.indexOf(alumno);
		if (indice >= 0) {
			listaAlumnos.get(indice).setNotaMedia(media);
			validez = true;
		} else {
			System.err.println("El alumno no se encuentra");
			validez = false;
		}

		return validez;

	}

	/**
	 * Elimina el objeto de la lista
	 * 
	 * @param alumno
	 * @return si se ha podido ejecutar la operacion o no
	 */
	public static boolean eliminarAlumno(Alumno alumno) {
		boolean validez = true;

		if (listaAlumnos.contains(alumno)) {
			// elimino al alumno
			if (listaAlumnos.remove(alumno)) {
				System.out.println("El alumno se eliminó correctamente.");
			} else {
				System.err.println("El alumno no se puede eliminar.");
				validez = false;
			}
		} else {
			System.err.println("El alumno no se encuentra.");
			validez = false;
		}

		return validez;
	}

}
