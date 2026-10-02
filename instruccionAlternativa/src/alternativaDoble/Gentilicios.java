package alternativaDoble;

import java.util.Scanner;

public class Gentilicios {

	public static void main(String[] args) {
		// Programa que nos pide el nombre de nuestro pueblo y pone el gentilicio
		
		Scanner teclado = new Scanner(System.in);
		
		String pueblo;
		
		System.out.print("Teclea el nombre de tu pueblo: ");
		pueblo = teclado.nextLine();


		switch (pueblo) {
		case "Toledo":
			System.out.println("Toledano/a");
			break;
		case "Navahermosa":
			System.out.println("Navarmoseño/a");
			break;
		case "Mocejón":
			System.out.println("Mocejonero/a");
			break;
		case "Huerta de valdecarábanos":
			System.out.println("Navero/a");
			break;
		default:
			System.out.println("No conozco ese pueblo");
			break;
		}
	}

}
