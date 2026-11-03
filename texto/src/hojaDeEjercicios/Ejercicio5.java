package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Programa que lea un numero double, lo convierta a una cadena y le añada las
			comas separadoras de los miles.
						Introduciendo: 2388432.34
						Da como salida: “2,388,432.34”
		 */
		
		Scanner teclado = new Scanner(System.in);

		double numero;
		StringBuilder sb;
		
		System.out.print("Teclea un numero: ");
		numero = teclado.nextDouble();
		
		//convertir el número en StringBuilder
//		s = String.valueOf(numero);
//		sb = new StringBuilder(s);
		sb = new StringBuilder(String.valueOf(numero));
		
		//busco el lugar donde está el punto
		int lugarPunto = sb.indexOf(".");
		
		//calcular donde iría la coma
		int lugarComa = lugarPunto - 3;
		
		while(lugarComa > 0) { //si el lugar de la coma es correcto, la añado
			sb.insert(lugarComa, ',' );
			lugarComa = lugarComa - 3;
		}
		
		System.out.println(sb);
	}

}



