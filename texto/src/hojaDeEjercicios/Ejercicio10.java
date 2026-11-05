package hojaDeEjercicios;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Programa que simule el juego del ahorcado. Elegimos una palabra y vamos
			pidiendo letras al usuario. Cada vez mostramos la palabra solo con las letras
			acertadas. Si no acierta todas las letras en 8 intentos, se da el juego por
			perdido.
		 */

		Scanner teclado = new Scanner(System.in);
		
		String secreta;
		StringBuilder aciertos = new StringBuilder();
		char letra;
		int fallos = 0;
		
		//teclear la palabra secreta
		JPasswordField campoContraseña = new JPasswordField();
		JOptionPane.showConfirmDialog(null,campoContraseña, "palabra secreta",JOptionPane.CLOSED_OPTION);
		secreta = String.valueOf(campoContraseña.getPassword());
		//añado tantos guiones como letras tiene la palabra
		for (int i = 0; i < secreta.length(); i++) {
			aciertos.append("-");
		}
		
		System.out.println(aciertos); //mostramos los guiones
		 
		while(fallos<8 && !secreta.equals(aciertos.toString()) ) { //mientra quede palabra por acertar
			//pido una letra
			System.out.print("Teclea una letra: ");
			letra = teclado.nextLine().charAt(0);
			//busco la letra, si no la encuentra, un fallo mas
			if(secreta.indexOf(letra) == -1) {
				fallos++;
			}
			//cambio todas las letras acertadas
			for (int i = 0; i < secreta.length(); i++) {
				if(secreta.charAt(i) == letra) {
					aciertos.setCharAt(i, letra);
				}
			}
			//muestro el resultado de nuevo
			System.out.println(aciertos);
			System.out.println("Tienes " + fallos + " fallos");
		}
		
		if(secreta.equals(aciertos.toString())) {
			System.out.println("Enhorabuena!!!");
		}else {
			System.out.println("Eres un matao");
		}
	}

}



