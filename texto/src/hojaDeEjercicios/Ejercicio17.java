package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio17 {
	 public static void main(String[] args){
		   Scanner teclado=new Scanner(System.in);
	       String nombres,notas;
	       String asignatura,nota;

	       
	       System.out.print("Escribe la lista de asignaturas: ");
	       nombres=teclado.nextLine();

	       System.out.print("Escribe la lista de notas: ");
	       notas=teclado.nextLine();
	       teclado.close();
	       
	       StringTokenizer listaNombres=new StringTokenizer(nombres,":");
	       StringTokenizer listaNotas=new StringTokenizer(notas,":");

	       while(listaNombres.hasMoreTokens()){
	          
	    	   asignatura=listaNombres.nextToken();
	    	   nota=listaNotas.nextToken();
	    	   
	          //si la nota es >=5 escribo el nombre de la asignatura
	          if(Integer.parseInt(nota)>=5){
	             System.out.print(asignatura+" ");
	            }

	       }
	    }

}
