package practica2;

import java.util.Scanner;

public class PrincipalGestionLibro {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// atributos iguales a los de la clase
		String nombre;
		String autor;
		String genero;
		String nombreBiblioteca;

		// creacion del objeto
		LibroGestion libro;

		// variable para guardar la opcion del menu
		int opcionMenu;

		do {

			menu();
			System.out.print("Opción: ");
			opcionMenu = leer.nextInt();
			// limpiar el buffer
			leer.nextLine();

			switch (opcionMenu) {
			case 1 -> {
				System.out.println();
				System.out.println("LISTA DE LIBROS");
				// llamar a la funcion
				CrudGestionLibro.mostrarLibros();

			}
			case 2 -> {

				System.out.println();
				System.out.println("AÑADIR UN NUEVO LIBRO");

				libro = crearObejetoCompleto();

				// llamar a la funcion y hacer el if
				if (CrudGestionLibro.añadirLibro(libro)) {
					System.out.println();
					System.out.println("\tEl libro se añadió con éxito");
				} else {
					System.out.println();
					System.err.println("\tEl libro no se pudo añadir");
				}

			}
			case 3 -> {

				System.out.println();
				System.out.println("ELIMINAR UN LIBRO");
				// llamo a la funcion que crea un obj con solo la PK (codigo)
				libro = crearObjPk();

				// llamo a la funcion y hago if
				if (CrudGestionLibro.eliminarLibro(libro)) {
					System.out.println();
					System.out.println("\tEl libro pudo eliminarse con éxito");
				} else {
					System.out.println();
					System.err.println("\tEl libro no se pudo eliminar");
				}

			}
			case 4 -> {

				System.out.println();
				System.out.println("CAMBIAR EL GÉNERO");
				// llamo a la funcion que crea un obj con solo la PK (codigo)
				libro = crearObjPk();

				// pido el genero al que cambiara
				genero = recogerGenero();

				// llamo a la funcion y hago el if
				if (CrudGestionLibro.modificarGenero(libro, genero)) {
					System.out.println();
					System.out.println("\tEl género se cambió exitosamente");
				} else {
					System.out.println();
					System.err.println("\tEl género no se pudo cambiar");
				}
			}
			case 5 -> {

				System.out.println();
				System.out.print("CAMBIAR EL AUTOR");
				libro = crearObjPk();
				autor = recogerAutor();

				// llamo a la funcion y hago el if
				if (CrudGestionLibro.modificarAutor(libro, autor)) {
					System.out.println();
					System.out.println("\tSe modificó el autor con éxito");
				} else {
					System.out.println();
					System.err.println("\tEl autor no se pudo modificar");
				}
			}
			case 6 -> {

				System.out.println();
				System.out.println("CAMBIAR EL NOMBRE");
				libro = crearObjPk();
				nombre = recogerNombre();

				// llamo a la funcion y hago el if
				if (CrudGestionLibro.modificarNombre(libro, nombre)) {
					System.out.println();
					System.out.println("\tEl nombre se cambió con éxito");
				} else {
					System.out.println();
					System.err.println("\tEl nombre no se pudo modificar");
				}

			}
			case 7 -> {

				System.out.println();
				System.out.println("CAMBIAR DE BIBLIOTECA");

				System.out.println("Introduzca el nombre de la biblioteca nueva: ");
				nombreBiblioteca = leer.nextLine();

				// llamo a la funcion y hago el if
				if (CrudGestionLibro.cambiarBiblioteca(nombreBiblioteca)) {
					System.out.println();
					System.out.println("\tEl nombre de la biblioteca se modificó con éxito");
				} else {
					System.out.println();
					System.err.println("\tEl nombre de la biblioteca no se pudo cambiar");
				}

			}
			case 0 -> {
				System.out.println("SALIENDO...");
			}
			default -> {
				System.err.println("Opción no válida");
			}
			}

		} while (opcionMenu != 0);

		System.out.println("Fin del programa");

		// cerrar escaner
		leer.close();

	}

	// mostrar el menu
	public static void menu() {
		System.out.println();
		System.out.println("GESTION DE LIBROS");
		System.out.println("\t1. Mostrar libros");
		System.out.println("\t2. Añadir un nuevo libro");
		System.out.println("\t3. Eliminar un libro");
		System.out.println("\t4. Cambiar el género");
		System.out.println("\t5. Cambiar el autor");
		System.out.println("\t6. Cambiar el nombre");
		System.out.println("\t7. Cambiar de biblioteca");
		System.out.println("\t0. Salir");
		System.out.println();
	}

	// leer el codigo
	private static int recogerCodigo() {
		int codigo;

		System.out.print("Código: ");
		codigo = leer.nextInt();
		// limpiar el buffer
		leer.nextLine();

		return codigo;
	}

	// crear el objeto completo
	private static LibroGestion crearObejetoCompleto() {
		int codigo = recogerCodigo();
		String nombre = recogerNombre();
		String autor = recogerAutor();
		int numPaginas;
		String genero = recogerGenero();

		System.out.println("Introduzca el nº de páginas: ");
		numPaginas = leer.nextInt();
		// limpiar buffer
		leer.nextLine();

		// objeto
		LibroGestion libro = new LibroGestion(codigo, nombre, autor, numPaginas, genero);

		return libro;
	}

	private static String recogerGenero() {
		String genero;
		System.out.print("Género del libro (TERROR/ROMANCE/ACCIÓN): ");
		genero = leer.next().toUpperCase();
		return genero;
	}

	private static String recogerAutor() {
		String autor;
		System.out.print("Autor: ");
		autor = leer.nextLine();
		return autor;
	}

	private static String recogerNombre() {
		String nombre;
		System.out.print("Nombre: ");
		nombre = leer.nextLine();
		return nombre;
	}

	// crear objeto solo con PK
	private static LibroGestion crearObjPk() {
		LibroGestion libro = new LibroGestion(recogerCodigo());
		return libro;
	}

}
