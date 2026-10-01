package ejercicios;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// Hacemos un programa que pida 2 números enteros por teclado
		// y calculamos la suma.

		//Objeto que me ayuda para trabajar con el teclado
		Scanner teclado = new Scanner(System.in);
		int primerNumero, segundoNumero, suma; //tres variables para guardar los datos
		
		System.out.print("Teclea un número: ");
		primerNumero = teclado.nextInt();  //pido al objeto teclado que recoja el valor tecleado
		
		System.out.print("Teclea otro número: ");
		segundoNumero = teclado.nextInt();
		
		//ahora calculo la suma de los dos
		suma = primerNumero + segundoNumero;
		//lo muestro en pantalla
		System.out.println("La suma es: " + suma);
		
		
		
		
	
	}

}
