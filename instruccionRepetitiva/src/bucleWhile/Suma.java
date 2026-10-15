package bucleWhile;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		/*
		 * Sumamos todos los términos de la serie que nos pidan
		 * 
		 *  1 + 1/2 + 1/3 + 1/4 + ....
		 */

		Scanner teclado = new Scanner(System.in);
		double suma=0; 
		int cuantoSumar;
		
		System.out.print("¿Cuanto terminos sumo?: ");
		cuantoSumar= teclado.nextInt();
		
		for (int i = 1; i <= cuantoSumar ; i++) {
			suma += 1.0/i;
		}
		
		System.out.println("Suma total: " + suma);
		
	}

}
