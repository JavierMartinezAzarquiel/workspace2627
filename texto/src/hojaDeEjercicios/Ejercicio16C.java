package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio16C {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        String palabra = c.next().toUpperCase();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < palabra.length(); j++) {

            char letra = palabra.charAt(j);

            switch (letra) {
                case 'A':
                    a++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'U':
                    u++;
                    break;
            }

            if (a > 2 || e > 2 || i > 2 || o > 2 || u > 2) {
                System.out.println("Tiene mas de dos vocales iguales");
                break;
            }
        }
    }
		
	}

