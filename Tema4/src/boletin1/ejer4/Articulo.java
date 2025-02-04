package boletin1.ejer4;

public class Articulo {

	// DECLARACION DE ATRIBUTOS

	/** nombre del producto */
	String nombre;

	/** precio sin iva */
	int precioSinIva;

	/** iva */
	final int IVA = 21;

	/** cantidad que queda en el almacén */
	int cuantosQuedan;

	/**
	 * Constructor de 3 parámetros que asigna valores a nombre, precio, iva y
	 * cuantosQuedan.
	 * 
	 * @param nombre        nombre del producto
	 * @param precioSinIva  el precio del producto sin el iva
	 * @param cuantosQuedan cantidad que queda del producto en el almacén (stock)
	 */
	Articulo(String nombre, int precioSinIva, int cuantosQuedan) {

		// comprueba el valor introducido
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		// comprueba que el precio no sea menor o igual a 0
		if (precioSinIva > 0 && cuantosQuedan > 0) {
			this.precioSinIva = precioSinIva;
			this.cuantosQuedan = cuantosQuedan;
		}

	}

}
