package boletin4.ejer3;

import java.util.Scanner;

public class PrincipalFecha {

	public static void main(String[] args) {

		int dia;
		int mes;
		int año;

		Fecha fechaObj;

		Scanner leer = new Scanner(System.in);

		System.out.println("Introduzca una fecha: ");
		System.out.print("Dia: ");
		dia = leer.nextInt();
		leer.nextLine();

		System.out.print("Mes: ");
		mes = leer.nextInt();
		leer.nextLine();

		System.out.print("Año: ");
		año = leer.nextInt();
		leer.nextLine();

		fechaObj = new Fecha(dia, mes, año);

		System.out.println("Fecha: " + fechaObj);

		System.out.println("Pasando de día...");
		fechaObj.diaSiguiente();
		System.out.println("Fecha: " + fechaObj);
		leer.close();

	}

}
