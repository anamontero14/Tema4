package crud.ejer2;

import java.util.Scanner;

public class PrincipalGestisimal {
	// creacion del scanner
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// variables que almacenaran el nombre y el precio sin iva del producto
		String nombre;
		int precioSinIva;
		int cuantosQuedan;

		// variable para almacenar la cantidad que entra y sale
		int cantidad;

		// variable para almacenar la opcion
		char opcionMenu;

		// creacion del objeto de la clase articulo
		Gestisimal producto;

		// almaceno la opcion tras mostrar el menu
		opcionMenu = menu();

		// mientras que la opcion del menu no sea igual a la g (que es la de salir)
		while (opcionMenu != 'g') {

			// switch
			switch (opcionMenu) {
			case 'a' -> {
				// muestra una lista con los productos
				CrudGestisimal.listarProductos();
			}
			case 'b' -> {

				System.out.println("PARA INTRODUCIR UN NUEVO PRODUCTO INTRODUZCA");
				System.out.print("El nombre: ");
				nombre = leer.nextLine();

				System.out.print("El precio sin IVA: ");
				precioSinIva = leer.nextInt();

				System.out.print("Cuántos quedan en stock: ");
				cuantosQuedan = leer.nextInt();

				// hago el constructor
				producto = new Gestisimal(nombre, precioSinIva, cuantosQuedan);

				// da de alta el producto
				CrudGestisimal.darDeAlta(producto);
			}
			case 'c' -> {
				System.out.print("Escriba el nombre del producto que quiere dar de baja: ");
				nombre = leer.nextLine();

				// hago el constructor solo con el nombre
				producto = new Gestisimal(nombre);

				// llamo a la funcion
				CrudGestisimal.darDeBaja(producto);

			}
			case 'd' -> {
				System.out.println("PARA MODIFICAR UN PRODUCTO INTRODUZCA");
				System.out.print("El nombre del producto a modificar: ");
				nombre = leer.nextLine();

				System.out.print("El precio sin IVA nuevo: ");
				precioSinIva = leer.nextInt();

				System.out.print("La cantidad de productos en stock actualizado: ");
				cuantosQuedan = leer.nextInt();

				// constructor con la primary key
				producto = new Gestisimal(nombre);

				// llamo a la funcion
				CrudGestisimal.modificarProducto(producto, precioSinIva, cuantosQuedan);

			}
			case 'e' -> {
				System.out.print("Introduzca el nombre del producto que ha llegado más cantidad: ");
				nombre = leer.nextLine();

				System.out.print("Introduzca la cantidad que ha llegado: ");
				cantidad = leer.nextInt();

				// hago el constructor con la primary key
				producto = new Gestisimal(nombre);

				// llamo a la funcion
				CrudGestisimal.entradaDeMercancia(producto, cantidad);

			}
			case 'f' -> {
				System.out.print("Introduzca el nombre del producto que ha salido alguna cantidad: ");
				nombre = leer.nextLine();

				System.out.print("Introduzca la cantidad que ha salido: ");
				cantidad = leer.nextInt();

				// hago el constructor con la primary key
				producto = new Gestisimal(nombre);

				// llamo a la funcion
				CrudGestisimal.salidaDeMercancia(producto, cantidad);
			}
			}

			// almaceno la opcion tras mostrar el menu
			opcionMenu = menu();
		}

		System.out.println("Saliendo...");

		// cerrar el scanner
		leer.close();

	}

	// funcion para crear un menú
	public static char menu() {

		// variable que almacenara la opcion escogida
		char opcion;

		System.out.println();
		System.out.println("GESTISIMAL\n ===================");
		System.out.println("	a. Listado.");
		System.out.println("	b. Alta.");
		System.out.println("	c. Baja.");
		System.out.println("	d. Modificar.");
		System.out.println("	e. Entrada de mercancía.");
		System.out.println("	f. Salida de mercancía.");
		System.out.println("	g. Salir.");

		// recojo la respuesta
		opcion = leer.nextLine().charAt(0);

		return opcion;

	}

}
