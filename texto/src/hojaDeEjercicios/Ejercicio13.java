package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * 13. Realiza un programa que averigüe cual es la palabra que mas letras tiene de
			un String. El String solo contendrá letras y espacios de separación, nada más.
				En el ejemplo: “Este Mp3 lo conecto al puerto usb”
				El método debe retornar la palabra “conecto” que es la que más letras
				tiene.
		 */

		Scanner teclado = new Scanner(System.in);
		String frase, trozo, palabraMayor = "";
		
		System.out.println("Teclea una frase: ");
		frase = teclado.nextLine();
		
		StringTokenizer fraseTroceada = new StringTokenizer(frase);
		
		while (fraseTroceada.hasMoreTokens()) {
			trozo = fraseTroceada.nextToken();
			if (trozo.length() > palabraMayor.length()) {
				palabraMayor = trozo;
			}
		}
		
		System.out.println(palabraMayor);
	}

}





