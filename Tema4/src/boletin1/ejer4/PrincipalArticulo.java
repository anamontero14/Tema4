package boletin1.ejer4;

import java.util.Scanner;

public class PrincipalArticulo {

	public static void main(String[] args) {

		// creacion del scanner
		Scanner leer = new Scanner(System.in);

		// variables que almacenaran el nombre y el precio sin iva del producto
		String nombre;
		int precioSinIva;
		int cuantosQuedan;

		// creacion del objeto de la clase articulo
		Articulo producto1;

		// variable para almacenar el precio del pvp
		double precioPublico;

		System.out.print("Nombre del producto: ");
		nombre = leer.nextLine();

		System.out.print("Precio del producto: ");
		precioSinIva = leer.nextInt();

		System.out.print("Cantidad del producto: ");
		cuantosQuedan = leer.nextInt();

		// Le asigno los valores al objeto
		producto1 = new Articulo(nombre, precioSinIva, cuantosQuedan);

		// calculo el precio de venta al publico
		precioPublico = ((double) producto1.getPrecioSinIva() * producto1.IVA / 100) + producto1.getPrecioSinIva();

		System.out.println(producto1.getNombre() + " - Precio: " + producto1.getPrecioSinIva() + "€ - IVA:"
				+ producto1.IVA + "% - PVP: " + precioPublico + "€" + " - Quedan: " + producto1.getCuantosQuedan());

		// cerrar el scanner
		leer.close();

	}

}
