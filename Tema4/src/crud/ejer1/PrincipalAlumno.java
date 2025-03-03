package crud.ejer1;

import java.util.Scanner;

import boletin2.ejer3.CrudAlumno;

public class PrincipalAlumno {

	// crear el scanner
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		// variable que almacena la opcion
		int opcion;

		// varaible que almacena el nombre
		String nombre;

		// variable que almacena la media
		double media;

		Alumno alumno;

		// almaceno la opcion del menu en una variable
		opcion = menu();

		// sigue mostrando el menú mientras que la opcion no sea 5
		while (opcion != 5) {

			switch (opcion) {
			case 1 -> {
				// muestra la lista de todos los alumnos almacenados en la lista
				CrudAlumno.listarAlumnos();
			}
			case 2 -> {
				// limpiar el buffer
				leer.nextLine();

				// le pregunto por el nombre y la media
				System.out.print("Introduzca el nombre: ");
				nombre = leer.nextLine();
				System.out.println("Introduce la media: ");
				media = leer.nextDouble();

				// hago el constructor
				alumno = new Alumno(nombre, media);

				// llamo al metodo del crud para añadir un alumno
				CrudAlumno.nuevoAlumno(alumno);
			}
			case 3 -> {
				// limpio el buffer
				leer.nextLine();

				// le pregunto al usuario por el nombre
				System.out.print("Introduzca el nombre del alumno a modificar: ");
				nombre = leer.nextLine();

				System.out.print("Introduzca la media nueva del alumno: ");
				media = leer.nextInt();

				// le hago un constructor solo con el nombre
				alumno = new Alumno(nombre);

				// le paso el alumno y la media a cambiarle
				CrudAlumno.modificarAlumno(alumno, media);

			}
			case 4 -> {
			}
			}

			opcion = menu();
		}

		System.out.println("Saliendo...");

		// cerrar el scanner
		leer.close();

	}

	// funcion para crear un menú
	public static int menu() {

		// variable que almacenara la opcion escogida
		int opcion = 0;

		System.out.println("ALUMNOS/AS\n ===================");
		System.out.println("	1. Listado.");
		System.out.println("	2. Nuevo Alumno.");
		System.out.println("	3. Modificar.");
		System.out.println("	4. Borrar.");
		System.out.println("	5. Salir.");

		// recojo la respuesta
		opcion = leer.nextInt();

		return opcion;

	}

}
