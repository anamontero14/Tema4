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

		// devuelve si la persona es mayor de edad o no
		System.out.println("La persona: " + objeto1 + " Es mayor de edad: " + objeto1.esMayorEdad());

		// devuelve si la persona es mayor de edad o no
		System.out.println("La persona: " + objeto2 + " Es jubilada: " + objeto2.esJubilado());

		// devuelve la diferencia de edad entre dos personas
		System.out.println(objeto1.diferenciaEdad(objeto2));

		// cerrar el scanner
		leer.close();
	}

}
