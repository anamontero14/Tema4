package boletin2.ejer4;

import java.util.Scanner;

public class PizzaPrincipal {

	// creacion del scanner
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// creo el primer objeto
		Pizza pizza1;
		Pizza pizza2;

		// creo las variables que corresponderán a los atributos del objeto
		int codigo;
		String tamaño = "";
		String tipo = "";
		String estado = "";

		System.out.print("Introduzca el código de su pedido: ");
		codigo = leer.nextInt();

		// limpiar el buffer
		leer.nextLine();

		System.out.print("Introduzca el tamaño de su pizza (MEDIANA/FAMILIA): ");
		tamaño = leer.next().toUpperCase();

		System.out.print("Introduzca el tipo de su pizza (MARGARITA/CUATROQUESOS/FUNGHI): ");
		tipo = leer.next().toUpperCase();

		System.out.print("Introduzca el estado en el que se encuentra su pizza (PEDIDA/SERVIDA): ");
		estado = leer.next().toUpperCase();

		// le asigno los valores al objeto
		pizza1 = new Pizza(codigo, tamaño, tipo);

		// le hago un set del estado
		pizza1.setEstado(estado);

		// muestor los atributos de la pizza
		System.out.println(pizza1);

		System.out.println();
		System.out.print("Introduzca el código de su pedido: ");
		codigo = leer.nextInt();

		// limpiar el buffer
		leer.nextLine();

		System.out.print("Introduzca el tamaño de su pizza (MEDIANA/FAMILIA): ");
		tamaño = leer.next().toUpperCase();

		System.out.print("Introduzca el tipo de su pizza (MARGARITA/CUATROQUESOS/FUNGHI): ");
		tipo = leer.next().toUpperCase();

		System.out.print("Introduzca el estado en el que se encuentra su pizza (PEDIDA/SERVIDA): ");
		estado = leer.next().toUpperCase();

		// le asigno los valores al objeto
		pizza2 = new Pizza(codigo, tamaño, tipo);

		// le hago un set del estado
		pizza2.setEstado(estado);

		// muestor los atributos de la pizza
		System.out.println(pizza2);

		System.out.println("¿Son las dos pizzas iguales?");

		// comprueba si las pizzas son iguales
		if (pizza1.equals(pizza2)) {
			System.out.println("Sí, las dos pizzas son iguales.");
		} else {
			System.out.println("No, las pizzas son diferentes.");
		}

		// cierro el scanner
		leer.close();
	}

}
