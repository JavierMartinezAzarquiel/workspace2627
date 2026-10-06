package ejercicios;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		 
		Scanner teclado = new Scanner(System.in);
		
		int medidauno, medidados, medidatres;
		System.out.println("Introduce la primera medida");
		medidauno = teclado.nextInt();
		System.out.println("Introduce la segunda medida");
		medidados = teclado.nextInt();
		System.out.println("Introduce la tercera medida");
		medidatres = teclado.nextInt();
		if (medidauno >= medidados + medidatres) {System.out.println("Esto no es un triangulo");}
		else if ((Math.pow(medidauno,2)) == (Math.pow(medidados, 2) + Math.pow(medidatres, 2))) {System.out.println("Esto es un triangulo rectangulo");}
		else if ((Math.pow(medidauno,2)) > (Math.pow(medidados, 2) + Math.pow(medidatres, 2))) {System.out.println("Esto es un triangulo obtusangulo");}
		else if ((Math.pow(medidauno,2)) < (Math.pow(medidados, 2) + Math.pow(medidatres, 2))) {System.out.println("Esto es un triangulo acutangulo");}
		else {System.out.println("Introduce valores validos");}
	}

}
