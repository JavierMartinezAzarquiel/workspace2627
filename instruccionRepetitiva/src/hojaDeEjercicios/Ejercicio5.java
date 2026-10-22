package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Programa que escriba los n primeros numeros de la sucesion de Fibonacci. El
			primer numero de la serie es 0, el segundo es 1 y cada uno de los siguientes es la
			suma de los dos anteriores a el.
				Introduciendo:10
				Da como salida: 0 1 1 2 3 5 8 13 21 34
		 */

		Scanner teclado = new Scanner(System.in);
		int cuantos, nuevo, anterior1, anterior2;
		
		System.out.print("¿Cuantos números quieres?: ");
		cuantos = teclado.nextInt();
		
		System.out.print("0 1 ");
		anterior2 = 0;
		anterior1 = 1;
		
		for (int i = 3; i <= cuantos; i++) {
			nuevo = anterior1 + anterior2;
			System.out.print(nuevo + " ");
			//me preparo para la siguiente vuelta
			anterior2 = anterior1;
			anterior1 = nuevo;
		}
		
		
		
	}

}
