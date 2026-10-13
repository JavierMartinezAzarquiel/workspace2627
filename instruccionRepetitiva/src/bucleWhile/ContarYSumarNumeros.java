package bucleWhile;

import java.util.Scanner;

public class ContarYSumarNumeros {

	public static void main(String[] args) {
		// Programa que suma todos los numeros que vamos tecleando
		// hasta que pongamos el 0
		// Muestra la suma y la cantidad de números que hemos tecleado
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, suma = 0, contador = 0;

		do {
			System.out.print("Teclea un numero: ");
			numero= teclado.nextInt();
			if (numero != 0) {
				contador++; //cuento un número mas
			} 
			suma = suma + numero;  //añado el número a la suma total
		} while ( numero != 0 );
		
		System.out.println("Total numeros tecleados: " + contador);
		System.out.println("La suma total es: " + suma);
	}

}
