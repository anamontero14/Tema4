package boletin1.ejer1;

import java.util.Scanner;

public class PrincipalPunto {

	public static void main(String[] args) {

		// Creación del scanner
		Scanner leer = new Scanner(System.in);

		// creo 3 objetos
		Punto punto1 = new Punto(5, 0);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);

		// MUESTRO POR PANTALLA SUS COORDENADAS
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		System.out.println(punto3.getX() + "," + punto3.getY());

		System.out.println("¿Cuánto desea que se desplace el punto 1? x,y");
		punto1.desplaza(leer.nextInt(), leer.nextInt());

		System.out.println("Introduzca un nuevo valor para el punto 2. x,y");
		punto2.setXY(leer.nextInt(), leer.nextInt());

		// MUESTRO LAS MODIFICACIONES
		System.out.println();
		System.out.println(punto1);
		System.out.println(punto2);

		System.out.println("El punto 3 se ha desplazado respecto al 1: " + punto3.distancia(punto1));

		// cierro el scanner
		leer.close();
	}

}
