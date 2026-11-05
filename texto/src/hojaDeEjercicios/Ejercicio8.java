package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Igual al anterior, pero sumando los números completos.
				Introduciendo: “15 de Noviembre de 2022”
				Da como salida: 2037
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase, temporal = "";
		char letra;
		int numero, suma=0;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			//saco la letra numero i
			letra = frase.charAt(i);
			//si la letra es numérica,  la dejo en una variable temporal
			if ( Character.isDigit(letra) ) {
				//lo añadimos a un temporal
				temporal = temporal + letra;
			}else { //si la letra no es numérica, sumo lo que esté pendiente
				if(temporal.length()!=0) { //si hay algo en el temporal lo convierto
					numero = Integer.parseInt(temporal);
					suma += numero; //lo añado a la suma
					temporal = ""; //dejo el temporal vacío
				}
			}
		}
		
		//por si acaso queda algo pendiente en el temporal, lo convierto ahora
		numero = Integer.parseInt(temporal);
		suma += numero; //lo añado a la suma
		
		System.out.println("Suma: " + suma); 		
	}

}
