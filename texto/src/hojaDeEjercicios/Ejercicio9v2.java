package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio9v2 {

	public static void main(String[] args) {
		/*
		 * Programa que recibe dos cadenas de caracteres y comprueba cuantas veces
			aparece la primera en la segunda.
						Introduciendo: “la”
						“La calle de la plaza”
						Da como salida: 2
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase, palabra, token;
		int contador = 0, lugar = -1;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		System.out.print("¿Que palabra busco?: ");
		palabra = teclado.nextLine();
		
		//Uso un StringTokenizer para dividir la frase en palabras
		StringTokenizer st = new StringTokenizer(frase,"., ;");
		
		while (st.hasMoreTokens()) {
			//pido un token y compruebo si es lo que busco
			token = st.nextToken();
			if ( token.equalsIgnoreCase(palabra) ) {
				contador++;
			}
		}
		
		System.out.println("La frase aparece "+ contador + " veces");
	}

}

