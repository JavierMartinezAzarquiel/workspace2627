package hojaDeEjercicios;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Imprimir un rombo
		
		int espacios=3;
		//bucle para imprimir de 1 a 7
		for (int i = 1; i <= 7; i+=2) {
			
			for(int j=1;j<=espacios;j++) {//imprimo los espacios
				System.out.print(" ");
			}
			espacios--; //la siguiente vuelta imprimo un espacio menos
			for(int j=1;j<=i;j++) {  //imprimo los asteriscos
				System.out.print("*");
			}
			System.out.println(); //cambio de linea
		}
		
		espacios=1;
		//bucle para imprimir de 5 a 1
		for (int i = 5; i >= 1; i-=2) {
			for(int j=1;j<=espacios;j++) {//imprimo los espacios
				System.out.print(" ");
			}
			espacios++; //la siguiente vuelta imprimo un espacio mas
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
