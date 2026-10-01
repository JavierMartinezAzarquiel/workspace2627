package tiposDeDatos;

public class Operadores {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 10;
		b = 2;
		
		++a;
		a--;
		
		c = a + b;
		
		System.out.println( c );
		
		
		boolean hayToner, hayPapel, resultado;
		
		hayToner = false;
		hayPapel = true;
		
		resultado = hayToner && hayPapel;
		
		System.out.println("¿Puedo imprimir?: " + resultado );	
				
		
		// operador ||
		
		boolean buenExpediente, familiaNumerosa;
		
		buenExpediente = false;
		familiaNumerosa = true;
		
		resultado = buenExpediente || familiaNumerosa;
		
		System.out.println("Tengo derecho a beca?: " + resultado);
	}

}
