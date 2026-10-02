package alternativaDoble;

import java.util.Scanner;

public class DiasDelMes {

	public static void main(String[] args) {
		/* Pedimos un número entre 1 y 12 (mes)
		 * imprimimos la cantidad de dias de ese mes
		 * 
		 * Ejemplo:
		 *    Teclea un número del 1 al 12: 6
		 *    Tiene 30 dias
		 */
		int mes;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero del 1 al 12: ");
		mes = teclado.nextInt();

		
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("Tiene 31 dias");
			break;
		case 2:
			System.out.println("Tiene 28 dias");
			break;
		case 4, 6, 9, 11:
			System.out.println("Tiene 30 dias");
			break;	
		default:
			System.out.println("Error: mes no válido");
			break;
		}
	}

}
