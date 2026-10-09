package bucleWhile;

import java.util.Scanner;

public class PruebaWhile {

	public static void main(String[] args) {
		/*
		 *   Bucle while
		 *   
		 *    while(condicion){
		 *    	instrucciones;
		 *    }
		 *    
		 *    Bucle do/while
		 *    
		 *    do{
		 *    	instrucciones;
		 *    while(condicion);
		 */

		Scanner teclado = new Scanner(System.in);
		int numero=0;
		
		//intentar leer numeros hasta poner un 7;
		while ( numero != 7 ) {
			System.out.print("Teclea un numero: ");
			numero= teclado.nextInt();
		}
		System.out.println("Ya hemos terminado");
		
		
	}

}













