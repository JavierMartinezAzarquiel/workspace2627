package pruebas;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		// Pedimos una frase y contamos cuantas vocales hay

		Scanner teclado = new Scanner(System.in);

		System.out.print("Teclea una frase: ");
		String frase = teclado.nextLine();

		int contadorVocales = 0;

		//bucle para ir recorriendo todo el contenido de la frase
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			//comprobar si la letra es una vocal
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' 
				|| letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
				contadorVocales++;
			}
		}
		
		System.out.print("Total vocales: " + contadorVocales);

	}

}
