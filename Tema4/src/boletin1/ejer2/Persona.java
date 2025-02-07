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

	/**
	 * Devuelve true si es mayor de edad (false si no)
	 * 
	 * @param edad es la edad que se pasa (de la persona)
	 * @return devuelve si la persona es mayor de edad (true) o menor (false)
	 */
	public boolean esMayorEdad() {
		return (edad >= 18) ? true : false;
	}

	/**
	 * Devuelve true si tiene 65 años o más (false si no)
	 * 
	 * @param edad es la edad que se pasa (de la persona)
	 * @return devuelve si la persona tiene 65 años o más (true) o no (false)
	 */
	public boolean esJubilado() {
		return (edad >= 65) ? true : false;
	}

	/**
	 * Devuelve la diferencia de edad entre ‘this’ y p.
	 * 
	 * @param this.edad es la edad actual
	 * @param p.edad    es la edad que se introduce
	 * @return devuelve la diferencia de endad entre el this y la p
	 */
	public int diferenciaEdad(Persona p) {
		return Math.abs(this.edad - p.edad);
	}

	/**
	 * Devuelve una cadena con la información del objeto: “DNI:... Nombre:... etc.”
	 */
	public String toString() {
		return "DNI: " + this.dni + " | Nombre: " + this.nombre + " | Apellido: " + this.apellido + " | Edad: " + this.edad;
	}

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
