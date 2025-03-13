package practica2;

import java.util.HashSet;

public class CrudGestionLibro {

	public static HashSet<LibroGestion> listaLibros = new HashSet<LibroGestion>();

	// mostrar
	public static void mostrarLibros() {
		for (LibroGestion libro : listaLibros) {
			System.out.println();
			System.out.println(libro);
		}
	}

	// añadir
	public static boolean añadirLibro(LibroGestion libro) {
		return listaLibros.add(libro);
	}

	public static boolean eliminarLibro(LibroGestion libro) {
		return listaLibros.remove(libro);
	}

	// bucar el objeto
	public static LibroGestion buscarLibro(LibroGestion libro) {
		LibroGestion libro1 = null;

		// buscar
		for (LibroGestion li : listaLibros) {
			if (li.equals(libro)) {
				libro1 = li;
			}
		}

		return libro1;
	}

	/**
	 * modifica el autor
	 * 
	 * @param libroPk
	 * @param autorNuevo
	 * @return
	 */
	public static boolean modificarAutor(LibroGestion libroPk, String autorNuevo) {

		boolean validez = false;

		// objeto completo
		LibroGestion libroCompleto = CrudGestionLibro.buscarLibro(libroPk);

		// si el libro se encuentra se actualiza el autor
		if (libroCompleto != null) {
			libroCompleto.setAutor(autorNuevo);
			validez = true;
		}

		return validez;
	}

	public static boolean modificarGenero(LibroGestion libroPk, String generoNuevo) {

		boolean validez = false;

		LibroGestion libroCompleto = CrudGestionLibro.buscarLibro(libroPk);

		if (libroCompleto != null) {
			libroCompleto.setGenero(generoNuevo);
			validez = true;
		}

		return validez;
	}

	public static boolean modificarNombre(LibroGestion libroPk, String nombreNuevo) {
		boolean validez = false;

		LibroGestion libroCompleto = buscarLibro(libroPk);

		if (libroCompleto != null) {
			libroCompleto.setName(nombreNuevo);
			validez = true;
		}

		return validez;
	}

	public static boolean cambiarBiblioteca(String nuevoNombre) {
		boolean validez = false;

		if (nuevoNombre != null) {
			LibroGestion.setNombreBiblio(nuevoNombre);
			validez = true;
		}

		return validez;
	}

}
