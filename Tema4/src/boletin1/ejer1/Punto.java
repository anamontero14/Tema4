package boletin1.ejer1;

public class Punto {

	/** atributo para el punto horizontal */
	private int x;

	/** atributo para el punto en vertical */
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Modifica ambas coordenadas. Es como un setter doble.
	 * 
	 * @param x coordenada del punto x
	 * @param y coordenada del punyo y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Desplaza el punto la cantidad (dx,dy) indicada. Ejemplo: Si el punto (1,1) se
	 * desplaza (2,5) entonces estará en (3,6)
	 * 
	 * @param dx es la diferencia del desplazamiento menos el punto actual x
	 * @param dy es la diferencia del desplazamiento menos el punto actual y
	 */
	public void desplaza(int dx, int dy) {
		this.x = dx - x;
		this.y = dy - y;
	}

	/**
	 * Calcula y devuelve la distancia entre el propio objeto (this) y otro objeto
	 * (Punto p) que se pasa como parámetro. Prueba a utilizar estos métodos desde
	 * el main para comprobar su funcionamiento.
	 * 
	 * @param this.x coordenada del objeto actual en horizontal
	 * @param this.y coordenada del objeto actual en vertical
	 * @param p.x    coordenada que se pasa como parametro en horizontal
	 * @param p.y    coordenada que se pasa como parametro en vertical
	 */
	public double distancia(Punto p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}

	/**
	 * Devuelve una cadena con los valores de las coordenadas. Ejemplo: “(7, -5)”
	 * 
	 * @param this.x la coordenada x actual
	 * @param this.y la coordenada y actual
	 */
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	/**
	 * Constructor con dos atributos
	 * 
	 * @param x atributo para el punto horizontal
	 * @param y atributo para el punto vertical
	 */
	Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
