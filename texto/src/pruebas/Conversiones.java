package pruebas;

public class Conversiones {

	public static void main(String[] args) {
		// Convertir cualquier dato en String o viceversa.
		
		int valor = 45373;
		String texto;
		
		//convertir un entero en un String
		texto = String.valueOf(valor);
		
		System.out.println("El numero tiene " + texto.length() + " cifras");
		System.out.println("Las centenas son: " + texto.charAt(texto.length()-3) );

		
		//convertir un texto en dato primitivo
		double dato;
		dato = Double.parseDouble(texto);
		System.out.println(dato);
		
		
		//para entero
		int datoInt;
		datoInt = Integer.parseInt(texto);
		
	}

}


