package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int numero1,numero2,factor=2,mcm=1;
		
		System.out.print("Teclea un numero:");
		numero1 = teclado.nextInt();
		System.out.print("Teclea otro numero:");
		numero2 = teclado.nextInt();

		while(numero1!=1 || numero2!=1) {
			//comprobamos si algun numero es divisible entre factor
			if(numero1%factor==0 || numero2%factor==0) {
				if(numero1%factor==0) {
					numero1 = numero1 / factor;
				}
				if(numero2%factor==0) {
					numero2 = numero2 / factor;
				}
				mcm = mcm * factor;  //añadir factor al mcm
			}else {
				factor++;
			}
			
		}
		
		System.out.println("mcm = "+mcm);
	}

}
