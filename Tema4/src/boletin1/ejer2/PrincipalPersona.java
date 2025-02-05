package boletin1.ejer2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		// creo el scanner
		Scanner leer = new Scanner(System.in);

		// creo los objetos
		Persona objeto1;
		Persona objeto2;

		// Creo las variables que almacenaran los datos
		String dni;
		String nombre;
		String apellido;
		int edad;

		// le pido a la persona sus datos
		System.out.println("Persona 1: ");
		System.out.print("Introduzca su dni: ");
		dni = leer.nextLine();
		System.out.print("Introduzca su nombre: ");
		nombre = leer.nextLine();
		System.out.print("Introduzca su apellido: ");
		apellido = leer.nextLine();
		System.out.print("Introduzca su edad: ");
		edad = leer.nextInt();

		// inicializo el objeto con los valores obtenidos
		objeto1 = new Persona(dni, nombre, apellido, edad);

		// limpio el buffer
		leer.nextLine();

		// le pido a la persona sus datos
		System.out.println("Persona 2: ");
		System.out.print("Introduzca su dni: ");
		dni = leer.nextLine();
		System.out.print("Introduzca su nombre: ");
		nombre = leer.nextLine();
		System.out.print("Introduzca su apellido: ");
		apellido = leer.nextLine();
		System.out.print("Introduzca su edad: ");
		edad = leer.nextInt();

		// asigno los valores del objeto 2 que se han recogido
		objeto2 = new Persona(dni, nombre, apellido, edad);

		// si la edad es mayor o igual que 18 es mayor de edad
		if (objeto1.getEdad() >= 18) {
			System.out.println(objeto1.getNombre() + " " + objeto1.getApellido() + " con dni " + objeto1.getDni()
					+ " es mayor de edad");
		} else {
			// si es menor de 18
			System.out.println(objeto1.getNombre() + " " + objeto1.getApellido() + " con dni " + objeto1.getDni()
					+ " no es mayor de edad");
		}

		// si el objeto2
		if (objeto2.getEdad() >= 18) {
			System.out.println(objeto2.getNombre() + " " + objeto2.getApellido() + " con dni " + objeto2.getDni()
					+ " es mayor de edad");
		} else {
			// si es menor de 18
			System.out.println(objeto2.getNombre() + " " + objeto2.getApellido() + " con dni " + objeto2.getDni()
					+ " no es mayor de edad");
		}

		// cerrar el scanner
		leer.close();
	}

}
