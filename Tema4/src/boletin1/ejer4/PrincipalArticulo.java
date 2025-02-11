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
		int descuento;

		// creacion del objeto de la clase articulo
		Articulo producto1;

		System.out.print("Nombre del producto: ");
		nombre = leer.nextLine();

		System.out.print("Precio del producto: ");
		precioSinIva = leer.nextInt();

		System.out.print("Cantidad del producto: ");
		cuantosQuedan = leer.nextInt();

		// Le asigno los valores al objeto
		producto1 = new Articulo(nombre, precioSinIva, cuantosQuedan);

		// calculo el precio de venta al publico
		producto1.getPVP();

		System.out.println("Introduce la cantidad del descuento: ");
		descuento = leer.nextInt();

		producto1.getPVPDescuento(descuento, producto1.getPVP());

		System.out.println(producto1);

		// cerrar el scanner
		leer.close();

	}

}
