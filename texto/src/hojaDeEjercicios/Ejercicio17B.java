package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio17B {


	
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.print("asignaturas: ");
			String asignaturas = teclado.nextLine();
			System.out.print("notas: ");
			String notas = teclado.nextLine();
			String aprobadas="", asig="";
			
			StringTokenizer tokenAsignaturas = new StringTokenizer(asignaturas, ":");
			StringTokenizer tokenNotas = new StringTokenizer(notas, ":");
			
			while(tokenAsignaturas.hasMoreTokens()) {
				asig = tokenAsignaturas.nextToken();
				String snot = tokenNotas.nextToken();
				int not = Integer.parseInt(snot);
				if(not >= 5) {
					aprobadas += asig;
					aprobadas += " ";
				}
				
			}
			System.out.print("Las asignaturas aprobadas son: " +aprobadas);
		}

	}
