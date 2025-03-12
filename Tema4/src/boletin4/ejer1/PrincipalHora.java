package boletin4.ejer1;

import java.util.Scanner;

public class PrincipalHora {

	public static void main(String[] args) {

		// creo las variables que harán referencia a los atributos
		int hora;
		int minuto;
		int segundo;

		// variable para guardar la respuesta
		char resp;

		// creo un objeto
		Hora horaObj;

		// Creo el scanner
		Scanner leer = new Scanner(System.in);

		System.out.print("Introduzca la hora: ");
		hora = leer.nextInt();

		// limpiar el buffer
		leer.nextLine();

		System.out.print("Introduzca los minutos: ");
		minuto = leer.nextInt();

		// limpiar el buffer
		leer.nextLine();

		System.out.print("Introduzca los segundos: ");
		segundo = leer.nextInt();

		// limpiar el buffer
		leer.nextLine();

		// hacer el constructor
		horaObj = new Hora(hora, minuto, segundo);

		System.out.println("¿Quiere incrementar la hora? (S/N)");
		resp = leer.next().toUpperCase().charAt(0);

		// bucle para incrementar la hora
		while (resp == 'S') {
			horaObj.incrementar();

			System.out.println(horaObj);

			System.out.println("¿Quiere incrementar la hora? (S/N)");
			resp = leer.next().toUpperCase().charAt(0);
		}

		// cierro el scanner
		leer.close();

	}

}
