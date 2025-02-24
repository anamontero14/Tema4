package boletin3.ejer6;

import java.util.Scanner;

public class PrincipalFuncionesMatematicas {

	public static void main(String[] args) {

		// scanner
		Scanner leer = new Scanner(System.in);

		// variable para almacenar hasta qué nº se quiere sumar
		int numero;

		// variable para almacenar el número que se elevará
		int numeroAElevar;

		// variable para almacenar el exponente
		int exponente;

		// variable donde se almacenara el numero para la serie fibonacci
		int numeroFibonacci;

		System.out.print("Introduzca hasta qué nº quiere sumar: ");
		numero = leer.nextInt();

		System.out.println(FuncionesMatematicas.sumatorio(numero));

		System.out.println();
		System.out.println();

		System.out.print("Introduzca el nº que quiere elevar: ");
		numeroAElevar = leer.nextInt();
		System.out.print("Introduzca el exponente:");
		exponente = leer.nextInt();
		System.out.println(FuncionesMatematicas.potencia(numeroAElevar, exponente));

		System.out.println();
		System.out.println();
		System.out.print("Introduzca el número del que quiere hacer la serie Fibonacci: ");
		numeroFibonacci = leer.nextInt();
		System.out.println(FuncionesMatematicas.serieFibonacci(numeroFibonacci));

		// cerrar scanner
		leer.close();

	}

}
