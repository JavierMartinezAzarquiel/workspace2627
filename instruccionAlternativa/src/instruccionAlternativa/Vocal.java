package instruccionAlternativa;

import java.util.Scanner;

public class Vocal {

	public static void main(String[] args) {
		// Pedimos una letra y decimos si es vocal
		
		Scanner teclado = new Scanner(System.in);
		
		char letra;
		
		System.out.print("Teclea una letra: ");
		letra = teclado.nextLine().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' 
		   || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("Es vocal");
		} else {
			System.out.println("No es vocal");
		}
		
	}

}
