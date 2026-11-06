package hojaDeEjercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio11v2 {

	public static void main(String[] args) {
		/*
		 * Programa que elimina todas las vocales de una frase.
				Introduciendo: “Hola a Todos”
				Da como salida: “Hl Tds”
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase,vocales="aeiouAEIOUáéíóÁÉÍÓÚ";
		
		
		System.out.println("Escribe una frase y quitara las vocales");
		frase = teclado.nextLine();
		
		for (int i = 0; i < vocales.length(); i++) {
			frase = frase.replace(String.valueOf(vocales.charAt(i))  , "" );
		}
		System.out.println(frase);
		 
	}

}
