package boletin4.ejer1;

public class Hora {

	private int hora;

	private int minuto;

	private int segundo;

	/**
	 * Constructor con todos los parámetros
	 * 
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	Hora(int hora, int minuto, int segundo) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}

		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}

		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}

	public int getHora() {
		return hora;
	}

	/**
	 * Usa una excepción para comprobar que la hora no sea negativa
	 * 
	 * @param hora - La hora
	 * @throws NegativeHourException
	 */
	public void setHora(int hora) throws NegativeHourException {
		if (hora >= 0) {
			this.hora = hora;
		} else {
			throw new NegativeHourException();
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) throws NegativeMinuteException {
		if (minuto >= 0) {
			this.minuto = minuto;
		} else {
			throw new NegativeMinuteException();
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) throws NegativeSecondException {
		if (segundo >= 0) {
			this.segundo = segundo;
		} else {
			throw new NegativeSecondException();
		}
	}

	/**
	 * Incrementa en 1 segundo la hora
	 */
	public void incrementar() {
		if (segundo == 59) {
			this.segundo = 0;
			this.minuto++;

			if (minuto > 59) {
				this.minuto = 0;
				this.hora++;
				if (hora > 23) {
					this.hora = 0;
				}
			}

		} else {
			this.segundo++;
		}

	}

	@Override
	public String toString() {
		String devolver = "";

		if (hora < 10) {
			devolver = "0" + hora + ":";
		} else {
			devolver += hora + ":";
		}

		if (minuto < 10) {
			devolver += "0" + minuto + ":";
		} else {
			devolver += minuto + ":";
		}

		if (segundo < 10) {
			devolver += "0" + segundo;
		} else {
			devolver += segundo;
		}

		return devolver;
	}

}
