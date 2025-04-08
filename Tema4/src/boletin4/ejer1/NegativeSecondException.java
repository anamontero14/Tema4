package boletin4.ejer1;

/**
 * Clase para la excepción que se lanza si se meten los segundos en negativo
 */
public class NegativeSecondException extends Exception {

	@Override
	public String toString() {
		return "Los segundos no pueden ser negativos";
	}

}
