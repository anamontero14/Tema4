package boletin2.ejer2;

import java.util.Scanner;

public class PrincipalLibro {

	public static void main(String[] args) {

		// creación del scanner
		Scanner leer = new Scanner(System.in);

		boolean salir = false;
		String respuesta = "";

		// creación de los objetos
		Libro libro1 = new Libro("El pan", "Juanillo", 10, 5, "DIDACTICO");
		Libro libro2 = new Libro("El agua", "Manolo Pérez", 54, 54, "POETICO");

		System.out.println();

		// muestro la información del primer objeto
		System.out.println(libro1);
		System.out.println(libro2);

		System.out.println();

		while (!salir) {

			for (int i = 1; i <= 2; i++) {
				System.out.print("¿Desea tomar prestado el libro " + i + "?: ");
				respuesta = leer.next();
				if (respuesta.equalsIgnoreCase("S")) {
					if (i == 1) {
						if (libro1.prestamo()) {
							System.out.println("  Se pudo tomar prestado el libro correctamente");
						} else {
							System.err.println("  No se pudo tomar prestado el libro");
						}
					} else {
						if (libro2.prestamo()) {
							System.out.println("  Se pudo tomar prestado el libro correctamente");
						} else {
							System.err.println("  No se pudo tomar prestado el libro");
						}
					}
				}
			}

			System.out.print("¿Desea seguir tomando prestado libros?: ");
			salir = leer.nextBoolean();
		}

		salir = false;

		while (!salir) {

			for (int i = 1; i <= 2; i++) {
				System.out.print("¿Desea devolver el libro " + i + "?: ");
				respuesta = leer.next();
				if (respuesta.equalsIgnoreCase("S")) {
					if (i == 1) {
						if (libro1.prestamo()) {
							System.out.println("  Se pudo devolver el libro correctamente");
						} else {
							System.err.println("  No se pudo devolver el libro");
						}
					} else {
						if (libro2.prestamo()) {
							System.out.println("  Se pudo devolver el libro correctamente");
						} else {
							System.err.println("  No se pudo devolver el libro");
						}
					}
				}
			}

			System.out.print("¿Desea seguir devolviendo libros?: ");
			salir = leer.nextBoolean();
		}

		System.out.println("Fin");

		// cerrar el scanner
		leer.close();

	}

}
