package boletin2.ejer1;

public class CuentaCorriente {

	/**
	 * Atributo para almacenar el dni del titular de la cuenta corriente
	 */
	private String dni = "";

	/**
	 * Atributo que almacena el nombre del titular de la cuenta corriente
	 */
	private String nombre = "";

	/**
	 * Atributo que almacena el saldo de la cuenta corriente
	 */
	private double saldo;

	/**
	 * Atributo para guardar la nacionalidad
	 */
	private Nacionalidad nacion = Nacionalidad.EXTRANJERA;

	/**
	 * Nos creamos el enum para almacenar los dos posibles casos de nacionalidad
	 */
	private enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

	/**
	 * Constructor con el DNI del titular de la cuenta y un saldo inicial.
	 * 
	 * @param dni
	 * @param d
	 */
	CuentaCorriente(String dni, double d) {
		if (this.dni != null) {
			this.dni = dni;
		}

		this.saldo = d;
	}

	/**
	 * Constructor con el DNI, nombre y el saldo inicial
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldo
	 */
	CuentaCorriente(String dni, String nombre, double saldo) {
		if (this.dni != null) {
			this.dni = dni;
		}

		if (this.nombre != null) {
			this.nombre = nombre;
		}

		this.saldo = saldo;
	}

	/**
	 * Constructor con el DNI, nombre, el saldo inicial y nacionalidad
	 * 
	 * @param dni
	 * @param nombre
	 * @param saldo
	 * @param nacion
	 */
	CuentaCorriente(String dni, String nombre, double saldo, String nacion) {
		if (this.dni != null) {
			this.dni = dni;
		}

		if (this.nombre != null) {
			this.nombre = nombre;
		}

		this.saldo = saldo;

		switch (nacion) {
		case "ESPAÑOLA" -> {
			this.nacion = Nacionalidad.ESPAÑOLA;
		}
		}
	}

	/**
	 * Coge el dni
	 * 
	 * @return el dni de la persona titular
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Coge el nombre de la persona
	 * 
	 * @return el nombre de la persona titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Coge el saldo
	 * 
	 * @return el saldo de la cuenta corriente
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Coge la nacionalidad
	 * 
	 * @return la nacionalidad del titular de la cuenta
	 */
	public Nacionalidad getNacion() {
		return nacion;
	}

	/**
	 * Coloca el nombre de la persona siempre que no sea null
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		if (this.nombre != null) {
			this.nombre = nombre;
		}
	}

	/**
	 * Coloca el saldo de la persona
	 * 
	 * @param saldo
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * Coloca la nacionalidad de la persona
	 * 
	 * @param nacion
	 */
	public void setNacion(String nacion) {
		switch (nacion) {
		case "ESPAÑOLA" -> {
			this.nacion = Nacionalidad.ESPAÑOLA;
		}
		}
	}

	/**
	 * se extraerá una cantidad de dinero introducida por parámetro. Sólo se puede
	 * sacar dinero si existe saldo suficiente. Si es posible llevar a cabo la
	 * operación se resta la cantidad a sacar al saldo de la cuenta y devolverá
	 * true. En caso contrario, no se podrá sacar dinero y devolverá false.
	 * 
	 * @param cantidadASacar
	 */
	public boolean sacarDinero(double cantidadASacar) {
		boolean realizarOperacion = false;

		if (this.saldo > cantidadASacar) {
			this.saldo -= cantidadASacar;
			realizarOperacion = true;
		}

		return realizarOperacion;
	}

	/**
	 * se incrementa el saldo. Hay que comprobar que el saldo a ingresar es una
	 * cantidad positiva. Devolverá true si se puede llevar a cabo la operación y
	 * false en caso contrario
	 * 
	 * @param cantidadAIngresar
	 * @return
	 */
	public boolean ingresarDinero(double cantidadAIngresar) {
		boolean realizarOperacion = false;

		if (cantidadAIngresar > 0) {
			this.saldo += cantidadAIngresar;
			realizarOperacion = true;
		}

		return realizarOperacion;
	}

	@Override
	public String toString() {
		return "CuentaCorriente: dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo + ", nacion=" + nacion;
	}

	/**
	 * Dos cuentas corrientes se consideran iguales si coinciden el DNI y el nombre
	 * 
	 * @return
	 */
	public boolean equals(Object obj) {
		boolean resultado = false;

		CuentaCorriente obj1 = (CuentaCorriente) obj;

		if (this.dni.equals(obj1.dni) && this.nombre.equals(obj1.nombre)) {
			resultado = true;
		}

		return resultado;
	}

}
