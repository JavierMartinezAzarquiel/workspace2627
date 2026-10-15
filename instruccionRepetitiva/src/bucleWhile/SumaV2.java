package bucleWhile;

import java.util.Scanner;

public class SumaV2 {

	public static void main(String[] args) {
		/*
		 * Pedimos cuanto tiene que sumar en total
		 * Y debemos responder con la cantidad de terminos necesarios
		 * 
		 *  1 + 1/2 + 1/3 + 1/4 + ....
		 */

		Scanner teclado = new Scanner(System.in);
		double suma=0, cuantoSumarEnTotal; 
		int contador = 1; //para saber por que termino voy sumando
		
		System.out.print("¿Cuanto tengo que sumar en total?: ");
		cuantoSumarEnTotal= teclado.nextDouble();
		
		while ( suma < cuantoSumarEnTotal) {
			suma += 1.0/contador;
			contador++;
		}
		
		System.out.println("Términos necesarios: " + (contador-1) );
		
	}

}
