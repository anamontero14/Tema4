package boletin1.ejer4;

public class Articulo {

	// DECLARACION DE ATRIBUTOS

	/** nombre del producto */
	private String nombre;

	/** precio sin iva */
	private int precioSinIva;

	/** iva */
	final int IVA = 21;

	/** cantidad que queda en el almacén */
	private int cuantosQuedan;

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

	/**
	 * Recoje el nombre del producto
	 * 
	 * @return El nombre del producto introducido por el usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Asigna el nombre siempre y cuando el nombre no sea ni null ni venga vacío
	 * 
	 * @param nombre nombre del producto
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Recoje el precio introducido sin el IVA
	 * 
	 * @return El precio del producto sin el iva añadido que introduzca el usuario
	 */
	public int getPrecioSinIva() {
		return precioSinIva;
	}

	/**
	 * Asigna el precio sin iva siempre que el precio no sea 0
	 * 
	 * @param precioSinIva es el precio del producto sin iva
	 */
	public void setPrecioSinIva(int precioSinIva) {
		if (precioSinIva > 0) {
			this.precioSinIva = precioSinIva;
		}
	}

	/**
	 * Recoje el número de productos que quedan
	 * 
	 * @return el número de artículos que quedan
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Asigna el número de productos en stock que haya introducido el usuario
	 * 
	 * @param cuantosQuedan número de productos en stock
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

}
