package boletin4.ejer1;

import java.util.Scanner;

public class PrincipalHora2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		// atributos de la clase hora
		int hora;
		int minutos;
		int segundos;

		// Objetos
		Hora hora1 = new Hora(16, 4, 0);
		boolean salir = false;

		do {

			System.out.println("Introduzca la nueva hora: ");
			hora = leer.nextInt();
			// limpiar el buffer
			leer.nextLine();

			System.out.println("Introduzca los nuevos minutos: ");
			minutos = leer.nextInt();
			// limpiar el buffer
			leer.nextLine();

			System.out.println("Introduzca los nuevos segundos: ");
			segundos = leer.nextInt();
			// limpiar el buffer
			leer.nextLine();

			try {

				hora1.setHora(hora);
				hora1.setMinuto(minutos);
				hora1.setSegundo(segundos);
				salir = true;
			} catch (NegativeHourException n1) {
				System.err.println(n1.toString());
			} catch (NegativeMinuteException n2) {
				System.err.println(n2.toString());
			} catch (NegativeSecondException n3) {
				System.err.println(n3.toString());
			}

		} while (!salir);

		System.out.println(hora1);

		leer.close();
	}

}
