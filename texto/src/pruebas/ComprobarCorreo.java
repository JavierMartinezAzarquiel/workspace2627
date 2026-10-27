package pruebas;

import java.util.Scanner;

public class ComprobarCorreo {

	public static void main(String[] args) {
		/*
		 * Pedimos que nos ponga el email a un cliente
		 * 
		 * 		Si hay un símbolo @
		 * 		Si delante de la @ hay algo
		 * 		Si detras de la @ hay algo
		 * 		Comprobar que el dominio acaba en .com o .es
		 * 
		 */

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Teclea tu correo electrónico: ");
		String correo = teclado.nextLine();
		
		int lugarArroba = correo.indexOf('@');
		if (lugarArroba == -1) {
			System.out.println("Revisa el correo: no tiene @");
		} else {
			//sabemos que aparece la arroba
			//Ahora deberiamos separar el nombre y el dominio
			String usuario = correo.substring(0,lugarArroba);
			String dominio = correo.substring(lugarArroba + 1);
			if(usuario.length() == 0) {
				System.out.println("Revisa el correo: falta usuario");
			}else if(dominio.length() == 0) {
				System.out.println("Revisa el correo: falta dominio");
			}else if (dominio.endsWith(".es") || dominio.endsWith(".com")) {
				System.out.println("Correo válido");
			}else {
				System.out.println("Revisa el correo: no acaba en .es o .com");
			}
		}
	}

}





