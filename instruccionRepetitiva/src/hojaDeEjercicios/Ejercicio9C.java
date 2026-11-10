package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio9C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		int numero;
		String resultado=""; 
		
		System.out.print("Teclea un numero:");
		numero=teclado.nextInt();
		

		while(numero!=0) {
			resultado = numero%2 + resultado;
			numero = numero / 2;
		}
		
		System.out.println(resultado);
	}

}
