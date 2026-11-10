package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args){
        String palabra;
        int contadorA=0,contadorE=0,contadorI=0,contadorO=0,contadorU=0;
        int i=0;

        Scanner teclado=new Scanner(System.in);
        System.out.print("Escribe una palabra:");
        palabra=teclado.nextLine();
        teclado.close();

        while(i<palabra.length() && contadorA!=3 && contadorE!=3 && contadorI!=3 && contadorO!=3 && contadorU!=3){
        	
           switch(Character.toUpperCase(palabra.charAt(i))){
             case 'A':contadorA++;
                      break;
             case 'E':contadorE++;
                      break;
             case 'I':contadorI++;
                      break;
             case 'O':contadorO++;
                      break;
             case 'U':contadorU++;
                      break;
            }

           i++;
         } //fin while

         if(contadorA==3 || contadorE==3 || contadorI==3 || contadorO==3 || contadorU==3){
           System.out.println("Tiene mas de dos vocales iguales");
          }else{
           System.out.println("NO tiene mas de dos vocales iguales");
          }
    }

}
