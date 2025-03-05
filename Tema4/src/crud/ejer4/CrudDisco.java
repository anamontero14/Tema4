package crud.ejer4;

import java.util.LinkedList;

public class CrudDisco {

	static LinkedList<Disco> coleccionDiscos = new LinkedList<Disco>();

	/**
	 * método para mostrar los discos en la coleccion
	 */
	public static void listadoDiscos() {
		for (Disco disco : coleccionDiscos) {
			System.out.println(disco);
			System.out.println();
		}
	}
	
	

}
