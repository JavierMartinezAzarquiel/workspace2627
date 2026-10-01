package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
/*
 * Elabora un programa que nos pregunte nuestro peso, y calcule cuanto
   pesaríamos si nos vamos a vivir a la Luna. Sabemos que en la Tierra la
   gravedad en de 9.8, mientras que en la Luna es de 1.62 
 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaración de dos constantes para las gravedades
		final float GTIERRA=9.8F;
		final float GLUNA=1.62F;
		
		float pesoEnLaTierra, pesoEnLaLuna;
		
		System.out.print("Dime tu peso: ");
		pesoEnLaTierra = teclado.nextFloat();
		teclado.close();
		
		pesoEnLaLuna = pesoEnLaTierra * GLUNA / GTIERRA;
		
		System.out.println("En la Luna pesarías: " + pesoEnLaLuna + " kilos");
		
	}

}
