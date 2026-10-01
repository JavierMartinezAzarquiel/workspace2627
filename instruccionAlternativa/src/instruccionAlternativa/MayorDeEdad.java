package instruccionAlternativa;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		//Probar como hacer una instrucción de control(alternativa)

		/*
		 *  Alternativa simple
		 * 
		 *  if(condicion){
		 *  	intrucciones;
		 *  }
		 * 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		//pedimos la edad
		System.out.print("Teclea tu edad: ");
		int edad = teclado.nextInt();
		
//		if ( edad >= 18 ) {
//			System.out.println("Enhorabuena, ya puedes votar");
//		}
		
		/*
		 *  Alternativa doble
		 * 
		 *  if(condicion){
		 *  	intrucciones;
		 *  }else {
		 *  	instrucciones;
		 *  }
		 */
		
		if (edad >= 18) {
			System.out.println("Enhorabuena, ya puedes votar");
		} else {
			System.out.println("Te fastidias");
		}
		
	}
	

}
