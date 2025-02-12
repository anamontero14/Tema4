package boletin2.ejer3;

public class Alumno {

	/**
	 * Atributo que almacena el nombre completo del alumno
	 */
	private String nombreCompleto = "";

	/**
	 * Atributo que almacena la nota media del alumno
	 */
	private double notaMedia;

	/**
	 * Constructor con el nombre completo y la nota media
	 * 
	 * @param nombreCompleto
	 * @param notaMedia
	 */
	Alumno(String nombreCompleto, double notaMedia) {
		if (this.nombreCompleto != null && this.nombreCompleto.isBlank()) {
			this.nombreCompleto = nombreCompleto;
		}

		if (this.notaMedia >= 0) {
			this.notaMedia = notaMedia;
		}
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		if (this.nombreCompleto != null && this.nombreCompleto.isBlank()) {
			this.nombreCompleto = nombreCompleto;
		}
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		if (this.notaMedia >= 0) {
			this.notaMedia = notaMedia;
		}
	}

	@Override
	public String toString() {
		return nombreCompleto + " " + notaMedia;
	}

	/**
	 * Método equals en donde se comparan a los alumnos por el nombre completo
	 */
	public boolean equals(Object obj) {
		boolean sonIguales = false;

		Alumno objeto1 = (Alumno) obj;

		if (this.nombreCompleto.equalsIgnoreCase(objeto1.nombreCompleto)) {
			sonIguales = true;
		}

		return sonIguales;
	}

}
