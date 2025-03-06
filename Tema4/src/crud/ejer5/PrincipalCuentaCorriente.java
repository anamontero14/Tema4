package crud.ejer5;

import java.util.Scanner;

public class PrincipalCuentaCorriente {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// variables que hacen referencia a los atributos de la clase
		String dni = "";
		String nombre = "";
		double saldo = 0;
		String nacion = "";

		// creo el objeto
		CuentaCorriente cuenta;

		// variable que almacenara la opcion del menu
		int opcionMenu;

		// bucle do while para seguir mostrando el menú si así lo quiere el usuario
		do {
			switch (opcionMenu = menu()) {
			case 1 -> {
				CrudCuentaCorriente.mostrarCuentas();
			}
			case 2 -> {
				System.out.println("AÑADIR CUENTA\n========");
				System.out.print("DNI del propietario: ");
				dni = leer.next();

				System.out.print("Nombre del propietario: ");
				nombre = leer.nextLine();

				System.out.print("Saldo de la cuenta: ");
				saldo = leer.nextDouble();

				System.out.print("Nacionalidad (española/extranjera): ");
				nacion = leer.next().toUpperCase();

				// creo el objeto
				cuenta = new CuentaCorriente(dni, nombre, saldo, nacion);

				// llamo al método
				CrudCuentaCorriente.añadirCuenta(cuenta);
			}
			}

		} while (opcionMenu != 6);
		// fin del programa
		System.out.println("Fin del programa.");

		// cerrar el scanner
		leer.close();

	}

	// función para menú
	public static int menu() {
		// almacena la opcion seleccionada
		int opcion;

		System.out.println();
		System.out.println("CUENTA CORRIENTE\n==============");
		System.out.println("\t1. Listar cuentas.");
		System.out.println("\t2. Añadir cuenta.");
		System.out.println("\t3. Eliminar cuenta.");
		System.out.println("\t4. Modificar cuenta.");
		System.out.println("\t5. Meter dinero.");
		System.out.println("\t6. Sacar dinero.");
		System.out.println("\t7. Salir.");
		System.out.print("Opción: ");
		opcion = leer.nextInt();
		// limpiar el buffer
		leer.nextLine();

		return opcion;
	}

}
