package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Objeto que me ayuda para trabajar con el teclado
		Scanner teclado = new Scanner(System.in);
		
		byte edad;
		boolean mayorDeEdad;
		
		System.out.print("Teclea tu edad: ");
		edad = teclado.nextByte();
		
		mayorDeEdad = edad >= 18;
		
		System.out.println("Mayor de edad: " + mayorDeEdad);

	}

}
