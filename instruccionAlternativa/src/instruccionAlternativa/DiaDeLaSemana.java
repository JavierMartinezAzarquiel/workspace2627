package instruccionAlternativa;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
		// Programa que pida un número del 1 al 7 e imprima en pantalla el dia de la semana
		// Si ponen un número raro, ponemos un mensaje de error

		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un número del 1 al 7: ");
		int numero = teclado.nextInt();
		
		//solución muy poco eficiente
		if (numero == 1) {System.out.println("Lunes");}
		if (numero == 2) {System.out.println("Martes");}
		if (numero == 3) {System.out.println("Miercoles");}
		if (numero == 4) {System.out.println("Jueves");}
		if (numero == 5) {System.out.println("Viernes");}
		if (numero == 6) {System.out.println("Sabado");}
		if (numero == 7) {System.out.println("Domingo");}
		if (numero > 7 || numero < 1) {System.out.println("Estas empanao");}
		
		
		//solución mas eficiente y formal
		if (numero == 1) {
			System.out.println("Lunes");
		} else {
			if (numero == 2) {
				System.out.println("Martes");
			} else {
				if (numero == 3) {
					System.out.println("Miercoles");
				} else {
					if (numero == 4) {
						System.out.println("Jueves");
					} else {
						if (numero == 5) {
							System.out.println("Viernes");
						} else {
							if (numero == 6) {
								System.out.println("Sábado");
							} else {
								if (numero == 7) {
									System.out.println("Domingo");
								} else {
									System.out.println("Error");
								}
							}
						}
					}
				}
			}
		}
		
		//Solución eficiente y rápida de escribir
		if (numero == 1) {System.out.println("Lunes");} 
		else if (numero == 2) {System.out.println("Martes");}
		else if (numero == 3) {System.out.println("Miercoles");}
		else if (numero == 4) {System.out.println("Jueves");}
		else if (numero == 5) {System.out.println("Viernes");}
		else if (numero == 6) {System.out.println("Sabado");}
		else if (numero == 7) {System.out.println("Domingo");}
		else if (numero > 7 || numero < 1) {System.out.println("Estas empanao");}
		
	}

}
