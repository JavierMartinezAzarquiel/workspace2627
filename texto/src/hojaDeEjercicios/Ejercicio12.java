package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * 12. Realiza un programa que lea un String y elimine las palabras de menos de
			tres letras. Una vez eliminadas esas palabras, no deben existir espacios
			duplicados.
			Ejemplo: “El bar de la plaza”
			Dará como resultado: “bar plaza”
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea una frase: ");
		String frase = sc.nextLine();
		
		StringBuilder sb = new StringBuilder("");
		
		StringTokenizer st = new StringTokenizer(frase);
		String token;
		
		while(st.hasMoreElements()) {
			token = st.nextToken();
			if (token.length()>=3) {
				sb.append(token);
				sb.append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
	

}
