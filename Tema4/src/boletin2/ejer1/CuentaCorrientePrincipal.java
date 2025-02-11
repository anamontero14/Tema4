package boletin2.ejer1;

import java.util.Scanner;

public class CuentaCorrientePrincipal {

	public static void main(String[] args) {
		// Creo el scanner
		Scanner leer = new Scanner(System.in);

		// creo un objeto para la cuenta corriente
		CuentaCorriente cuenta1;

		// creo la variable para especificar la cantidad a sacar de la cuenta
		double cantidad;

		// le asigno unos valores al objeto
		cuenta1 = new CuentaCorriente("52694853H", "JUANITO", 1000, "ESPAÑOLA");
		CuentaCorriente cuenta2 = new CuentaCorriente("54872565F", "MARCO", 2000);

		System.out.print("Introduzca la cantidad a extraer de la cuenta corriente: ");
		cantidad = leer.nextDouble();

		// indica si se pudo realizar la operación
		if (cuenta1.sacarDinero(cantidad)) {
			System.out.println("  Se pudo sacar el dinero correctamente");
		} else {
			System.err.println("  No se pudo sacar el dinero, saldo insuficiente");
		}

		System.out.print("Introduzca la cantidad a ingresar en la cuenta corriente: ");
		cantidad = leer.nextDouble();

		// indica si se pudo realizar la operación
		if (cuenta1.ingresarDinero(cantidad)) {
			System.out.println("  Se pudo ingresar el dinero correctamente");
		} else {
			System.err.println("  No se pudo ingresar el dinero, introdujo un valor erroneo");
		}

		System.out.println();
		System.out.println(cuenta1);

		System.out.println(cuenta1.equals(cuenta2));

		// cierro el scanner
		leer.close();

	}

}
