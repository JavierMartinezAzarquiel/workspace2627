package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Programa que codifique una cadena cambiando cada letra por la siguiente en
		   el código ASCII.
				Introduciendo: “Lunes”
				Da como salida: “Mvoft”
		 */

		Scanner teclado = new Scanner(System.in);

		String frase, fraseEncriptada="";
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			//sacar la letra numero i
			char letra = frase.charAt(i);
			//la modifico
			letra++;  //pasamos al siguiente código, siguiente letra
			//una vez modificada, la añado a la nueva frase
			fraseEncriptada = fraseEncriptada + letra;
		}
		
		System.out.println(fraseEncriptada);
	}

}





