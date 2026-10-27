package pruebas;

public class Pruebas {

	public static void main(String[] args) {
		
		int i = 7;
		Integer j = 7;
		Integer k = 7;
		
		String frase = "Hola"; //declaración anómala, solo permitida a String
		String frase2 = new String("Hola"); //declaración de objeto estandar
		
		System.out.println( frase == frase2 ); //comparo direcciones de objetos
		System.out.println( frase.equals(frase2)); //comparo contenido
		
		//calcular el tamaño del String
		System.out.println("El tamaño del String es: " + frase.length());
		
		//sacar una letra del String
		System.out.println("La letra de la posición 2 es: " + frase.charAt(2));
		
		//sacar la última letra de la frase
		System.out.println("La última letra es: " + frase.charAt( frase.length()-1) );

	
	}

}
