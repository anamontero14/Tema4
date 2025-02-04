package boletin1.ejer1;

public class PrincipalPunto {

	public static void main(String[] args) {

		// creo 3 objetos
		Punto punto1 = new Punto(5, 0);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);

		// MUESTRO POR PANTALLA SUS COORDENADAS
		System.out.println(punto1.x + "," + punto1.y);
		System.out.println(punto2.x + "," + punto2.y);
		System.out.println(punto3.x + "," + punto3.y);

		// MODIFICAR EL CONTENIDO PARA PROBAR DIFERENTES OPERADORES
		punto1.x = punto1.x - 1;
		punto1.y += 3;

		punto2.x = punto1.x;
		punto2.y *= 5;

		punto3.x = punto3.x + punto2.y;
		punto3.y += 1;

		// MUESTRO LAS MODIFICACIONES
		System.out.println();
		System.out.println(punto1.x + "," + punto1.y);
		System.out.println(punto2.x + "," + punto2.y);
		System.out.println(punto3.x + "," + punto3.y);
	}

}
