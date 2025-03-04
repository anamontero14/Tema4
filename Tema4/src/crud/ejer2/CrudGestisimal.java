package crud.ejer2;

import java.util.ArrayList;
import java.util.List;

import crud.ejer1.Alumno;

public class CrudGestisimal {

	// lista donde almacenar los productos
	static List<Gestisimal> listaProductos = new ArrayList<Gestisimal>();

	/**
	 * muestro todos los objetos de la lista
	 */
	public static void listarProductos() {

		for (Gestisimal a : listaProductos) {
			System.out.println(a);
			System.out.println();
		}

	}

	/**
	 * Añade un producto a la lista
	 * 
	 * @param producto
	 * @return si se pudo realizar la operacion o no
	 */
	public static boolean darDeAlta(Gestisimal producto) {
		boolean validez = false;

		// si la lista ya contiene el producto dice que ya esta
		if (listaProductos.contains(producto)) {
			System.err.println("El producto ya está en metido.");
		} else {
			// si se puede añadir
			if (listaProductos.add(producto)) {
				System.out.println("El producto se añadió con éxito.");
				validez = true;
			} else {
				System.err.println("El producto no se pudo añadir.");
			}
		}

		return validez;
	}

	/**
	 * Da de baja un producto
	 * 
	 * @param producto
	 * @return si se pudo realizar la operacion o no
	 */
	public static boolean darDeBaja(Gestisimal producto) {
		boolean validez = true;

		if (listaProductos.contains(producto)) {
			// elimino al alumno
			if (listaProductos.remove(producto)) {
				System.out.println("El producto se eliminó correctamente.");
			} else {
				System.err.println("El producto no se puede eliminar.");
				validez = false;
			}
		} else {
			System.err.println("El producto no se encuentra.");
			validez = false;
		}

		return validez;
	}

	/**
	 * Modifica un producto
	 * 
	 * @param producto
	 * @param precioSinIva
	 * @param cuantosQuedan
	 * @return la validacion de la operacion
	 */
	public static boolean modificarProducto(Gestisimal producto, int precioSinIva, int cuantosQuedan) {

		boolean validez = false;
		// comprueba si esta o no
		int indice = listaProductos.indexOf(producto);
		if (indice >= 0) {
			listaProductos.get(indice).setPrecioSinIva(precioSinIva);
			listaProductos.get(indice).setCuantosQuedan(cuantosQuedan);
			validez = true;
		} else {
			System.err.println("El producto no se encuentra");
		}

		return validez;

	}

	/**
	 * Añade los productos que han entrado
	 * 
	 * @param producto
	 * @param cantidadQueEntra
	 * @return si la operacion ha sido exitosa o no
	 */
	public static boolean entradaDeMercancia(Gestisimal producto, int cantidadQueEntra) {
		boolean validez = false;

		int cantidad;

		int indice = listaProductos.indexOf(producto);
		if (indice >= 0) {
			// cojo la cantidad que hay ahora mismo del producto
			cantidad = listaProductos.get(indice).getCuantosQuedan();

			// le sumo la cantidad que ha entrado
			cantidad += cantidadQueEntra;

			// la actualizo
			listaProductos.get(indice).setCuantosQuedan(cantidad);
			validez = true;
		} else {
			System.err.println("El producto no se encuentra");
		}

		return validez;
	}

	/**
	 * Resta la cantidad que ha salido del stock del producto
	 * 
	 * @param producto
	 * @param cantidadQueSale
	 * @return si la operacion ha sido exitosa o no
	 */
	public static boolean salidaDeMercancia(Gestisimal producto, int cantidadQueSale) {
		boolean validez = false;

		int cantidad;

		int indice = listaProductos.indexOf(producto);
		if (indice >= 0) {
			// cojo la cantidad que hay ahora mismo del producto
			cantidad = listaProductos.get(indice).getCuantosQuedan();

			// le sumo la cantidad que ha entrado
			cantidad -= cantidadQueSale;

			// la actualizo
			listaProductos.get(indice).setCuantosQuedan(cantidad);
			validez = true;
		} else {
			System.err.println("El producto no se encuentra");
		}

		return validez;
	}

}
