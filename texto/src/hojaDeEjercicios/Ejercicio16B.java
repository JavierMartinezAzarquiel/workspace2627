package hojaDeEjercicios;

import java.util.Scanner;


public class Ejercicio16B {
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		
		String palabra;
        int contadorA=0,contadorE=0,contadorI=0,contadorO=0,contadorU=0;
                
        System.out.print("Escribe una palabra:");
        palabra=teclado.nextLine();
        teclado.close();

        for(int i=0;i<palabra.length();i++){
        	
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
           if(contadorA==3 || contadorE==3 || contadorI==3 || contadorO==3 || contadorU==3){
        	   break;
           }

         } 

         if(contadorA==3 || contadorE==3 || contadorI==3 || contadorO==3 || contadorU==3){
           System.out.println("Tiene mas de dos vocales iguales");
         }else{
           System.out.println("NO tiene mas de dos vocales iguales");
         }
    }
}
