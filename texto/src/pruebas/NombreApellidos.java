package pruebas;

import java.util.Scanner;

public class NombreApellidos {

	public static void main(String[] args) {
		/*
		 * Tecleamos nuestro nombre completo y debemos descomponerlo
		 * en 	Nombre:
		 * 		Primer Apellido:
		 * 		Segundo Apellido:
		 */

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Teclea tu nombre completo: ");
		String frase = teclado.nextLine();
		
		String nombre, primerApellido, segundoApellido;
		int lugarPrimerEspacio, lugarSegundoEspacio;
		
		//Elimino los espacios al principio o al final
		frase = frase.trim();
		
		//busco el primer espacio
		lugarPrimerEspacio = frase.indexOf(' ');
		//rescato el nombre
		nombre = frase.substring(0, lugarPrimerEspacio);
		//busco el segundo espacio
		lugarSegundoEspacio = frase.indexOf(' ', lugarPrimerEspacio+1);
		lugarSegundoEspacio = frase.lastIndexOf(' ');
		
		//rescata el primer apellido
		primerApellido = frase.substring(lugarPrimerEspacio+1, lugarSegundoEspacio);
		//rescata el segundo apellido
		segundoApellido = frase.substring(lugarSegundoEspacio+1);
		
		//Mostramos resultado
		System.out.println("Nombre: " + nombre);
		System.out.println("Primer apellido: " + primerApellido);
		System.out.println("Segundo apellido: " + segundoApellido);
	}

}





