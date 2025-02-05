package boletin1.ejer2;

public class Persona {

	// DECLARACION DE DATOS PRINCIPALES DE UNA PERSONA

	// variable para almacenar el dni
	private String dni;

	// variable para almacenar el nombre
	private String nombre;

	// variable para almacenar el apellido
	private String apellido;

	// variable para almacenar la edad
	private int edad;

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

	/**
	 * Recoje el dni
	 * 
	 * @return El dni del usuario
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Recoje el nombre
	 * 
	 * @return El nombre del usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Comprueba que nombre no sea ni null ni vacío
	 * 
	 * @param nombre nombre del usuario
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Recoje el apellido
	 * 
	 * @return Apellido del usuario
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Modifica el apellido comprobando antes que no sea ni null ni vacío lo
	 * introducido
	 * 
	 * @param apellido apellido del usuario
	 */
	public void setApellido(String apellido) {
		if (apellido != null && !apellido.isEmpty()) {
			this.apellido = apellido;
		}
	}

	/**
	 * Recoje la edad del usuario
	 * 
	 * @return La edad del usuario
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Modifica la edad del usuario según la introducida
	 * 
	 * @param edad edad del usuario
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
