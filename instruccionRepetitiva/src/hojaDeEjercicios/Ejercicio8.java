package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Programa que descomponga un número en sus factores primos.

				Introduciendo: 75
				Da como salida : 3 5 5
		 */

		Scanner teclado = new Scanner(System.in);
		
		int numero, divisor = 2;
		
		System.out.print("Teclea un número: ");
		numero = teclado.nextInt();
		
		while (numero != 1) {
			if ( numero % divisor == 0) {
				numero /= divisor;
				System.out.println(divisor);
			} else {
				divisor++;
			}
		}
		
	}

}
