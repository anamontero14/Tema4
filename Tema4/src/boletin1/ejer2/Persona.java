package boletin1.ejer2;

public class Persona {

	// DECLARACION DE DATOS PRINCIPALES DE UNA PERSONA

	// variable para almacenar el dni
	String dni;

	// variable para almacenar el nombre
	String nombre;

	// variable para almacenar el apellido
	String apellido;

	// variable para almacenar la edad
	int edad;

	/**
	 * Constructor con todos los atributos
	 * 
	 * @param dni      para guardar el dni de la persona
	 * @param nombre   para guardar el nombre de la persona
	 * @param apellido para guardar el apellido de la persona
	 * @param edad     para guardar la edad de la persona
	 */
	Persona(String dni, String nombre, String apellido, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

}
