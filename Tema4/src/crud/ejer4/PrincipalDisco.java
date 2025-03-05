package crud.ejer4;

import java.util.Scanner;

public class PrincipalDisco {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// almacena el codigo del disco
		int codigo;

		// almacena el nombre del autor
		String autor;

		// almacena el titulo del disco
		String titulo;

		// almacena la duracion del disco
		double duracion = 0;

		// almacena el genero del disco
		String genero;

		// almacena la opcion escogida en el menu
		int opcionMenu;

		// nuevo objeto
		Disco disco;

		do {
			// almaceno la opcion del menu en la variable
			opcionMenu = menu();

			// switch del menu
			switch (opcionMenu) {
			case 1 -> {
				CrudDisco.listadoDiscos();
			}
			case 2 -> {
				System.out.println("NUEVO DISCO");
				System.out.print("Código: ");
				codigo = leer.nextInt();
				System.out.print("Autor: ");
				autor = leer.nextLine();
				System.out.print("Título: ");
				titulo = leer.nextLine();
				System.out.println("Género: ");
				genero = leer.nextLine();

				// hago el constructor
				disco = new Disco(codigo, autor, titulo, duracion);
			}
			case 3 -> {
			}
			case 4 -> {
				System.out.println("Saliendo...");
			}
			default -> {
				System.out.println("Opción incorrecta.");
			}
			}

		} while (opcionMenu != 4);

		System.out.println("Fin del programa.");

		// cierro el scanner
		leer.close();

	}

	// funcion para mostrar el menu
	public static int menu() {
		// opcion del menu
		int opcion;

		System.out.println();
		System.out.println("COLECCIÓN DE DISCOS\n===================");
		System.out.println("\t1. Listado.");
		System.out.println("\t2. Nuevo Disco.");
		System.out.println("\t3. Borrar.");
		System.out.println("\t4. Salir.");
		System.out.println();
		System.out.print("Opción: ");
		opcion = leer.nextInt();
		// limpio el buffer
		leer.nextLine();

		return opcion;
	}

}
