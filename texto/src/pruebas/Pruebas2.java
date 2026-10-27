package pruebas;

public class Pruebas2 {

	public static void main(String[] args) {
		// Continuamos probando métodos de String
		
		String frase1= "Hola clase de DAM.";
		String frase2= "Hola clase de DAM";
		
		
		//comparar Strings
		System.out.println("Son iguales: " + frase1.equals(frase2));
		System.out.println("Son iguales sin mirar Mayusculas: " + frase1.equalsIgnoreCase(frase2));
		System.out.println("Comparación: " + frase1.compareTo(frase2));
	
		//Ver si una frase acaba en punto
		System.out.println("La frase acaba en punto: " + frase1.endsWith("."));
		
		//substrings
		System.out.println("Trozo de frase de la posición 3 a la 7: " + frase1.substring(3,7));
		System.out.println("Trozo de frase desde la posición 3: " + frase1.substring(3));
	
		//buscar en una frase
		System.out.println("Buscar la letra <<e>>: " + frase1.indexOf('e'));
		System.out.println("Buscar la palabra <<de>>: " + frase1.indexOf("de"));
		System.out.println("Buscar la última <<e>>: " + frase1.lastIndexOf('e'));
		System.out.println("Buscar la letra <<e>> desde la posicion 13: " + frase1.indexOf('e',13));
	
		//modificar frase
		System.out.println("Convertir a mayusculas: " + frase1.toUpperCase());
		System.out.println("Cambia la <<a>> por la <<e>>: " + frase1.replace('a', 'e'));
		System.out.println("Unir dos frases: " + frase1.concat("Adios"));
	}

}









