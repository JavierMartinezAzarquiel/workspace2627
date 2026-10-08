package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero entre 0 y 9999: ");
		int numero = teclado.nextInt();
		
		if (numero < 10) {
			System.out.println("El número tiene 1 cifra");
		} else if(numero<100){
			System.out.println("El número tiene 2 cifras");
		}else if(numero<1000){
			System.out.println("El número tiene 3 cifras");
		}else if(numero<10000){
			System.out.println("El número tiene 4 cifras");
		}
	}

}
