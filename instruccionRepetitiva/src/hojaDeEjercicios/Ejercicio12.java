package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Piramide de numeros
		
		Scanner teclado = new Scanner (System.in);

		int numero;
				
		System.out.print("Teclea un numero:");
		numero=teclado.nextInt();		

		
		//bucle principal
		for (int i = 1; i <= numero; i++) {
			
			//bucle para imprimir los espacios
			for (int j = 1; j <= numero-i ; j++) {
				System.out.print(" ");
			}
			
			//bucle para imprimir los numeros hacia adelante
			for (int j = 1; j <= i ; j++) {
				System.out.print(j);
			}
			
			//bucle para imprimir los numeros hacia atras
			for (int j = i-1; j >= 1 ; j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}
