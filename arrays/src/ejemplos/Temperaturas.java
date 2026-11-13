package ejemplos;

import java.util.Iterator;

public class Temperaturas {

	public static void main(String[] args) {
		// Array con temperaturas de la semana
		
		double[] temperaturas = {16, 18, 21.3, 19.4, 18, 17, 19.8};  

		//media de temperatura semanal
		double suma=0 ,media;
		for (int i = 0; i < temperaturas.length; i++) {
			suma += temperaturas[i];
		}
		media = suma / temperaturas.length;		
		System.out.println("La media de temperatura semanal es: " + media);
		
		//averiguar la temperatura máxima de la semana
		double max = Double.MIN_VALUE;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > max) {
				max = temperaturas[i];
			}
		}
		System.out.println("La temperatura máxima es: " + max);
		
		
		//quiero saber que día de la semana fué el mas caluroso
		int diaMaxTemperatura = 0;
		for (int i = 1; i < temperaturas.length; i++) {
			if (temperaturas[i] > temperaturas[diaMaxTemperatura]) {
				diaMaxTemperatura = i;
			}
		}
		String[] diasSemana = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
		System.out.println("El día mas caluroso fué el: "+ diasSemana[diaMaxTemperatura]);
	}

}





