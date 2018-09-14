package Ejercicio02;
public abstract class NoPrestable extends Ejemplar{

	public NoPrestable()
	{
		super();
	
		System.out.println("Introduce el editorial: ");
		editorial = s.nextLine();
	}
	
	public NoPrestable(String codIdentificacion, String titulo, String fecha, String editorial) {
		super(codIdentificacion, titulo, fecha);
		this.editorial = editorial;
	}

	private String editorial;
	
	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Fecha Prestamo: " + editorial);
	}
}
