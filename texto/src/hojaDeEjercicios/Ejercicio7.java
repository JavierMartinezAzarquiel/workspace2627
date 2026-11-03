package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Programa que sume todas las cifras de los números que aparecen en una
			cadena de caracteres.
					Introduciendo: “15 de Noviembre de 2022”
					Da como salida: 12
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase;
		char letra;
		int numero, suma=0;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			//saco la letra numero i
			letra = frase.charAt(i);
			//si la letra es numérica, la convierto y la sumo
			if ( Character.isDigit(letra) ) {
				numero = Integer.parseInt( String.valueOf(letra) );
				suma += numero;
			}
		}
		
		System.out.println("Suma: " + suma); 		
	}

}
