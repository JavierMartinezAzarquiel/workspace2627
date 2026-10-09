package bucleFor;

public class PruebaFor {

	public static void main(String[] args) {
		/*
		 *   Instrucción repetitiva FOR
		 *   
		 *    for(inicio ; condición de final ; incremento){
		 *    	instrucciones;
		 *    }
		 *   
		 */

		//Prueba para repetir algo 5 veces
		
		for (int i = 1; i <= 5 ; i++) {
			System.out.println("Hola");
		}
		
		for (int i = 1; i <= 5 ; i++) {
			System.out.println("Iteración: " + i);
		}
		
		for (int i = 5 ; i >=1 ; i--) {
			System.out.println("Iteración: " + i);
		}
		
		for (int i = 2; i <= 10 ; i+=2) {
			System.out.println("Iteración: " + i);
		}
		
		for (double i = 1; i <= 5 ; i+=0.5) {
			System.out.println("Iteración: " + i);
		}
	}

}








