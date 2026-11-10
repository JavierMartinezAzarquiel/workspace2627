package hojaDeEjercicios;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int cifra1,cifra2,cifra3,resultado;
		
		for(int i=100 ; i<=999 ; i++) {
			//dividir el numero en tres cifras separadas
			cifra1 = i/100;
			cifra2 = (i/10)%10;
			cifra3 = i%10;
			//calcular el resultado de las potencias
			resultado = (int) (Math.pow(cifra1, 3) + Math.pow(cifra2, 3) + Math.pow(cifra3, 3));
			//si el resultado es igual al numero original, lo imprimo
			if(resultado == i) {
				System.out.println(i);
			}
		}
		
	}

}
