package boletin4.ejer2;

public class Contador {

	int cont;

	Contador(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public void incrementar() {
		this.cont++;
	}

	public void decrementar() {

		if (--cont < 0) {
			this.cont = 0;
		}
	}

	@Override
	public String toString() {
		return "Contador: " + cont;
	}

}
