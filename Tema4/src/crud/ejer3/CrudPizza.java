package crud.ejer3;

import java.util.LinkedList;

public class CrudPizza {

	/**
	 * nueva lista para almacenar las pizzas
	 */
	static LinkedList<Pizza> listaPizzas = new LinkedList<Pizza>();

	/**
	 * Método para mostrar las pizzas recogidas en la tabla
	 */
	public static void mostrarPizzas() {

		for (Pizza pizza : listaPizzas) {
			System.out.println(pizza);
			System.out.println();
		}

	}

	/**
	 * Hace un listado de todas las pizzas
	 * 
	 * @param pizza
	 * @return si se pudo realizar la ejecución o no
	 */
	public static boolean nuevoPedido(Pizza pizza) {
		boolean validez;

		// le doy a validez el valor de la operacion
		validez = listaPizzas.add(pizza);

		return validez;
	}

	/**
	 * Método para cambiar el estado de la pizza
	 * 
	 * @param pizza
	 * @param estado
	 * @return la validez de la operación (true/false)
	 */
	public static boolean pizzaServida(Pizza pizza, String estado) {
		boolean validez = false;

		// coge el indice de la lista en donde se encuentra la pizza
		int indice = listaPizzas.indexOf(pizza);

		// si la pizza existe entonces cambia su estado
		if (indice >= 0) {
			listaPizzas.get(indice).setEstado(estado);
			validez = true;
		}

		return validez;
	}

}
