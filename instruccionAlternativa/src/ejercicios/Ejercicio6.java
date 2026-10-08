package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día
			siguiente. suponiendo que cada mes tiene un número distinto de días (suponer
			que febrero tiene siempre 28 días).
		 */
		Scanner teclado = new Scanner(System.in);
		
		int dia, mes, año, diasDelMes;
		
		System.out.print("Teclea el dia: ");
		dia = teclado.nextInt();
		System.out.print("Teclea el mes: ");
		mes = teclado.nextInt();
		System.out.print("Teclea el año: ");
		año = teclado.nextInt();
		
		//averiguar cuantos dias tiene el mes
		switch (mes) {
		case 2:
			diasDelMes = 28;
			break;
		case 4, 6, 9, 11:
			diasDelMes = 30;
			break;	
		default:
			diasDelMes = 31;
		}
		
		//compruebo si estamos a final de mes
		if (diasDelMes == dia ) { //estoy a fin de mes
			dia = 1;
			mes++;
			if (mes > 12) { //si me he pasado de mes
				mes = 1;
				año++;
			}
		} else { //no es fin de mes
			dia++;
		}
		
		System.out.println("Dia siguiente: " + dia+"/"+mes+"/"+año);
		System.out.printf("Dia siguiente: %02d/%02d/%02d",dia,mes,año);
	}

}
