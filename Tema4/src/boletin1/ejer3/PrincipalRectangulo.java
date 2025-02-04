package boletin1.ejer3;

public class PrincipalRectangulo {

	public static void main(String[] args) {

		// variable para el perimetro
		int perimetro1;
		int perimetro2;

		// variable para el area
		int area1;
		int area2;

		// declaro los objetos
		Rectangulo rectangulo1;
		Rectangulo rectangulo2;

		// le asigno los valores
		rectangulo1 = new Rectangulo(0, 5, 5, 0);
		rectangulo2 = new Rectangulo(7, 2, 9, 3);

		// suma de los lados del rectagulo 1
		perimetro1 = Math.abs(2 * (rectangulo1.x1 - rectangulo1.x2)) + Math.abs(2 * (rectangulo1.y1 - rectangulo1.y2));

		// suma de los lados del rectangulo 2
		perimetro2 = Math.abs(2 * (rectangulo2.x1 - rectangulo2.x2)) + Math.abs(2 * (rectangulo2.y1 - rectangulo2.y2));

		// area del rectangulo 1
		area1 = Math.abs((rectangulo1.x1 - rectangulo1.x2) * (rectangulo1.y1 - rectangulo1.y2));

		// area del rectangulo 2
		area2 = Math.abs((rectangulo2.x1 - rectangulo2.x2) * (rectangulo2.y1 - rectangulo2.y2));

		// muestro los lados, el perimetro y el area de cada objeto
		System.out.println("RECTANGULO 1");
		System.out.println(" Coordenadas: (" + rectangulo1.x1 + "," + rectangulo1.y1 + ") y (" + rectangulo1.x2 + ","
				+ rectangulo1.y2 + ")\n Perímetro: " + perimetro1 + "\n Área: " + area1);

		// rectangulo 2
		System.out.println("RECTANGULO 2");
		System.out.println(" Coordenadas: (" + rectangulo2.x1 + "," + rectangulo2.y1 + ") y (" + rectangulo2.x2 + ","
				+ rectangulo2.y2 + ")\n Perímetro: " + perimetro2 + "\n Área: " + area2);

		// modificacion de las coordenadas del rectangulo 1
		rectangulo1.x1 = 8;
		rectangulo1.x2 = 2;
		rectangulo1.y1 = 7;
		rectangulo1.y2 = 1;

		// modificacion de las coordenadas del rectangulo 2
		rectangulo2.x1 = 10;
		rectangulo2.x2 = -6;
		rectangulo2.y1 = 5;
		rectangulo2.y2 = 7;

		// suma de los lados del rectagulo 1
		perimetro1 = Math.abs(2 * (rectangulo1.x1 - rectangulo1.x2)) + Math.abs(2 * (rectangulo1.y1 - rectangulo1.y2));

		// suma de los lados del rectangulo 2
		perimetro2 = Math.abs(2 * (rectangulo2.x1 - rectangulo2.x2)) + Math.abs(2 * (rectangulo2.y1 - rectangulo2.y2));

		// area del rectangulo 1
		area1 = Math.abs((rectangulo1.x1 - rectangulo1.x2) * (rectangulo1.y1 - rectangulo1.y2));

		// area del rectangulo 2
		area2 = Math.abs((rectangulo2.x1 - rectangulo2.x2) * (rectangulo2.y1 - rectangulo2.y2));

		System.out.println();
		System.out.println();

		// muestro los lados, el perimetro y el area de cada objeto
		System.out.println("RECTANGULO 1");
		System.out.println(" Coordenadas: (" + rectangulo1.x1 + "," + rectangulo1.y1 + ") y (" + rectangulo1.x2 + ","
				+ rectangulo1.y2 + ")\n Perímetro: " + perimetro1 + "\n Área: " + area1);

		// rectangulo 2
		System.out.println("RECTANGULO 2");
		System.out.println(" Coordenadas: (" + rectangulo2.x1 + "," + rectangulo2.y1 + ") y (" + rectangulo2.x2 + ","
				+ rectangulo2.y2 + ")\n Perímetro: " + perimetro2 + "\n Área: " + area2);
	}

}
