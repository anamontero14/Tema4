package boletin3.ejer5;

import java.util.Scanner;

public class PrincipalNumerosAleatorios {

	public static void main(String[] args) {

		// creacion del scanner
		Scanner leer = new Scanner(System.in);

		// creo las 3 variables que contendrán los números que se pide
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		// creo el objeto
		NumerosAleatorios objetos1 = new NumerosAleatorios();

		// le pido al usuario los números
		System.out.print("Introduzca cuántos nº quiere generar: ");
		num1 = leer.nextInt();

		objetos1.numerosAleatorios(num1);

		System.out.println();
		System.out.println();

		// le pido al usuario los nº a generar y el nº tope
		System.out.println("Introduzca cuántos nº quiere generar y el nº máximo a generar respectivamente: ");
		num1 = leer.nextInt();
		num2 = leer.nextInt();

		objetos1.numerosAleatorios(num1, num2);

		// le pido al usuario los nº a generar, el nº más pequeño a generar y el nº tope
		System.out.println(
				"Introduzca cuántos nº quiere generar, el nº a generar más pequeño y el nº máximo a generar respectivamente: ");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();

		objetos1.numerosAleatorios(num1, num2, num3);

		// cierro el scanner
		leer.next();

	}

}
