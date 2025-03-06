package crud.ejer5;

import java.util.LinkedList;

public class CrudCuentaCorriente {

	/**
	 * Lista para almacenar todas las cuentas corrientes
	 */
	static LinkedList<CuentaCorriente> listaCuentas = new LinkedList<CuentaCorriente>();

	/**
	 * Método para mostrar las cuentas almacenadas
	 */
	public static void mostrarCuentas() {
		for (CuentaCorriente cuenta : listaCuentas) {
			System.out.println();
			System.out.println(cuenta);
			System.out.println();
		}
	}

	/**
	 * Método para añadir una nueva cuenta
	 * 
	 * @param cuentaNueva
	 * @return true o false dependiendo de la validez de la operacion
	 */
	public static boolean añadirCuenta(CuentaCorriente cuentaNueva) {
		return listaCuentas.add(cuentaNueva);
	}

	/**
	 * Método para eliminar una cuenta
	 * 
	 * @param cuentaAEliminar
	 * @return true o false dependiendo de la validez de la operacion
	 */
	public static boolean eliminarCuenta(CuentaCorriente cuentaAEliminar) {
		return listaCuentas.remove(cuentaAEliminar);
	}

}
