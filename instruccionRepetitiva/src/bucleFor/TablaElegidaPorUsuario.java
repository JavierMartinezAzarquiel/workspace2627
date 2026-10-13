package bucleFor;

import java.util.Scanner;

public class TablaElegidaPorUsuario {

	public static void main(String[] args) {
		// Programa que imprime la tabla de multiplicar que el usuario elija

		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.print("¿Que tabla quieres?: ");
		numero= teclado.nextInt();
		
		System.out.println("Tabla del " + numero);
		for (int i = 0; i <= 10 ; i++) {
			System.out.println(numero + " x " + i + " = " + numero*i);
		}
		
	}

}
