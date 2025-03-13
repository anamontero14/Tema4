package practica2;

import java.util.Objects;

public class LibroGestion {

	private int cod;
	private String name;
	private String autor;
	private int numPaginas;

	Genero genero = Genero.ACCION;

	enum Genero {
		TERROR, ROMANCE, ACCION
	};

	// igual para todos los libros
	private static String nombreBiblio = "Casa de la cultura";

	LibroGestion(int cod) {
		if (cod > 0) {
			this.cod = cod;
		}
	}

	LibroGestion(int cod, String name, String autor, int numPaginas, String genero) {
		if (cod > 0) {
			this.cod = cod;
		}

		if (name != null) {
			this.name = name;
		}

		if (autor != null) {
			this.autor = autor;
		}

		if (numPaginas > 0) {
			this.numPaginas = numPaginas;
		}

		switch (genero) {
		case "TERROR" -> {
			this.genero = Genero.TERROR;
		}
		case "ROMANCE" -> {
			this.genero = Genero.ROMANCE;
		}
		}

	}

	public int getCod() {
		return cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(String genero) {

		switch (genero) {
		case "TERROR" -> {
			this.genero = Genero.TERROR;
		}
		case "ROMANCE" -> {
			this.genero = Genero.ROMANCE;
		}
		}

	}

	public static String getNombreBiblio() {
		return nombreBiblio;
	}

	public static void setNombreBiblio(String nombreBiblio) {
		if (nombreBiblio != null) {
			LibroGestion.nombreBiblio = nombreBiblio;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {

		boolean esIgual = false;

		LibroGestion libro = (LibroGestion) obj;

		if (this.cod == libro.cod) {
			esIgual = true;
		}

		return esIgual;

	}

	@Override
	public String toString() {
		return cod + " " + name + " por " + autor + "\nNº páginas: " + numPaginas + "\nGénero: " + genero
				+ "\nNombre de la biblioteca: " + nombreBiblio;
	}

}
