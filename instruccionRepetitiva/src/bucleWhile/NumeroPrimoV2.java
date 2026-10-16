package bucleWhile;

import java.util.Scanner;

public class NumeroPrimoV2 {

	public static void main(String[] args) {
		/*
		 * Programa que calcule si un número es número primo
		 */
		Scanner teclado = new Scanner(System.in);
		int numero;
		boolean haSalidoUnRestoCero = false;
		
		System.out.print("Teclea un numero: ");
		numero= teclado.nextInt();
		
		//Solución mas eficiente, intentando que pare en el momento que
		//encontramos un resto cero.
		
		int i=2;
		while (i<numero && !haSalidoUnRestoCero) {
			if (numero % i == 0) { //si el resto es cero
				haSalidoUnRestoCero = true; //anotamos en la variable  Flag
			}
			i++;
		}
		
		if (haSalidoUnRestoCero) {
			System.out.println("No es primo");
		} else {
			System.out.println("Numero Primo");
		}
		
	}

}
