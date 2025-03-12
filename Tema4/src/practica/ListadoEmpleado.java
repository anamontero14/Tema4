package practica;

import java.util.LinkedList;

public class ListadoEmpleado {

	// lista de los empleados
	public static LinkedList<Empleado> listaEmpleados = new LinkedList<Empleado>();

	/**
	 * Método para añadir un nuevo empleado
	 * 
	 * @param dni
	 * @param nombre
	 * @param sueldoBase
	 * @param horasExtra
	 * @param importeHoraExtra
	 */
	public static boolean añadirEmpleado(Empleado emple) {

		boolean validez = false;

		if (!listaEmpleados.contains(emple)) {
			listaEmpleados.add(emple);
			validez = true;
		}

		return validez;

	}

	/**
	 * Listar empleados
	 */
	public static void listarEmpleados() {

		System.out.println();

		for (Empleado emple : listaEmpleados) {
			System.out.println(emple);
		}
	}

	/**
	 * Modifica del empleado indicado las horas extra
	 * 
	 * @param empleDni
	 * @param horasExtra
	 * @return si se pudo realizar la operacion o no
	 */
	public static boolean modificarHorasExtra(Empleado empleDni, double horasExtra) {
		boolean validez = false;
		int indice = listaEmpleados.indexOf(empleDni);

		if (listaEmpleados.contains(empleDni)) {
			listaEmpleados.get(indice).setHorasExtra(horasExtra);
			validez = true;
		}

		return validez;
	}

	/**
	 * Modifica el importe de las horas extra del empleado
	 * 
	 * @param empleDni
	 * @param importeHorasExtra
	 * @return
	 */
	public static boolean modificarImporteHorasExtra(Empleado empleDni, double importeHorasExtra) {
		boolean validez = false;
		int indice = listaEmpleados.indexOf(empleDni);

		if (listaEmpleados.contains(empleDni)) {
			listaEmpleados.get(indice).setImporteHoraExtra(importeHorasExtra);
			validez = true;
		}

		return validez;
	}

	/**
	 * Elimina el empleado
	 * 
	 * @param empleDni
	 * @return si se pudo ejecutar o no la operacion
	 */
	public static boolean eliminarEmpleado(Empleado empleDni) {
		boolean validez = false;

		if (listaEmpleados.contains(empleDni)) {
			validez = listaEmpleados.remove(empleDni);
		}

		return validez;
	}

}
