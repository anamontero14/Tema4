package practica;

import java.util.Scanner;

public class PrincipalEmpleado {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// atributos
		String dni;
		String nombre;
		double sueldoBase;
		double horasExtra;
		double importeHoraExtra;

		// creo el atributo
		Empleado empleObj;

		// variable que almacena la opcion del menu
		int opcionMenu;

		System.out.println("Bienvenid@!!");
		System.out.println();

		// bucle do while
		do {

			switch (opcionMenu = menu()) {
			case 1 -> {

				System.out.println("AÑADIR UN NUEVO EMPLEADO");
				System.out.print("Introduce el DNI: ");
				dni = leer.next();

				// limpiar el buffer
				leer.nextLine();

				System.out.print("Introduce el nombre: ");
				nombre = leer.nextLine();

				System.out.print("Introduce el sueldo base: ");
				sueldoBase = leer.nextDouble();

				System.out.print("Introduce el nº de horas extras: ");
				horasExtra = leer.nextDouble();

				System.out.print("Introduce el importe por hora extra: ");
				importeHoraExtra = leer.nextDouble();

				// creacion del objeto
				empleObj = new Empleado(dni, nombre, sueldoBase, horasExtra, importeHoraExtra);

				// llamo a la funcion
				if (ListadoEmpleado.añadirEmpleado(empleObj)) {
					System.out.println("\tEl empleado se agregó exitosamente");
				} else {
					System.err.println("\tEl empleado no se pudo agregar");
				}
			}
			case 2 -> {

				System.out.println("LISTA DE TODOS LOS EMPLEADOS");

				// llamo a la funcion
				ListadoEmpleado.listarEmpleados();

			}
			case 3 -> {

				System.out.println("MODIFICAR HORAS EXTRA");
				System.out.print("Introduce el DNI del empleado que desea modificar: ");
				dni = leer.next();

				System.out.print("Introduce el nº nuevo de horas extras: ");
				horasExtra = leer.nextDouble();

				// creo el objeto
				empleObj = new Empleado(dni);

				// llamo a la funcion
				if (ListadoEmpleado.modificarHorasExtra(empleObj, horasExtra)) {
					System.out.println("\tSe pudieron modificar las horas extras exitosamente");
				} else {
					System.err.println("\tNo se pudieron modificar las horas extras");
				}

			}
			case 4 -> {

				System.out.println("MODIFICAR EL IMPORTE DE LAS HORAS EXTRA");
				System.out.print("Introduce el DNI del empleado que desea modificar: ");
				dni = leer.next();

				System.out.print("Introduce el nuevo importe para las horas extras: ");
				importeHoraExtra = leer.nextDouble();

				// crear el objeto
				empleObj = new Empleado(dni);

				// llamo a la funcion
				if (ListadoEmpleado.modificarImporteHorasExtra(empleObj, importeHoraExtra)) {
					System.out.println("\tSe pudo modificar el empleado con éxito");
				} else {
					System.err.println("\tNo se pudo modificar el empleado");
				}

			}
			case 5 -> {

				System.out.println("ELIMINAR UN EMPLEADO");
				System.out.print("Introduce el DNI del empleado que desea modificar: ");
				dni = leer.next();

				empleObj = new Empleado(dni);

				// llamo a la funcion
				if (ListadoEmpleado.eliminarEmpleado(empleObj)) {
					System.out.println("\tEl empleado se pudo eliminar exitosamente");
				} else {
					System.err.println("\tEl empleado no se pudo eliminar");
				}

			}
			default -> {
				System.out.println("Saliendo del sistema...");
			}
			}

		} while (opcionMenu != 0);

		System.out.println("Fin del programa");

		leer.close();

	}

	public static int menu() {
		int opcion;

		System.out.println();
		System.out.println("MENÚ\n===============");
		System.out.println("\t1. Añadir empleado");
		System.out.println("\t2. Listar empleados");
		System.out.println("\t3. Modificar horas extras");
		System.out.println("\t4. Modificar importe horas extra");
		System.out.println("\t5. Eliminar empleado");
		System.out.println("\t0. Salir");
		System.out.print("Opción: ");
		opcion = leer.nextInt();
		// limpiar el buffer
		leer.nextLine();

		return opcion;
	}

	/*
	 * public static void recogerDni() {
	 * 
	 * }
	 */

}
