package hojaDeEjercicios;

public class Ejercicio11B {

	public static void main(String[] args) {
		// Imprimir un rombo

		
		//bucle para imprimir de 1 a 7
		for (int i = 1; i <= 7; i+=2) {

			for(int j=1;j<=(7-i)/2;j++) {//imprimo los espacios
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {  //imprimo los asteriscos
				System.out.print("*");
			}
			System.out.println(); //cambio de linea
		}

		
		//bucle para imprimir de 5 a 1
		for (int i = 5; i >= 1; i-=2) {
			
			for(int j=1;j<=(7-i)/2;j++) {//imprimo los espacios
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
