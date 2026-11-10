package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Transformar un numero entero en binario
		Scanner teclado = new Scanner (System.in);

		int numero;
		
		System.out.print("Teclea un numero:");
		numero=teclado.nextInt();
		

		while(numero!=0) {
			System.out.print(numero%2);
			numero = numero / 2;
		}
	}

}
