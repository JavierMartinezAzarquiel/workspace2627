package ejemplos;

public class Notas2 {

	public static void main(String[] args) {
		/*
		 * Array con las notas de las 3 evaluaciones
		 */

		//declarar un array para todas las notas
		//int[][] notas = new int[3][7];
		
		int[][] notas = {  {8, 5, 3, 5, 2, 9, 7},
						   {7, 6, 10,6, 5, 5, 1},
						   {5, 9, 8, 6, 8, 3, 1} };
		
		
		System.out.println( notas.length );
		System.out.println( notas[0].length );
		System.out.println( notas[1].length );
		System.out.println( notas[2].length );
		
		//imprimir array en la pantalla
		System.out.println("Contenido del array");
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");	
			}
			System.out.println();
		}
		
		/*Hacer un listado con la suma de notas de cada fila
		 * La fila 0 suma 39
		 * La fila 1 suma 40
		 * La fila 2 suma 40
		 */
		
		for (int i = 0; i < notas.length; i++) {
			int suma = 0;
			for (int j = 0; j < notas[i].length; j++) {
				suma += notas[i][j];
			}
			System.out.println("La fila " + i + " suma " + suma);
		}
		
		/*
		 * Hacer un listado con la suma de notas de cada columna
		 * La columna 0 suma 20
		 * La columna 1 suma 23
		 * ......
		 * La columna 6 suma 24
		 */
		for (int j = 0; j < notas[0].length; j++) {
			int suma = 0;
			for (int i = 0; i < notas.length; i++) {
				suma += notas[i][j];
			}
			System.out.println("La columna " + j + " suma " + suma);
		}
		
		/*
		 * Cuantos aprobados tengo en total
		 * Total aprobados: 16
		 */
		int contador = 0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] >= 5) {
					contador++;
				}
			}
		}
		System.out.println("Total aprobados: " + contador);
		
		/*
		 * Cuantos aprobados por evaluación
		 * Aprobados en la 1ºEv: 5
		 * Aprobados en la 2ºEv: 6
		 * Aprobados en la 3ºEv: 5
		 */
		
		
		for (int i = 0; i < notas.length; i++) {
			contador = 0;
			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] >= 5) {
					contador++;
				}
			}
			System.out.println("Aprobados en la "+(i+1)+"ºEv: " + contador);
		}
		
		/*
		 * Nota media de cada módulo
		 * Modulo 0: 6,47
		 * Modulo 1: 7,90
		 * ....
		 * Modulo 6: 3,26 
		 */
		
		for (int j = 0; j < notas[0].length; j++) {
			int suma = 0;
			for (int i = 0; i < notas.length; i++) {
				suma += notas[i][j];
			}
			double media = (double)suma / notas.length;
			System.out.println("Módulo " + j + ": " + media);
		}
	}

}


