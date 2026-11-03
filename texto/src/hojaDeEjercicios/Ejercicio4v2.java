package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4v2 {

	public static void main(String[] args) {
		/*
		 * Programa que rote una cadena tantas veces como se le diga.
				Introduciendo: “Lunes”
				Rotaciones: 3
				Da como salida: “nesLu”
		 */

		Scanner teclado = new Scanner(System.in);

		String frase;
		StringBuilder fraseModerna;
		char letra;
		int rotaciones;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		System.out.print("¿Cuantas letras rotamos?: ");
		rotaciones = teclado.nextInt();
		
		//convierto la frase antigua en moderna
		fraseModerna = new StringBuilder(frase);
		
		//bucle para repetir todas las veces que me digan en rotaciones
		for (int i = 1; i <= rotaciones ; i++) {
			//sacar una copia de la última letra
			letra = fraseModerna.charAt( fraseModerna.length()-1 );
			//eliminar esa última letra de la frase
			fraseModerna.deleteCharAt( fraseModerna.length()-1 );
			//añadirla al principio
			fraseModerna.insert(0, letra);
		}
		
		System.out.println("Resultado: " + fraseModerna);
	}

}
