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
