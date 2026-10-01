package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 *  Realiza un programa que nos pida cuantos segundos duró un concierto,
			y nos calcule cuantas horas, minutos y segundos son.

				Ejemplo: Cuantos segundos duró el concierto: 8479
				Equivale a 2:21:19
		 */

		Scanner teclado = new Scanner(System.in);
		
		int duración, horas, minutos, segundos, resto;
		
		System.out.print("Cuantos segundos duró el concierto?: ");
		duración = teclado.nextInt();
		teclado.close();
		
		//vamos a averigüar las horas totales
		horas = duración / 3600;
		resto = duración % 3600; //segundos restantes de la división de horas
		
		minutos = resto / 60 ;
		segundos = resto % 60;
		
		System.out.println("Equivale a: " + horas + ":" + minutos + ":" + segundos);
	}

}
