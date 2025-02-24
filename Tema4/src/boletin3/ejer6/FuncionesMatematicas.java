package boletin3.ejer6;

public class FuncionesMatematicas {

	/**
	 * Devuelve la suma de todos los números entre 1 y n
	 * 
	 * @param numero
	 * @return
	 */
	public static int sumatorio(int numero) {
		int resultado = 0;

		if (numero == 1) {
			resultado += 1;
		} else {
			resultado += numero + sumatorio(numero - 1);
		}

		return resultado;
	}

	/**
	 * Devuelve el resultado de a^n
	 * 
	 * @param a
	 * @param n exponente
	 * @return
	 */
	public static double potencia(double a, int n) {
		double resultado = 0;

		if (n == 0) {
			resultado = 1;
		} else {
			resultado = a * potencia(a, n - 1);
		}

		return resultado;
	}

	/**
	 * Esta función se le pasará un número entero y nos devolverá el término
	 * correspondiente de la serie de Fibonacci. El enésimo valor de la serie de
	 * Fibonacci se calcula sumando los dos valores anteriores de la serie
	 * 
	 * @param numero
	 * @return
	 */
	public static int serieFibonacci(int numero) {
		int resultado = 0;

		if (numero == 0 || numero == 1) {
			resultado = 1;
		} else {
			resultado = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
		}

		return resultado;
	}

}
