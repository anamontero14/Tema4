package boletin4.ejer3;

import java.util.Scanner;

public class PrincipalFecha {

	public static void main(String[] args) {

		int dia;
		int mes;
		int año;

		boolean salir = false;

		Fecha fechaObj = null;

		Scanner leer = new Scanner(System.in);

		System.out.println("Introduzca una fecha: ");

		do {
			System.out.print("Dia: ");
			dia = leer.nextInt();
			leer.nextLine();

			System.out.print("Mes: ");
			mes = leer.nextInt();
			leer.nextLine();

			System.out.print("Año: ");
			año = leer.nextInt();
			leer.nextLine();

			try {
				fechaObj = new Fecha(dia, mes, año);
				salir = true;
			} catch (ExcepcionDia e) {
				System.err.println(e.toString());
			} catch (ExcepcionMes e) {
				System.err.println(e.toString());
			} catch (ExcepcionAño e) {
				System.err.println(e.toString());
			} finally {
				leer.nextLine();
			}
		} while (!salir);

		System.out.println("Fecha: " + fechaObj);

		System.out.println("Pasando de día...");
		fechaObj.diaSiguiente();
		System.out.println("Fecha: " + fechaObj);
		leer.close();

	}

}
