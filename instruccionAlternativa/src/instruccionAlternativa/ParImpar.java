package instruccionAlternativa;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// Pedimos un número entero y decimos si es par o impar

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Teclea un número: ");
		int numero = teclado.nextInt();
		
		if ( numero%2 == 0 ) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}

}
