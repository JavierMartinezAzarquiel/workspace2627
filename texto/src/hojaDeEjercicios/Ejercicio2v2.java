package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio2v2 {

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
		
		//StringTokenizer es una herramienta para trocear una frase
		//opcionalmente se le pueden poner los caracteres donde cortar
		//sino, el siempre corta por los espacios en blanco
		StringTokenizer troceador = new StringTokenizer(frase, ",. ");
		
		contadorDePalabras = troceador.countTokens();
		
		System.out.println("Total palabras: " + contadorDePalabras);
		
		System.out.println("\nPalabras: ");
		
		while (troceador.hasMoreTokens()) {
			System.out.println(troceador.nextToken());
		}
	}

}





