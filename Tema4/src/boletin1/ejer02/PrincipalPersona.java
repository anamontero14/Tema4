package boletin1.ejer02;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		// creo el scanner
		Scanner leer = new Scanner(System.in);

		// Creo dos objetos
		Persona objeto1 = new Persona();
		Persona objeto2 = new Persona();

		// le pido a la persona sus datos
		System.out.println("Persona 1: ");
		System.out.print("Introduzca su dni: ");
		objeto1.dni = leer.nextLine();
		System.out.print("Introduzca su nombre: ");
		objeto1.nombre = leer.nextLine();
		System.out.print("Introduzca su apellido: ");
		objeto1.apellido = leer.nextLine();
		System.out.print("Introduzca su edad: ");
		objeto1.edad = leer.nextInt();

		// limpio el buffer
		leer.nextLine();

		// le pido a la persona sus datos
		System.out.println("Persona 2: ");
		System.out.print("Introduzca su dni: ");
		objeto2.dni = leer.nextLine();
		System.out.print("Introduzca su nombre: ");
		objeto2.nombre = leer.nextLine();
		System.out.print("Introduzca su apellido: ");
		objeto2.apellido = leer.nextLine();
		System.out.print("Introduzca su edad: ");
		objeto2.edad = leer.nextInt();

		// si la edad es mayor o igual que 18 es mayor de edad
		if (objeto1.edad >= 18) {
			System.out
					.println(objeto1.nombre + " " + objeto1.apellido + " con dni " + objeto1.dni + " es mayor de edad");
		} else {
			// si es menor de 18
			System.out.println(
					objeto1.nombre + " " + objeto1.apellido + " con dni " + objeto1.dni + " no es mayor de edad");

		}

		// si el objeto2
		if (objeto2.edad >= 18) {
			System.out
					.println(objeto2.nombre + " " + objeto2.apellido + " con dni " + objeto2.dni + " es mayor de edad");
		} else {
			// si es menor de 18
			System.out.println(
					objeto2.nombre + " " + objeto2.apellido + " con dni " + objeto2.dni + " no es mayor de edad");

		}

		// cerrar el scanner
		leer.close();
	}

}
