package examenSorpresa;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Comprobar si un número es perfecto
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, sumaDeDivisores = 0;

		System.out.print("Teclea un numero: ");
		numero= teclado.nextInt();
		
		for (int i = 1; i < numero; i++) {
			if(numero%i == 0) {  //si es un divisor
				sumaDeDivisores += i; //lo añado a la suma
			}
		}
		
		
		if (sumaDeDivisores == numero) {
			System.out.println("Es perfecto");
		} else {
			System.out.println("No es perfecto");
		}
	}

}
