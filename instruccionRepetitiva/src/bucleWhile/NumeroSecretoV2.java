package bucleWhile;

import java.util.Scanner;

public class NumeroSecretoV2 {

	public static void main(String[] args) {
		/*
		 * Juego del número secreto
		 * Pedimos números hasta que acierte
		 * si ha fallado, damos ayuda diciendo mayor o menor
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		//elegir el número secreto de manera aleatoria
		int secreto = (int)(Math.random()*100);
		int numero; //variable donde guardo el número que teclean
		int intentos = 0; //contador para el número de intentos consumidos
		
		do {
			System.out.print("Teclea un numero: ");
			numero= teclado.nextInt();
			//cuento un intento mas
			intentos++;
			//dar ayuda si no ha acertado
			if(numero > secreto) {
				System.out.println("Menor");
			}else if(numero < secreto){
				System.out.println("Mayor");
			}
		} while ( numero != secreto && intentos != 10);
		
		if (numero == secreto) {
			System.out.println("Enhorabuena!!!");
			System.out.println("Has necesitado " + intentos + " intentos");
		} else {
			System.out.println("Eres un matao");
		}
		
	}

}




