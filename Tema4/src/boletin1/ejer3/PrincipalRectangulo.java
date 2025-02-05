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

		rectangulo2 = new Rectangulo(7, 2, 9, 3);

		// suma de los lados del rectagulo 1
		perimetro1 = Math.abs(2 * (rectangulo1.getX1() - rectangulo1.getX2()))
				+ Math.abs(2 * (rectangulo1.getY1() - rectangulo1.getY2()));

		// suma de los lados del rectangulo 2
		perimetro2 = Math.abs(2 * (rectangulo2.getX1() - rectangulo2.getX2()))
				+ Math.abs(2 * (rectangulo2.getY1() - rectangulo2.getY2()));

		// area del rectangulo 1
		area1 = Math.abs((rectangulo1.getX1() - rectangulo1.getX2()) * (rectangulo1.getY1() - rectangulo1.getY2()));

		// area del rectangulo 2
		area2 = Math.abs((rectangulo2.getX1() - rectangulo2.getX2()) * (rectangulo2.getY1() - rectangulo2.getY2()));

		// muestro los lados, el perimetro y el area de cada objeto
		System.out.println("RECTANGULO 1");
		System.out.println(
				" Coordenadas: (" + rectangulo1.getX1() + "," + rectangulo1.getY1() + ") y (" + rectangulo1.getX2()
						+ "," + rectangulo1.getY2() + ")\n Perímetro: " + perimetro1 + "\n Área: " + area1);

		// rectangulo 2
		System.out.println("RECTANGULO 2");
		System.out.println(
				" Coordenadas: (" + rectangulo2.getX1() + "," + rectangulo2.getY1() + ") y (" + rectangulo2.getX2()
						+ "," + rectangulo2.getY2() + ")\n Perímetro: " + perimetro2 + "\n Área: " + area2);

		// modificacion de las coordenadas del rectangulo 1
		rectangulo1.setX1(8);
		rectangulo1.setX2(2);
		rectangulo1.setY1(7);
		rectangulo1.setY2(1);

		// modificacion de las coordenadas del rectangulo 2
		rectangulo2.setX1(10);
		rectangulo2.setX2(-6);
		rectangulo2.setY1(5);
		rectangulo2.setY2(7);

		// suma de los lados del rectagulo 1
		perimetro1 = Math.abs(2 * (rectangulo1.getX1() - rectangulo1.getX2()))
				+ Math.abs(2 * (rectangulo1.getY1() - rectangulo1.getY2()));

		// suma de los lados del rectangulo 2
		perimetro2 = Math.abs(2 * (rectangulo2.getX1() - rectangulo2.getX2()))
				+ Math.abs(2 * (rectangulo2.getY1() - rectangulo2.getY2()));

		// area del rectangulo 1
		area1 = Math.abs((rectangulo1.getX1() - rectangulo1.getX2()) * (rectangulo1.getY1() - rectangulo1.getY2()));

		// area del rectangulo 2
		area2 = Math.abs((rectangulo2.getX1() - rectangulo2.getX2()) * (rectangulo2.getY1() - rectangulo2.getY2()));

		System.out.println();
		System.out.println();

		// muestro los lados, el perimetro y el area de cada objeto
		System.out.println("RECTANGULO 1");
		System.out.println(
				" Coordenadas: (" + rectangulo1.getX1() + "," + rectangulo1.getY1() + ") y (" + rectangulo1.getX2()
						+ "," + rectangulo1.getY2() + ")\n Perímetro: " + perimetro1 + "\n Área: " + area1);

		// rectangulo 2
		System.out.println("RECTANGULO 2");
		System.out.println(
				" Coordenadas: (" + rectangulo2.getX1() + "," + rectangulo2.getY1() + ") y (" + rectangulo2.getX2()
						+ "," + rectangulo2.getY2() + ")\n Perímetro: " + perimetro2 + "\n Área: " + area2);
	}

}
