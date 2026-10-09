package bucleWhile;

import java.util.Scanner;

public class PruebaDoWhile {

	public static void main(String[] args) {
		/*    Bucle do/while
		 *    
		 *    do{
		 *    	instrucciones;
		 *    while(condicion);
		 */

		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		//intentar leer numeros hasta poner un 7;
		do {
			System.out.print("Teclea un numero: ");
			numero= teclado.nextInt();
		} while ( numero != 7 );
		
		System.out.println("Ya hemos terminado");
	}

}











