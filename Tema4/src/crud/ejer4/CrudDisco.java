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

	/**
	 * Método para agregar un nuevo disco a la colección
	 * 
	 * @param discoNuevo
	 * @return la validez de la operación
	 */
	public static boolean añadirDisco(Disco discoNuevo) {

		return coleccionDiscos.add(discoNuevo);
	}

	/**
	 * Método para eliminar un disco a la colección
	 * 
	 * @param discoAEleminar
	 * @return la validez de la operación
	 */
	public static boolean eliminarDisco(Disco discoAEleminar) {
		return coleccionDiscos.remove(discoAEleminar);
	}
	
	

}
