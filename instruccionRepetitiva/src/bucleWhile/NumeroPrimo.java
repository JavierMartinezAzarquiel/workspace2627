package bucleWhile;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		/*
		 * Programa que calcule si un número es número primo
		 */
		Scanner teclado = new Scanner(System.in);
		int numero;
		boolean haSalidoUnRestoCero = false;
		
		System.out.print("Teclea un numero: ");
		numero= teclado.nextInt();
		
		for (int i = 2; i < numero; i++) { //comprobamos todos los números a partir del 2
			if (numero % i == 0) { //si el resto es cero
				haSalidoUnRestoCero = true; //anotamos en la variable  Flag
			}
		}
		
		if (haSalidoUnRestoCero) {
			System.out.println("No es primo");
		} else {
			System.out.println("Numero Primo");
		}
		
	}

}
