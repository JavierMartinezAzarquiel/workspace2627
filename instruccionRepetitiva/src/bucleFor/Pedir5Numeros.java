package bucleFor;

import java.util.Scanner;

public class Pedir5Numeros {

	public static void main(String[] args) {
		// Programa que pide que nos teclen 5 números
		// y nos muestre la suma de ellos

		Scanner teclado = new Scanner(System.in);
		int numero, suma=0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Teclea un numero: ");
			numero= teclado.nextInt();
			suma = suma + numero;  //añado el número a la suma total
		}
		
		System.out.println("Suma: " + suma);
	}

}
