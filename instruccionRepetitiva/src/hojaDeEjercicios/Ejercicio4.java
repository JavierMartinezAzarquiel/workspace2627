package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Programa que lea números hasta que se teclee un número negativo y después
			indique si se ha dado el mismo número dos veces consecutivas:
			
			Introduciendo: 1 3 5 3 4 6 7 –1
			Da como salida: No
			Introduciendo: 1 3 5 6 6 4 3 –1
			Da como salida : Si
		 */
		Scanner teclado = new Scanner(System.in);
		
		int numero, anterior; //la variable sirve para guardar el número que salió antes
		boolean hanSalidoRepetidos = false;
		
		//pedimos el primer número antes del bucle
		System.out.print("Teclea un número: ");
		numero = teclado.nextInt();
		anterior = numero;  //guardamos en anterior para que cuando leamos el segundo ya tenga algo.
		
		while (numero >= 0) {
			
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			
			if ( numero == anterior) {
				hanSalidoRepetidos = true;
			}
			
			//me preparo para la siguiente vuelta
			anterior = numero;
		}
		
		System.out.println("Han salido repetidos: " + hanSalidoRepetidos);
	}

}





