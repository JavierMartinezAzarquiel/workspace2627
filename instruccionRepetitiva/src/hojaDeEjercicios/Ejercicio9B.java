package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio9B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		int numero,resultado=0,exponente=0;
		
		System.out.print("Teclea un numero:");
		numero=teclado.nextInt();
		

		while(numero!=0) {
			resultado = resultado + ( numero%2 * (int)Math.pow(10, exponente));
			numero = numero / 2;
			exponente++;
		}
		
		System.out.println(resultado);
	}

}
