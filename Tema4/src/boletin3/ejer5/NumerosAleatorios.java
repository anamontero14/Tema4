package boletin3.ejer5;

import java.util.Random;

public class NumerosAleatorios {

	/**
	 * Recibirá un argumento de tipo entero que indicará la cantidad de números
	 * aleatorios a generar. Esta función generará números aleatorios comprendidos
	 * entre 0 y 1 y los mostrará por pantalla
	 * 
	 * @param num1
	 */
	public void numerosAleatorios(int num1) {
		// clase random
		Random rand = new Random();

		// bucle para generar los numeros
		for (int i = 0; i <= num1; i++) {
			System.out.println(rand.nextInt(0, 2));
		}
	}

	public void numerosAleatorios(int num1, int num2) {
		// clase random
		Random rand = new Random();

		// bucle para generar los numeros
		for (int i = 0; i <= num1; i++) {
			System.out.println(rand.nextInt(0, num2 + 1));
		}
	}

	public void numerosAleatorios(int num1, int num2, int num3) {
		// clase random
		Random rand = new Random();

		// bucle para generar los numeros
		for (int i = 0; i <= num1; i++) {
			System.out.println(rand.nextInt(num2, num3 + 1));
		}
	}

}
