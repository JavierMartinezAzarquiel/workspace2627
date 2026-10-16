package examenSorpresa;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pedir numeros de dos cifras hasta que tecleemos uno con las cifras iguales
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, decenas, unidades;
		
		do {
			System.out.print("Teclea un numero: ");
			numero= teclado.nextInt();
			decenas = numero / 10;
			unidades = numero % 10;
		} while (decenas != unidades);
	}

}
