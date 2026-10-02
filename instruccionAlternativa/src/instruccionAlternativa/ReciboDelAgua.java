package instruccionAlternativa;

import java.util.Scanner;

public class ReciboDelAgua {

	public static void main(String[] args) {
		/*
		 * Programa que calcule cuanto pagamos en el recibo del agua
		 * Pedimos por teclado el número de mº de agua que hemos consumido
		 * Calculamos el precio:
		 *   Hasta 10mº a 1€
		 *   de 11 a 20 mº a 4€
		 *   mas de 20mº a 10€
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea cuantos m\u00b3 has consumido: ");
		int agua = teclado.nextInt();

		final int PRECIOBARATO = 1;
		final int PRECIOMEDIO = 4;
		final int PRECIOCARO = 10;
		int total=0;
		teclado.close();

		if (agua >= 1 && agua <= 10) {
			total = agua * PRECIOBARATO;
		} else if (agua >= 11 && agua <= 20) {
			total = 10 * PRECIOBARATO + (agua - 10) * PRECIOMEDIO;
		} else if(agua >= 20){
			total = 10 * PRECIOBARATO + 10 * PRECIOMEDIO + (agua - 20) * PRECIOCARO ;
		} 
		System.out.println("Debes " + total + "€");
	}
}