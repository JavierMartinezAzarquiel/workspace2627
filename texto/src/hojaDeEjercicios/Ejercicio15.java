package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * 15. Realiza un programa que pida al usuario que escriba varias palabras. El
			programa debe contar cuantas vocales tiene cada palabra y dará como
			resultado la palabra que más vocales tenga. Se deben ir pidiendo palabras al
			usuario hasta que este escriba la palabra “FIN”.
						Ejemplo: El programa debe generar la siguiente salida
						Escribe una palabra: JUEGO
						Escribe una palabra: INVIERNO
						Escribe una palabra: AJEDREZ
						Escribe una palabra: FIN
						La palabra con más vocales es: INVIERNO
						Y tiene 4 vocales
		 */
		Scanner teclado = new Scanner(System.in);
		String palabra;
		String pamayor ="";
		
		int contador =0;
		int contmayor =0;
		
		while(true) {
			
			System.out.print("Introduce una palabra");
			palabra = teclado.nextLine().toLowerCase();
			
			contador=0;
			for(int i = 0;i<palabra.length();i++) {
				char caracter = palabra.charAt(i);
				if(caracter == 'a'||caracter == 'e'||caracter == 'i'||caracter == 'o'||caracter == 'u') {
					contador++;
				}
			}
			if(contador>contmayor) {
				pamayor=palabra;
				contmayor=contador;
			}
			
			if(palabra.equalsIgnoreCase("fin")){
				break;
			}
		}
		System.out.println("la palabra con mas vocales es:");
		System.out.println(pamayor.toUpperCase());
	}

}
