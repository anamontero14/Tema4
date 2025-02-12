package boletin2.ejer2;

public class Libro {

	/**
	 * Título del libro
	 */
	private String titulo = "";

	/**
	 * Autor del libro
	 */
	private String autor = "";

	/**
	 * Número de ejemplares del libro
	 */
	private int ejemplares;

	/**
	 * Número de ejemplares prestados
	 */
	private int prestados;

	/**
	 * Género del libro (atributo)
	 */
	private Genero genero = Genero.NARRATIVO;

	/**
	 * Género del libro
	 */
	enum Genero {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	}

	/**
	 * Constructor del libro con el titulo y el autor
	 * 
	 * @param titulo
	 * @param autor
	 */
	Libro(String titulo, String autor) {
		if (this.titulo != null && this.titulo.isEmpty()) {
			this.titulo = titulo;
		}

		if (this.autor != null && this.autor.isEmpty()) {
			this.autor = autor;
		}
	}

	/**
	 * Constructor con el titulo, el autor, el numero de ejemplares y el numero de
	 * ejemplares prestados
	 * 
	 * @param titulo
	 * @param autor
	 * @param ejemplares
	 */
	Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (this.titulo != null && this.titulo.isEmpty()) {
			this.titulo = titulo;
		}

		if (this.autor != null && this.autor.isEmpty()) {
			this.autor = autor;
		}

		if (this.prestados <= this.ejemplares) {
			this.prestados = prestados;
		}

		this.ejemplares = ejemplares;
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param titulo
	 * @param autor
	 * @param ejemplares
	 * @param prestados
	 * @param genero
	 */
	Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		if (this.titulo != null && this.titulo.isEmpty()) {
			this.titulo = titulo;
		}

		if (this.autor != null && this.autor.isEmpty()) {
			this.autor = autor;
		}

		if (this.prestados <= this.ejemplares) {
			this.prestados = prestados;
		}

		this.ejemplares = ejemplares;

		switch (genero) {
		case "LIRICO" -> {
			this.genero = Genero.LIRICO;
		}

		case "DRAMATICO" -> {
			this.genero = Genero.DRAMATICO;
		}

		case "DIDACTICO" -> {
			this.genero = Genero.DIDACTICO;
		}

		case "POETICO" -> {
			this.genero = Genero.POETICO;
		}
		}
	}

	/**
	 * Recoge el título del libro
	 * 
	 * @return el titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Asigna un título al libro
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Recoge el autor del libro
	 * 
	 * @return nombre del autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Asigna un autor al libro
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Recoge el número de ejemplares que hay del libro
	 * 
	 * @return el número de ejemplares
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * Asigna el número de ejemplares que hay
	 * 
	 * @param ejemplares
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	/**
	 * Recoge el nº de libros que hay prestados
	 * 
	 * @return nº de libros prestados
	 */
	public int getPrestados() {
		return prestados;
	}

	/**
	 * Asigna el nº de libros prestados
	 * 
	 * @param prestados
	 */
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	/**
	 * Recoge el género del libro
	 * 
	 * @return género del libro
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Asigna el género del libro
	 * 
	 * @param string
	 */
	public void setGenero(String genero) {
		switch (genero) {
		case "LIRICO" -> {
			this.genero = Genero.LIRICO;
		}

		case "DRAMATICO" -> {
			this.genero = Genero.DRAMATICO;
		}

		case "DIDACTICO" -> {
			this.genero = Genero.DIDACTICO;
		}

		case "POETICO" -> {
			this.genero = Genero.POETICO;
		}
		}
	}

	/**
	 * Incrementa el atributo correspondiente cada vez que se realice un préstamo.
	 * No se pueden prestar libros si no quedan ejemplares disponibles para prestar.
	 * Devuelve true si se ha podido realizar el préstamo y false en caso contrario.
	 * 
	 * @return la validación de la operación (true/false)
	 */
	public boolean prestamo() {

		boolean realizacionOperacion = false;

		if (this.prestados < this.ejemplares) {
			this.prestados++;
			realizacionOperacion = true;
		}

		return realizacionOperacion;
	}

	/**
	 * Decrementa el atributo correspondiente cada vez que se devuelva un libro. No
	 * se podrán devolver libros que no se hayan prestado. Devuelve true si se ha
	 * podido realizar la operación y false en caso contrario.
	 * 
	 * @return la validacion de la operacion (true/false)
	 */
	public boolean devolucion() {

		boolean realizacionOperacion = false;

		if (this.prestados > 0) {
			this.prestados--;
			realizacionOperacion = true;
		}

		return realizacionOperacion;
	}

	@Override
	public String toString() {
		return "Título: " + titulo + " | Autor: " + autor + " | Género: " + genero + " | Ejemplares: " + ejemplares
				+ " | Prestados: " + prestados;
	}

	/**
	 * Dos libros se consideran iguales si tienen el mismo título y el mismo autor.
	 */
	public boolean equals(Object obj) {

		Libro objeto = (Libro) obj;

		boolean sonIguales = false;

		if (this.titulo.equals(objeto.titulo) && this.autor.equals(objeto.autor)) {
			sonIguales = true;
		}

		return sonIguales;
	}

}
