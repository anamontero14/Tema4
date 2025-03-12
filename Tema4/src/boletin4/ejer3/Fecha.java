package boletin4.ejer3;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	Fecha(int dia, int mes, int año) {
		if (dia > 0) {
			this.dia = dia;
		}

		if (mes > 0) {
			this.mes = mes;
		}

		if (año > 0) {
			this.año = año;
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean esBisiesto() {

		return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

	}

	public boolean fechaCorrecta() {
		boolean validez = false;

		if (año > 0 && mes >= 1 && mes <= 12 && dia > 0) {
			if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
				validez = true;
			} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
				validez = true;
			} else if (mes == 2) {
				if ((esBisiesto() && dia <= 29) || (!esBisiesto() && dia <= 28)) {
					validez = true;
				}
			}
		}

		return validez;
	}

	public void diaSiguiente() {

		dia++; // Incrementamos el día

		// Si la fecha no es correcta, ajustamos
		if (!fechaCorrecta()) {
			dia = 1; // Reseteamos el día a 1
			mes++; // Aumentamos el mes

			// Si el mes excede 12, incrementamos el año y reseteamos el mes
			if (mes > 12) {
				mes = 1; // Reseteamos el mes a enero
				año++; // Incrementamos el año
			}
		}

	}

	@Override
	public String toString() {

		String devolver = "";

		if (dia < 10) {
			devolver += "0" + dia + "-";
		} else {
			devolver += dia + "-";
		}

		if (mes < 10) {
			devolver += "0" + mes + "-";
		} else {
			devolver += mes + "-";
		}

		if (año < 10) {
			devolver += "000" + año;
		} else if (año < 100) {
			devolver += "00" + año;
		} else if (año < 1000) {
			devolver += "0" + año;
		} else {
			devolver += año;
		}

		return devolver;
	}

}
