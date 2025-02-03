package boletin1.ejer04;

import java.util.Scanner;

public class PrincipalArticulo {

	public static void main(String[] args) {

		// creacion del scanner
		Scanner leer = new Scanner(System.in);

		// creacion del objeto de la clase articulo
		Articulo producto1 = new Articulo();

		// variable para almacenar el precio del pvp
		double precioPublico;

		System.out.print("Nombre del producto: ");
		producto1.nombre = leer.nextLine();

		System.out.print("Precio del producto: ");
		producto1.precioSinIva = leer.nextInt();

		// calculo el precio de venta al publico
		precioPublico = ((double) producto1.precioSinIva * producto1.IVA / 100) + producto1.precioSinIva;

		System.out.println(producto1.nombre + " - Precio: " + producto1.precioSinIva + "€ - IVA:" + producto1.IVA
				+ "% - PVP: " + precioPublico + "€");

		// cerrar el scanner
		leer.close();

	}

}
