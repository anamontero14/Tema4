package boletin4.ejer1;

/**
 * Clase que lanza una excepción cuando se introducen los minutos en negativo
 */
public class NegativeMinuteException extends Exception {

	@Override
	public String toString() {
		return "Los minutos no pueden ser negativos";
	}
}
