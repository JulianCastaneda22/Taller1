package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner leer;

	public Console() {
		leer = new Scanner(System.in);
	}

	public int leerEntero() {
		return leer.nextInt();
	}

	public long leerLong() {
		return leer.nextLong();
	}

	public String leerPalabra() {
		return leer.next();
	}

	public float leerFloat() {
		return leer.nextFloat();
	}

	public double leerDouble() {

		return leer.nextDouble();
	}

	public String leerLinea() {
		return leer.nextLine();
	}

	public Boolean leerBooleano() {
		return leer.nextBoolean();
	}

	public void quemarLinea() {
		leer.nextLine();
	}

	public void imprimirConSalto(String dato) {
		System.out.println(dato);
	}

	public void imprimirSinSalto(String dato) {
		System.out.print(dato);
	}
}
