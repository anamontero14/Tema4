package boletin1.ejer3;

public class Rectangulo {

	// DECLARO LAS VARIABLES PARA EL RECTANGULO

	/** Variable para el primer valor horizontal */
	int x1;

	/** Variable para el segundo valor horizontal */
	int x2;

	/** Variable para el primer valor en vertical */
	int y1;

	/** Variable para el segundo valor en vertical */
	int y2;

	/**
	 * Constructor con los 4 atributos como parámetros el cuál comprobará los
	 * parámetros con un if. Si son válidos guardará los parámetros en el objeto. En
	 * caso contrario, los atributos se quedarán con los valores por defecto.
	 * 
	 * @param x1 representa el punto en horizontal de la primera coordenada
	 * @param y1 representa el punto en vertical de la primera coordenada
	 * @param x2 representa el punto en horizontal de la segunda coordenada
	 * @param y2 representa el punto en vertical de la segunda coordenada
	 */
	Rectangulo(int x1, int x2, int y1, int y2) {

		// compruebo si x1 es menor que x2
		if (x1 < x2) {
			this.x1 = x1;
			this.x2 = x2;
		}

		// comprueba si y1 es menor que y2
		if (y1 < y2) {
			this.y1 = y1;
			this.y2 = y2;
		}

	}

}
