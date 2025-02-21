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

	public static double potencia(double a, int n) {
		double resultado = 0;

		if (a == 1) {
			resultado += 1;
		} else {
			resultado += a + potencia(a - 1, n);
		}

		return resultado;
	}

}
