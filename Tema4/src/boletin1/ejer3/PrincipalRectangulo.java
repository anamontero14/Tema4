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
		rectangulo1 = new Rectangulo(0, 5, 0, 5);

		rectangulo2 = new Rectangulo(2, 7, 3, 9);

		// suma de los lados del rectagulo 1
		perimetro1 = rectangulo1.getPerimetro();

		// suma de los lados del rectangulo 2
		perimetro2 = rectangulo2.getPerimetro();

		// area del rectangulo 1
		area1 = rectangulo1.getArea();

		// area del rectangulo 2
		area2 = rectangulo2.getArea();

		// muestro los lados, el perimetro y el area de cada objeto
		System.out.println("RECTANGULO 1");
		System.out.println(rectangulo1);
		System.out.println("Perímetro: " + perimetro1);
		System.out.println("Área: " + area1);

		// rectangulo 2
		System.out.println("RECTANGULO 2");
		System.out.println(rectangulo2);
		System.out.println("Perímetro: " + perimetro2);
		System.out.println("Área: " + area2);

		// modificacion de las coordenadas del rectangulo 1
		rectangulo1.setAll(2, 8, 1, 9);

		// modificacion de las coordenadas del rectangulo 2
		rectangulo2.setX1Y1(-6, 5);
		rectangulo2.setX2Y2(10, 7);

		// suma de los lados del rectagulo 1
		perimetro1 = rectangulo1.getPerimetro();

		// suma de los lados del rectangulo 2
		perimetro2 = rectangulo2.getPerimetro();

		// area del rectangulo 1
		area1 = rectangulo1.getArea();

		// area del rectangulo 2
		area2 = rectangulo2.getArea();

		System.out.println();
		System.out.println();

		// muestro los lados, el perimetro y el area de cada objeto
		System.out.println("RECTANGULO 1");
		System.out.println(rectangulo1);

		// rectangulo 2
		System.out.println("RECTANGULO 2");
		System.out.println(rectangulo2);
	}

}
