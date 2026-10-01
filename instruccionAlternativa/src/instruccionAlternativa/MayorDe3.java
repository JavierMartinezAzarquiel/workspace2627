package instruccionAlternativa;

import java.util.Scanner;

public class MayorDe3 {

	public static void main(String[] args) {
		// Pedimos 3 número y mostramos el mayor

		Scanner teclado = new Scanner(System.in);
		
		//pedimos los números
		System.out.print("Teclea un número: ");
		int numero1 = teclado.nextInt();
		System.out.print("Teclea otro número: ");
		int numero2 = teclado.nextInt();
		System.out.print("Teclea otro número: ");
		int numero3 = teclado.nextInt();
		
		if (numero1 >= numero2 && numero2 >= numero3) {System.out.print("El mayor es: "+numero1);} 
		else if (numero1 <= numero2 && numero2 >= numero3) {System.out.print("El mayor es: "+numero2);}
		else if (numero1 <= numero2 && numero2 <= numero3) {System.out.print("El mayor es: "+numero3);}
		else if (numero1 == numero2 && numero2 == numero3) {System.out.print("es el mismo numero");}
	}

}
