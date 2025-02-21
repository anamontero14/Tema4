package boletin3.ejer3;

public class SumaEnteros {

	/**
	 * Suma todos los números desde el parámetro de entrada hasta el 0
	 * 
	 * @param numero
	 * @return devuelve la suma de estos
	 */
	public int sumaEnteros(int numero) {

		int resultado = 0;

		if (numero == 0) {
			resultado += 0;
		} else {
			resultado = numero + sumaEnteros(numero - 1);
		}

		return resultado;
	}

	public int sumaEnteros(int num1, int num2) {
		int resultado = 0;
		int numMax = Math.max(num1, num2);
		int numMin = Math.min(num1, num2);

		if (numMax == numMin) {
			resultado += 0;
		} else {
			resultado += numMax + sumaEnteros(numMax - 1);
		}

		return resultado;
	}
}
