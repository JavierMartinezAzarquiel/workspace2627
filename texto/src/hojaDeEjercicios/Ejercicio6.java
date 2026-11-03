package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Programa que descubra si una palabra es o no palíndroma, es decir se lee
			igual del derecho que del revés.
					Introduciendo: “oso”
					Da como salida: true
		 */

		Scanner teclado = new Scanner(System.in);

		String frase;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		//convertir la frase en un StringBuilder
		StringBuilder sb = new StringBuilder(frase);
		
		//le doy la vuelta a la frase
		sb.reverse();
		
		if ( frase.equals( sb.toString() )) {
			System.out.println("Es palindroma");
		} else {
			System.out.println("No es palindroma");
		}
	}

}



