package Ejercicio02;

public abstract class Compuesto extends NoPrestable{

	public Compuesto() {
		super();
		
		System.out.println("Introduce la fecha de edicion: ");
		fEdicion = s.nextLine();
		System.out.println("Introduce el numero de tomos: ");
		numeroTomos = s.nextInt();
		s.nextLine();

	}
	
	public Compuesto(String codIdentificacion, String titulo, String fecha, String editorial, String fEdicion,
			int numeroTomos) {
		super(codIdentificacion, titulo, fecha, editorial);
		this.fEdicion = fEdicion;
		this.numeroTomos = numeroTomos;
	}

	private String fEdicion;
	private int numeroTomos;
	
	public String getFecha() {
		return fEdicion;
	}

	public void setFecha(String fEdicion) {
		this.fEdicion = fEdicion;
	}

	public int getNumeroTomos() {
		return numeroTomos;
	}

	public void setNumeroTomos(int numeroTomos) {
		this.numeroTomos = numeroTomos;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Fecha Edicion: " + fEdicion + "\nNumeroTomos: " + numeroTomos);
	}
}
