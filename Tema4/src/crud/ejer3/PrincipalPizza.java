package crud.ejer3;

import java.util.Scanner;

public class PrincipalPizza {

	// creacion del scanner
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// creo el objeto
		Pizza pizza;

		// creo las variables que corresponderán a los atributos del objeto
		int codigo;
		String tamaño = "";
		String tipo = "";
		String estado = "";

		// variable para almacenar la opcion del menu
		char opcionMenu;

		// bucle do while para mostrar el menu e iterar
		do {

			// almaceno la opcion del menu en una variable
			opcionMenu = menu();

			// dependiendo de la opcion
			switch (opcionMenu) {

			// hace un listado de las pizzas
			case 'a' -> {
				CrudPizza.mostrarPizzas();
			}

			// hace un nuevo pedido
			case 'b' -> {
				System.out.println();
				System.out.println("NUEVO PEDIDO");
				System.out.print("Código: ");
				codigo = leer.nextInt();
				// limpiar buffer
				leer.nextLine();

				System.out.println("Tamaño (mediana/familia): ");
				tamaño = leer.next().toUpperCase();

				System.out.println("Tipo de la pizza (margarita/cuatroquesos/funghi): ");
				tipo = leer.next().toUpperCase();

				// creo el objeto
				pizza = new Pizza(codigo, tamaño, tipo);

				// llamo al método del crud
				if (CrudPizza.nuevoPedido(pizza)) {
					System.out.println("El pedido se añadió correctamente.");
				} else {
					System.err.println("El pedido no se pudo añadir.");
				}
			}

			// cambiar el estado de la pizza
			case 'c' -> {
				System.out.println();
				System.out.println("CAMBIAR ESTADO");
				System.out.print("Introduzca el código de la pizza: ");
				codigo = leer.nextInt();
				// limpiar buffer
				leer.nextLine();

				System.out.print("Introduzca el nuevo estado de la pizza (pedida/servida): ");
				estado = leer.next().toUpperCase();

				// constructor con solo la PK
				pizza = new Pizza(codigo);

				// llamo al metodo
				CrudPizza.pizzaServida(pizza, estado);
			}

			// salir del programa
			case 'd' -> {
				System.out.println("Saliendo...");
			}
			default -> {
				System.out.println("Opción desconocida");
			}
			}

		} while (opcionMenu != 'd');

		System.out.println("Fin del programa.");

		// cierro el scanner
		leer.close();
	}

	/**
	 * Función para mostrar un menú con varias opciones
	 * 
	 * @return opción escogida
	 */
	public static char menu() {
		// opcion
		char opcion;

		System.out.println("ESCOJA UNA OPCIÓN: \n===========");
		System.out.println("\ta. Listado de pizzas");
		System.out.println("\tb. Nuevo pedido");
		System.out.println("\tc. Pizza servida");
		System.out.println("\td. Salir");
		System.out.println();
		System.out.print("Opción: ");
		// recojo la opcion
		opcion = leer.next().charAt(0);

		// return de la opcion elegida
		return opcion;
	}

}
