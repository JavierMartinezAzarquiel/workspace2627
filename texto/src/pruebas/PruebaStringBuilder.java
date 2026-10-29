package pruebas;

public class PruebaStringBuilder {

	public static void main(String[] args) {
		// como se hacía en String
		String s = "Hola";
		String t = new String("Hola");
		
		//StringBuilder
		StringBuilder sb1 = new StringBuilder("Hola");
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder(50);
		StringBuilder sb4 = new StringBuilder(s);

		//Longitudes
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		System.out.println(sb3.length());
		System.out.println(sb4.length());
		
		//capacidades
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		System.out.println(sb4.capacity());
		
		//añadir con un String
		
		s = s.concat(" que tal");
		System.out.println(s);
		
		sb1.append(" que tal");
		System.out.println(sb1);
	}

}




