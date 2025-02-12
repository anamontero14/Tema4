package boletin2.ejer3;

import java.util.Scanner;

public class PrincipalAlumno {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// variable para salir
		boolean salir = false;

		// creo los alumnos
		Alumno alumno1 = null;
		Alumno alumno2 = null;

		// contador
		int cont = 1;

		// variables para los atributos
		String nombreCompleto = "";
		double notaMedia;

		System.out.println();
		System.out.println("LIMITADO A 2 ALUMNOS");
		System.out.println();

		// bucle con menu
		while (!salir) {
			switch (menu()) {

			case 1 -> {

				// limpiar buffer
				leer.nextLine();

				System.out.println("Introduzca un nuevo alumno: ");
				System.out.print("Nombre: ");
				nombreCompleto = leer.nextLine();

				System.out.println();
				System.out.println("Introduzca su nota media: ");
				notaMedia = leer.nextDouble();

				// le hace el constructor dependiendo de a quien le toque
				if (cont == 1) {
					alumno1 = new Alumno(nombreCompleto, notaMedia);
					System.out.println(alumno1);
				} else if (cont == 2) {
					alumno2 = new Alumno(nombreCompleto, notaMedia);
					System.out.println(alumno2);
				}
			}

			case 2 -> {

				// limpiar buffer
				leer.nextLine();

				System.out.println("COMPARAR ALUMNOS");

				if (alumno1.getNombreCompleto().equals(alumno2.getNombreCompleto())) {
					System.err.println("\tLos alumnos son iguales");
				} else {
					System.out.println("\tLos alumnos son diferentes");
				}

			}

			default -> {
				salir = true;
			}

			}

			cont++;
		}

		System.out.println("Fin");

		// cierro el scanner
		leer.close();

	}

	static int menu() {

		int opcion = 0;

		System.out.println("ESCOJA UNA OPCIÓN\n");

		System.out.println("\t1) Meter un alumno nuevo con su nota media");
		System.out.println("\t2) Comparar alumnos");
		System.out.println("\t3) Salir");

		System.out.print("Respuesta: ");
		opcion = leer.nextInt();

		return opcion;
	}

}
