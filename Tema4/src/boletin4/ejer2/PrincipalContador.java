package boletin4.ejer2;

import java.util.Scanner;

public class PrincipalContador {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		int num;
		int opcionMenu;

		Contador cont;

		System.out.print("Introduzca el nº del contador: ");
		num = leer.nextInt();
		// limpiar el buffer
		leer.nextLine();

		cont = new Contador(num);

		do {

			switch (opcionMenu = menu()) {
			case 1 -> {
				System.out.println("Incrementar: ");
				cont.incrementar();
				System.out.println(cont);
			}
			case 2 -> {
				System.out.println("Decrementar: ");
				cont.decrementar();
				System.out.println(cont);
			}
			default -> {
				System.err.println("Saliendo...");
			}
			}

		} while (opcionMenu == 1 || opcionMenu == 2);

		System.out.println("Fin del programa");

		leer.close();

	}

	public static int menu() {
		int opcion;

		System.out.println();
		System.out.println("1. Incrementar");
		System.out.println("2. Decrementar");
		System.out.print("Opcion: ");
		opcion = leer.nextInt();
		// limpiar el buffer
		leer.nextLine();

		return opcion;
	}

}
