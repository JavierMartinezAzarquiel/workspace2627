package bucleWhile;

import java.util.Scanner;

public class PruebaContinue {

	public static void main(String[] args) {
		// Programa que suma todos los numeros que vamos tecleando
		// hasta que pongamos el 0
		// Solo sumamos los positivos, los negativos no
		// Usando la instrucción CONTINUE

		Scanner teclado = new Scanner(System.in);

		int numero, suma = 0;

		do {
			System.out.print("Teclea un numero: ");
			numero= teclado.nextInt();
			if(numero < 0) { //si el numero es negativo, paso de el
				continue;
			}
			suma = suma + numero;  //añado el número a la suma total
		} while ( numero != 0 );

		
		System.out.println("La suma total es: " + suma);

	}

}
