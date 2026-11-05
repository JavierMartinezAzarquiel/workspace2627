package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Programa que recibe dos cadenas de caracteres y comprueba cuantas veces
			aparece la primera en la segunda.
						Introduciendo: “la”
						“La calle de la plaza”
						Da como salida: 2
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase, palabra;
		int contador = 0, lugar = -1;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		System.out.print("¿Que palabra busco?: ");
		palabra = teclado.nextLine();
		
		do {
			//buscar la palabra
			lugar = frase.indexOf(palabra, lugar +1);
			//si la encuentra, sumo 1 al contador
			if( lugar != -1 ) {
				contador++;
			}
		} while ( lugar != -1);
		
		
		System.out.println("La frase aparece "+ contador + " veces");
	}

}

