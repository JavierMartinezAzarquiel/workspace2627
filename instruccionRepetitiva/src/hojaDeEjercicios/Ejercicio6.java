package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que calcule la potencia de un numero a^n . La potencia se
			hará por medio de multiplicaciones, está prohibido usar Math.pow().
					si n es mayor que cero se hará una potencia normal
					si n es menor que cero se hará 	1 / a^n
					y si n cero la solución será 1
		 */

		Scanner teclado = new Scanner(System.in);
		int base, exponente;
		double resultado;
		
		System.out.print("Teclea la base: ");
		base = teclado.nextInt();
		System.out.print("Teclea el exponente: ");
		exponente = teclado.nextInt();
		
		if (exponente == 0) {
			System.out.println("Resultado: 1");
		} else if (exponente > 0) {
			//La potencia es positiva
			resultado = 1;
			for (int i = 1; i <= exponente; i++) {
				resultado *= base;
			}
			System.out.println("Resultado: " + resultado);
		} else {
			//la potencia es negativa
			resultado = 1;
			exponente *= -1; //poner el exponente en positivo
			for (int i = 1; i <= exponente; i++) {
				resultado *= base;
			}
			System.out.println("Resultado: " + 1/resultado);
		}
	}

}





