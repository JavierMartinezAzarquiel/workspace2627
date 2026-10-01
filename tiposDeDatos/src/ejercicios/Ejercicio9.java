package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 *     9. Prepara un programa que pide por teclado un número entero entre 0 y 99999, y lo escribe del revés.
					Teclea un número: 65741
					Del revés es: 14756
		 */

		Scanner teclado = new Scanner(System.in);
		
		int numero, unidades, decenas, centenas, unidadesMillar, decenasMillar;
		
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		
		unidades = numero % 10; 
		decenas = (numero / 10) % 10;
		centenas = (numero / 100) % 10;
		unidadesMillar = (numero / 1000) % 10;
		decenasMillar = numero / 10000;
		
		System.out.println("Del reves: " + unidades + decenas + centenas + unidadesMillar + decenasMillar);
	}

}
