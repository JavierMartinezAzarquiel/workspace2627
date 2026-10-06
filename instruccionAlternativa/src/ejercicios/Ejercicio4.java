package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int numeroJugado, numeroPremiado;
		
		System.out.print("Introduce el número que juegas:");
		numeroJugado=teclado.nextInt();
//		System.out.print("Introduce el número premiado:");
//		numeroPremiado=teclado.nextInt();
		teclado.close();
		
		//elegir un número premiado de manera random
		numeroPremiado = (int) (Math.random()*100000); 
		//multiplicamos por 100000 para que el resultado esté entre 0 y 99999
		System.out.println("Número premiado: " + numeroPremiado);
		
		if (numeroJugado/10000 == numeroPremiado/10000 || numeroJugado%10 == numeroPremiado%10) {
			System.out.println("Tienes reintegro");
		} else {
			System.out.println("NO tienes reintegro");
		}
		
	}

}
