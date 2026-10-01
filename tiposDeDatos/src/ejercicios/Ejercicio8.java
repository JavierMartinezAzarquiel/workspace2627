package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 *     8. Crea un programa que pida cual es el radio de una circunferencia y nos calcule cual es la longitud y el área.
		 */

		Scanner teclado = new Scanner(System.in);
		
		double radio, longitud, area;
		
		System.out.print("Teclea el valor del radio: ");
		radio = teclado.nextDouble();
		
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El área de la circunferencia es: " + area);
	}

}
