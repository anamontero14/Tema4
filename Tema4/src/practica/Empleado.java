package practica;

import java.util.Objects;

public class Empleado {

	private String dni;
	private String nombre;
	private double sueldoBase;
	private double horasExtra;
	private static double importeHoraExtra = 10;

	/**
	 * Constructor solo con el dni
	 * 
	 * @param dni
	 */
	Empleado(String dni) {
		if (dni != null) {
			this.dni = dni;
		}
	}

	/**
	 * Constructor con todos los atributos
	 * 
	 * @param dni
	 * @param nombre
	 * @param sueldoBase
	 * @param horasExtra
	 * @param importeHoraExtra
	 */
	Empleado(String dni, String nombre, double sueldoBase, double horasExtra) {
		if (dni != null) {
			this.dni = dni;
		}

		if (nombre != null) {
			this.nombre = nombre;
		}

		if (sueldoBase >= 0) {
			this.sueldoBase = sueldoBase;
		}

		if (horasExtra >= 0 && horasExtra <= 80) {
			this.horasExtra = horasExtra;
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public double getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(double horasExtra) {
		this.horasExtra = horasExtra;
	}

	public double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(double importe) {
		if (importeHoraExtra > 0) {
			importeHoraExtra = importe;
		}
	}

	/**
	 * Devuelve el resultado de multiplicar el número de horas extras por el importe
	 * de la hora extra
	 * 
	 * @return el resultado de multiplicar el nº de horas extra por el importe de la
	 *         hora extra
	 */
	public double calcularComplemento() {
		return horasExtra * importeHoraExtra;
	}

	/**
	 * El sueldo bruto es igual al sueldo base más el complemento por horas extra
	 */
	public double sueldoBruto() {
		return sueldoBase + calcularComplemento();
	}

	/**
	 * Método toString
	 */
	public String toString() {
		return dni + " " + nombre + "\nHoras extras: " + horasExtra + "\nSueldo bruto: " + sueldoBruto();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, horasExtra, importeHoraExtra, nombre, sueldoBase);
	}

	@Override
	public boolean equals(Object o) {
		boolean sonIguales = false;

		// creo un objeto empleado y le hago un casteo al objeto que entra por parámetro
		Empleado empleObj = (Empleado) o;

		// si el dni es igual al dni del objeto entonces son iguales
		if (this.dni.equals(empleObj.dni)) {
			sonIguales = true;
		}

		return sonIguales;
	}

}
