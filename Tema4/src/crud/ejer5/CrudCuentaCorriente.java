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

	/**
	 * Método para modificar la cuenta
	 * 
	 * @param cuenta
	 * @param saldo
	 * @return
	 */
	public static boolean modificarCuenta(CuentaCorriente cuenta, double saldo) {
		boolean validez = false;
		// comprueba si esta o no
		int indice = listaCuentas.indexOf(cuenta);
		if (indice >= 0) {
			listaCuentas.get(indice).setSaldo(saldo);
			validez = true;
		} else {
			System.err.println("El producto no se encuentra");
		}

		return validez;
	}

	/**
	 * Método para meter dinero
	 * 
	 * @param cuenta
	 * @param dinero
	 * @return
	 */
	public static boolean meterDinero(CuentaCorriente cuenta, double dinero) {
		boolean validez = false;

		double cantidad;

		int indice = listaCuentas.indexOf(cuenta);
		if (indice >= 0) {
			// cojo la cantidad que hay ahora mismo del producto
			cantidad = listaCuentas.get(indice).getSaldo();

			// le sumo la cantidad que ha entrado
			cantidad += dinero;

			// la actualizo
			listaCuentas.get(indice).setSaldo(cantidad);
			validez = true;
		} else {
			System.err.println("El producto no se encuentra");
		}

		return validez;
	}

	/**
	 * Método para sacar dinero
	 * 
	 * @param cuenta
	 * @param dinero
	 * @return
	 */
	public static boolean sacarDinero(CuentaCorriente cuenta, double dinero) {
		boolean validez = false;

		double cantidad;

		int indice = listaCuentas.indexOf(cuenta);
		if (indice >= 0) {
			// cojo la cantidad que hay ahora mismo del producto
			cantidad = listaCuentas.get(indice).getSaldo();

			// le sumo la cantidad que ha entrado
			cantidad -= dinero;

			// la actualizo
			listaCuentas.get(indice).setSaldo(cantidad);
			validez = true;
		} else {
			System.err.println("El producto no se encuentra");
		}

		return validez;
	}
}
