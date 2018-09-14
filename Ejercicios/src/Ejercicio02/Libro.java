package Ejercicio02;

public class Libro extends Prestable {

	public Libro() {
		super();

		System.out.println("Introduce el autor: ");
		autor = s.nextLine();
		System.out.println("Introduce el tema: ");
		tema = s.nextLine();		
		System.out.println("Introduce el editorial: ");
		editorial = s.nextLine();
		

	}
	
	public Libro(String codIdentificacion, String titulo, String fecha, boolean estado, String fPrestado,
			String fDevolucion, int numSocio, String autor, String tema, String editorial) {
		super(codIdentificacion, titulo, fecha, estado, fPrestado, fDevolucion, numSocio);
		this.autor = autor;
		this.tema = tema;
		this.editorial = editorial;
	}

	private String autor;
	private String tema;
	private String editorial;
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Autor: " + autor + "\nTema: " + tema + "\nEditorial: " + editorial);
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo Libro "+ getTitulo());
	}
	
}
