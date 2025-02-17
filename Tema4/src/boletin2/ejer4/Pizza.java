package boletin2.ejer4;

import java.util.Objects;

public class Pizza {

	/**
	 * valor numérico diferente para cada pizza
	 */
	private int codigo;

	/**
	 * los únicos valores que puede tener son Mediana o Familiar
	 */
	private Tamaño tamaño = Tamaño.MEDIANA;

	/**
	 * Lista con las posibilidades de tamaño que puede tener una pizza
	 */
	enum Tamaño {
		MEDIANA, FAMILIA
	};

	/**
	 * los únicos valores que puede tener son Margarita, CuatroQuesos o Funghi
	 */
	private Tipo tipo = Tipo.MARGARITA;

	/**
	 * Lista con los únicos tipos que puede tener una piza
	 */
	enum Tipo {
		MARGARITA, CUATROQUESOS, FUNGHI
	};

	/**
	 * los posibles valores son Pedida o Servida. Siempre que se crea una pizza
	 * nueva, su estado es “Pedida”
	 */
	private Estado estado = Estado.PEDIDA;

	/**
	 * los únicos estados que puede tener una pizza
	 */
	enum Estado {
		PEDIDA, SERVIDA
	};

	/**
	 * Crea un constructor con todos los parámetros menos el estado. Añade también
	 * los getter y setter para los atributos que veas más apropiados.
	 */
	Pizza(int codigo, String tamaño, String tipo) {
		if (this.codigo >= 0) {
			this.codigo = codigo;
		}

		switch (tamaño) {
		case "FAMILIA" -> {
			this.tamaño = Tamaño.FAMILIA;
		}
		}

		switch (tipo) {
		case "CUATROQUESOS" -> {
			this.tipo = Tipo.CUATROQUESOS;
		}

		case "FUNGHI" -> {
			this.tipo = Tipo.FUNGHI;
		}
		}

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (this.codigo >= 0) {
			this.codigo = codigo;
		}
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		switch (tamaño) {
		case "FAMILIA" -> {
			this.tamaño = Tamaño.FAMILIA;
		}
		}
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		switch (tipo) {
		case "CUATROQUESOS" -> {
			this.tipo = Tipo.CUATROQUESOS;
		}

		case "FUNGHI" -> {
			this.tipo = Tipo.FUNGHI;
		}
		}
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		switch (estado) {
		case "SERVIDA" -> {
			this.estado = Estado.SERVIDA;
		}
		}
	}

	@Override
	public String toString() {
		return codigo + ": " + tamaño + " - " + tipo + " - " + estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, estado, tamaño, tipo);
	}

	@Override
	public boolean equals(Object obj) {

		boolean sonIguales = false;

		Pizza objeto = (Pizza) obj;

		if (this.codigo == objeto.codigo) {
			sonIguales = true;
		}

		return sonIguales;
	}

}
