package alternativaDoble;

import java.util.Scanner;

public class EstadoCivil {

	public static void main(String[] args) {
		/*
		 * Programa que pida una letra y responde el estado civil de la persona
		 * 
		 *  sS  Soltero/a
		 *  cC  Casado/a
		 *  vV  Viudo/a
		 *  dD  Divorciado/a
		 *  
		 *  --  Error
		 */

		Scanner teclado = new Scanner(System.in);
		
		char letra;
		
		System.out.print("Teclea la letra de tu estado civil: ");
		letra = teclado.nextLine().charAt(0);

		
		switch (letra) {
		case 's', 'S' :
			System.out.println("Soltero/a");
			break;
		case 'c', 'C' :
			System.out.println("Casado/a");
			break;
		case 'v', 'V' :
			System.out.println("Viudo/a");
			break;
		case 'd', 'D' :
			System.out.println("Divorciado/a");
			break;
		default:
			System.out.println("Error: Letra incorrecta");
			break;
		}
	}

}
