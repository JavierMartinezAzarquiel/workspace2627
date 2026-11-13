package ejemplos;

public class Notas {

	public static void main(String[] args) {
		/*
		 * Trabajamos con un array de notas y
		 * otro con los nombres de los módulos
		 */
		
		//arrays de notas
		int[] notas = {8, 5, 3, 5, 2, 9, 7};
		String[] modulos = {"Entornos", "Programación", "BBDD", "IPE", "Lenguaje Marcas", "Sistemas", "Inglés"};

		//Listado de módulos aprobados
		System.out.println("Listado de módulos aprobados");
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] >= 5) {
				System.out.println(modulos[i]);
			}
		}
	}

}
