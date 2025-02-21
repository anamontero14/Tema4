package boletin3.ejer4;

public class ParseToBoolean {

	/**
	 * Recibirá un argumento de tipo entero que devuelva false si el argumento es 0
	 * y true si el argumento es 1
	 * 
	 * @param numero
	 * @return devuelve true o false
	 */
	public boolean parseToBoolean(int numero) {
		return numero == 1 ? true : false;
	}

	/**
	 * Recibirá un argumento de tipo String que devuelva false si la cadena es igual
	 * a “false” y true si la cadena es igual a “true”
	 * 
	 * @param cadena
	 * @return devolverá true o false
	 */
	public boolean parseToBoolean(String cadena) {
		return cadena.equalsIgnoreCase("true") ? true : false;
	}

}
