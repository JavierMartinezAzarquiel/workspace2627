package ejemplos;

import java.util.Arrays;

public class PruebasArrays {

	public static void main(String[] args) {
		//Arrays
		
		//declaración de una variable individual
		int i;
		
		//declaración de un array
		int[] a;

		//creamos la estructura array con un tamaño prefijado
		a = new int[20]; //estructura de 20 huecos numerados de 0 a 19
		
		//uso de la estructura
		a[6] = 149;
		
		//imprimo el array
		System.out.println("El valor del hueco 6 es: " + a[6]);
		System.out.println("El valor del hueco 7 es: " + a[7]);
		System.out.println("El array completo: " + a);
		
		//Array de Strings
		String[] palabras = new String[5];
		
		palabras[2] = "Hola";
		System.out.println("El valor del hueco 2 es: " + palabras[2]);
		System.out.println("El valor del hueco 3 es: " + palabras[3]);
		
		//crear un array dando los valores directamente
		int[] d = {12,32,57,18,23};
		
		d[3]++;
		
		for (int j = 0; j < d.length; j++) {
			System.out.println(d[j]);
		}
		
		System.out.println( Arrays.toString(d) );
	}

}






