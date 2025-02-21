package boletin3.ejer6;

import java.util.Scanner;

public class PrincipalFuncionesMatematicas {

	public static void main(String[] args) {

		// scanner
		Scanner leer = new Scanner(System.in);

		// variable para almacenar hasta qué nº se quiere sumar
		int numero;

		System.out.print("Introduzca hasta qué nº quiere sumar: ");
		numero = leer.nextInt();

		System.out.println(FuncionesMatematicas.sumatorio(numero));
		
		System.out.println();
		System.out.println();
		
		

		// cerrar scanner
		leer.close();

	}

}
