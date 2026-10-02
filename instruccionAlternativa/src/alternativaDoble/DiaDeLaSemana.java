package alternativaDoble;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
		// Pedimos un número del 1 al 7 e imprimimos el dia de la semana
		// Usando SWITCH
		
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero del 1 al 7: ");
		numero = teclado.nextInt();
		
		switch (numero) { //el switch actua dependiendo del contenido de número
 		case 1:
			System.out.println("Lunes");
			break;
 		case 2:
			System.out.println("Martes");
			break;
 		case 3:
			System.out.println("Miercoles");
			break;
 		case 4:
			System.out.println("Jueves");
			break;
 		case 5:
			System.out.println("Viernes");
			break;
 		case 6:
			System.out.println("Sábado");
			break;
 		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Día incorrecto");
			break;
		}
	}

}
