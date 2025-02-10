package boletin1.ejer3;

public class Rectangulo {

	// DECLARO LAS VARIABLES PARA EL RECTANGULO

	/** Variable para el primer valor horizontal */
	private int x1;

	/** Variable para el segundo valor horizontal */
	private int x2;

	/** Variable para el primer valor en vertical */
	private int y1;

	/** Variable para el segundo valor en vertical */
	private int y2;

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
		if (x1 <= x2) {
			this.x1 = x1;
			this.x2 = x2;
		}

		// comprueba si y1 es menor que y2
		if (y1 <= y2) {
			this.y1 = y1;
			this.y2 = y2;
		}

	}

	/**
	 * Recoje la x1
	 * 
	 * @return el primer punto horizontal (x) de la primera coordenada
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Asigna un valor a la x1 siempre y cuando tenga un valor menor que a x2
	 * 
	 * @param x1 x1 es el primer punto horizontal de la primera coordenada
	 */
	public void setX1(int x1) {
		if (x1 <= x2) {
			this.x1 = x1;
		}
	}

	/**
	 * Recoje la x2
	 * 
	 * @return el segundo punto horizontal (x) de la segunda coordenada
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Asigna un valor a la x2 siempre y cuando tenga un valor mayor que x1
	 * 
	 * @param x2 x2 es el segundo punto horizontal de la segunda coordenada
	 */
	public void setX2(int x2) {
		if (x2 >= x1) {
			this.x2 = x2;
		}
	}

	/**
	 * Recoje la y1
	 * 
	 * @return el primer punto vertical (y) de la primera coordenada
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Asigna un valor a la y1 siempre y cuando tenga un valor menor que a y2
	 * 
	 * @param y1 y1 es el primer punto vertical de la primera coordenada
	 */
	public void setY1(int y1) {
		if (y1 <= y2) {
			this.y1 = y1;
		}
	}

	/**
	 * Recoje la y2
	 * 
	 * @return el segundo punto vertical (y) de la segunda coordenada
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Asigna un valor a la y2 siempre y cuando tenga un valor mayor que y1
	 * 
	 * @param y2 y2 es el segundo punto vertical de la segunda coordenada
	 */
	public void setY2(int y2) {
		if (y2 >= y1) {
			this.y2 = y2;
		}
	}

	/**
	 * Método set doble
	 * 
	 * @param x1 Coordenada x para la coordenada 1
	 * @param y1 Coordenada y para la coordenada 1
	 */
	public void setX1Y1(int x1, int y1) {
		if (x1 <= x2 && y1 <= y2) {
			this.x1 = x1;
			this.y1 = y1;
		}
	}

	/**
	 * Método set doble para la segunda coordenada
	 * 
	 * @param x2 Coordenada x para la coordenada 2
	 * @param y2 Coordenada y para la coordenada 2
	 */
	public void setX2Y2(int x2, int y2) {
		if (x2 >= x1 && y2 >= y1) {
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	/**
	 * Método set para todos los atributos
	 * 
	 * @param x1 Coordenada x para la coordenada 1
	 * @param x2 Coordenada x para la coordenada 2
	 * @param y1 Coordenada y para la coordenada 1
	 * @param y2 Coordenada y para la coordenada 2
	 */
	public void setAll(int x1, int x2, int y1, int y2) {
		if (x1 <= x2 && y1 <= y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	/**
	 * Método para devolver el perímetro del rectángulo
	 * 
	 * @return
	 */
	public int getPerimetro() {
		int base = x2 - x1;
		int altura = y2 - y1;

		return 2 * (base + altura);
	}

	/**
	 * Devuelve el área del rectángulo
	 * 
	 * @return área del rectángulo
	 */
	public int getArea() {
		int base = x2 - x1;
		int altura = y2 - y1;

		return base * altura;
	}

	public String toString() {
		return "Coordenada 1: " + "(" + this.x1 + "," + this.y1 + ")" + " Coordenada 2:" + "(" + this.x2 + "," + this.y2
				+ ")";
	}

}
