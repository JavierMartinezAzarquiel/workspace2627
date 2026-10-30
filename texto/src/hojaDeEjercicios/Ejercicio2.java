package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Programa que reciba una cadena y diga cuantas palabras contiene. (Las
		palabras pueden estar separadas por espacios, puntos o comas).
				Introduciendo: “Hola a todos.Adios”
				Da como salida: 4
		 */

		Scanner teclado = new Scanner(System.in);

		String frase;
		int contadorDePalabras=0;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == ' ' || frase.charAt(i) == '.' || frase.charAt(i) == ',' ) {
				contadorDePalabras++;
			}
		}
		
		System.out.println("Total palabras: " + contadorDePalabras);
	}

}





