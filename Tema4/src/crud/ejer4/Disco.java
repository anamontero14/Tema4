package crud.ejer4;

public class Disco {

	/**
	 * codigo del disco
	 */
	private int codigo;

	/**
	 * autor del disco
	 */
	private String autor;

	/**
	 * titulo del disco
	 */
	private String titulo;

	/**
	 * duracion del disco
	 */
	private double duracion;

	/**
	 * genero del disco
	 */
	private Genero genero = Genero.ROCK;

	/**
	 * diferentes generos que existen
	 */
	enum Genero {
		ROCK, POP, JAZZ, BLUES
	}

	/**
	 * constructor solo con la primary key
	 * 
	 * @param codigo
	 */
	Disco(int codigo) {
		if (codigo >= 0) {
			this.codigo = codigo;
		}
	}

	/**
	 * constructor con todos los parametros
	 * 
	 * @param codigo
	 * @param autor
	 * @param titulo
	 * @param duracion
	 */
	Disco(int codigo, String autor, String titulo, double duracion, String genero) {
		if (codigo >= 0) {
			this.codigo = codigo;
		}

		if (autor != null) {
			this.autor = autor;
		}

		if (titulo != null) {
			this.titulo = titulo;
		}

		if (duracion >= 0) {
			this.duracion = duracion;
		}

		switch (genero) {
		case "POP" -> {
			this.genero = Genero.POP;
		}
		case "JAZZ" -> {
			this.genero = Genero.JAZZ;
		}
		case "BLUES" -> {
			this.genero = Genero.BLUES;
		}
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		switch (genero) {
		case "POP" -> {
			this.genero = Genero.POP;
		}
		case "JAZZ" -> {
			this.genero = Genero.JAZZ;
		}
		case "BLUES" -> {
			this.genero = Genero.BLUES;
		}
		}
	}

	@Override
	public String toString() {
		return "Disco:\n Código: " + codigo + " - Autor: " + autor + " - Título: " + titulo + " - Duración: " + duracion
				+ " - Género: " + genero;
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = true;

		Disco objeto = (Disco) obj;

		if (this.codigo == objeto.codigo) {
			sonIguales = true;
		}

		return sonIguales;
	}
}
