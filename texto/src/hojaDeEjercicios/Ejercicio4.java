package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Programa que rote una cadena tantas veces como se le diga.
				Introduciendo: “Lunes”
				Rotaciones: 3
				Da como salida: “nesLu”
		 */

		Scanner teclado = new Scanner(System.in);

		String frase;
		char letra;
		int rotaciones;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		System.out.print("¿Cuantas letras rotamos?: ");
		rotaciones = teclado.nextInt();
		
		//bucle para repetir todas las veces que me digan en rotaciones
		for (int i = 1; i <= rotaciones ; i++) {
			//sacar una copia de la última letra
			letra = frase.charAt( frase.length()-1 );
			//eliminar esa última letra de la frase
			frase = frase.substring(0,  frase.length()-1);
			//añadirla al principio
			frase = letra + frase;
		}
		
		System.out.println("Resultado: " + frase);
	}

}
