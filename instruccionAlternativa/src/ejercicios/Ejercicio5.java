package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		
		
		System.out.println("Introduce el valor que ira en A=");
		a = sc.nextDouble();
		System.out.println("Introduce el valor que ira en B=");
		b = sc.nextDouble();
		System.out.println("Introduce el valor que ira en c=");
		c = sc.nextDouble();
		
		double discriminante = (b * b) - (4 * a * c);
		
		if (discriminante < 0) {
			System.out.println("No existe solucion real");
		}else if (discriminante > 0) {
			System.out.println("El primer resultado es: " + ((-b) + Math.sqrt(discriminante) / (2*a)));
			System.out.println("El segundor resultado es: " + ((-b) - Math.sqrt(discriminante) / (2*a)));
		}else if(discriminante == 0) {
			System.out.println("Solo hay un resultado: " + (-b) / (2*a));
		}
	}

}
