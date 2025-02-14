package boletin2.ejer4;

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
	
	
}
