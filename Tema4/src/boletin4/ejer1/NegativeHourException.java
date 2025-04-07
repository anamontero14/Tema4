package boletin4.ejer1;

/**
 * Clase que lanza una excepción una vez que las horas introducidas sean
 * negativas
 */
public class NegativeHourException extends Exception {

	@Override
	public String toString() {
		return "Las horas no pueden ser negativas";
	}

}
