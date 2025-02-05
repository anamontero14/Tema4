package boletin1.ejer1;

public class PrincipalPunto {

	public static void main(String[] args) {

		// creo 3 objetos
		Punto punto1 = new Punto(5, 0);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);

		// MUESTRO POR PANTALLA SUS COORDENADAS
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		System.out.println(punto3.getX() + "," + punto3.getY());

		// MODIFICAR EL CONTENIDO PARA PROBAR DIFERENTES OPERADORES
		punto1.setX(punto1.getX() - 1);
		punto1.setY(punto1.getY() + 3);

		punto2.setX(punto1.getX());
		punto2.setY(punto2.getY() * 5);

		punto3.setX(punto3.getX() + punto2.getY());
		punto3.setY(punto3.getY() + 1);

		// MUESTRO LAS MODIFICACIONES
		System.out.println();
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		System.out.println(punto3.getX() + "," + punto3.getY());
	}

}
