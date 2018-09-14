package Ejercicio02;

import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args)
	{
		/*DVD d = new DVD("a", "b", "c", true, "e", "f", 1, "g", "h");
		
		d.imprimir();

		System.out.println("-------------------------------");
		
		DVD d2 = new DVD();
				
		d2.imprimir();
		*/
		ArrayList<Ejemplar> ejemplares = new ArrayList<Ejemplar>();
		
		ejemplares.add(new DVD("1", "Test DVD", "c", true, "e", "f", 1, "g", "h"));
		ejemplares.add(new Libro("2", "Test Libro", "c", true, "e", "f", 1, "g", "h", "r"));
		
		
		for (Ejemplar ejemplar : ejemplares)
		{
			ejemplar.reproducir();
		}		
	}
	
}
