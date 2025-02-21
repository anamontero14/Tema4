package boletin3.ejer3;

import java.util.Scanner;

public class PrincipalSumaEnteros {

	public static void main(String[] args) {

		// creacion del scanner
		Scanner leer = new Scanner(System.in);

		// creacion del objeto
		SumaEnteros suma1 = new SumaEnteros();
		SumaEnteros suma2 = new SumaEnteros();

		// creo la variable para almacenar de cuál nº queremos saber la suma
		int num;

		// creo las variables para los dos numeros
		int num1;
		int num2;

		System.out.print("¿De qué número quiere saber la suma de todos los números que lo componen?: ");
		num = leer.nextInt();

		System.out.println(suma1.sumaEnteros(num));

		System.out.print("Introduzca los dos números desde los que quiere sumar: ");
		num1 = leer.nextInt();
		num2 = leer.nextInt();

		System.out.println(suma2.sumaEnteros(num1, num2));

		// cerrar el scanner
		leer.close();
	}

}
