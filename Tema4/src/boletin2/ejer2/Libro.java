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
	
	

}
