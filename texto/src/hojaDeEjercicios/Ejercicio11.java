package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * Programa que elimina todas las vocales de una frase.
				Introduciendo: “Hola a Todos”
				Da como salida: “Hl Tds”
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase;
		StringBuilder fraseNoVocales = new StringBuilder();
		
		System.out.println("Escribe una frase y quitara las vocales");
		frase = teclado.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != 'a' && frase.charAt(i) != 'e' && frase.charAt(i) != 'i' 
				&& frase.charAt(i) != 'o' && frase.charAt(i) != 'u' ) {
				
				fraseNoVocales.append(frase.charAt(i));
			}
		}
		
		System.out.println("Introduciendo: " + frase);
		System.out.println("Da como salida: " + fraseNoVocales);
		 
	}

}
