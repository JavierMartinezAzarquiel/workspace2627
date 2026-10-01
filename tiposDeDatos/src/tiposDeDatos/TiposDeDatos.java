package tiposDeDatos;

public class TiposDeDatos {

	public static void main(String[] args) {
		// Estamos probando los tipos de datos
		
		//declaramos una variable. Un lugar donde almacenar un dato
		boolean hayToner;
		
		hayToner = true;  //Asignación de un valor a la variable
		
		//imprimo en pantalla el contenido de la variable hayToner
		System.out.println("La variable hayToner contiene: " + hayToner);

		
		//Tipo de datos con letras
		//char
		char letra;
		
		letra = 'A'; //guardo una letra en la variable
		letra = '\t';  //guardo un carácter tabulador
		letra = '\n';  //letra especial que equivale a intro
		
		String frase;
		
		frase = "Buenos días\t a todos";
		
		System.out.println(frase);
		
		
		
		//Datos numéricos enteros
		byte pequeña;
		short mediana;
		int normal;
		long grande;
		
		pequeña = 120;
		
		mediana = 31849;
		
		grande = 452372823424L;   
		/* ojo con los datos numéricos porque
		 * el siempre piensa que son de tipo int
		 */
		
		//números con decimales
		float pocosDecimales;
		double muchosDecimales;
		
		pocosDecimales = 3.2F;
		muchosDecimales = 3.2;
		
		
		
		
		
		
	}

}
