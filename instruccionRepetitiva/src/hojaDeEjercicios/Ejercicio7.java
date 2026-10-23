package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea varios números por teclado hasta que se introduzca
			un cero, y entonces diga cuál es el mayor de los números introducidos y cuantas
			veces se repite ese número.
						Introduciendo: 1 3 5 5 4 6 6 7 1 4 7 2 0
						Da como salida: El mayor es el 7
						Se repite 2 veces
		 */

		Scanner teclado = new Scanner(System.in);
		
		int numero, mayor = Integer.MIN_VALUE; //constante que indica el minimo valor de los enteros
		int veces = 0; //variable para contar cuantas veces se repite el mayor
		
		do {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			
			if(numero > mayor) { //si el numero es mayor, lo cambio
				mayor = numero;
				veces = 1; // y de momento es la primera vez que aparece
			}else if( numero == mayor) {
				veces++;  //ha salido una vez mas
			}
			
		} while (numero != 0);
		
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("Se repite " + veces + " veces");
	}

}
