package Ejercicio02;

public class DVD extends Prestable{

	public DVD() {
		super();
		System.out.println("Introduce el interpretes: ");
		interpretes = s.nextLine();
		System.out.println("Introduce la productora: ");
		productora = s.nextLine();		
	}
	
	
	public DVD(String codIdentificacion, String titulo, String fecha, boolean estado, String fPrestado,
			String fDevolucion, int numSocio, String interpretes, String productora) {
		super(codIdentificacion, titulo, fecha, estado, fPrestado, fDevolucion, numSocio);
		this.interpretes = interpretes;
		this.productora = productora;
	}
	
	private String interpretes;
	private String productora;
	
	public String getInterpretes() {
		return interpretes;
	}
	
	public void setInterpretes(String interpretes) {
		this.interpretes = interpretes;
	}
	
	public String getProductora() {
		return productora;
	}
	
	public void setProductora(String productora) {
		this.productora = productora;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Interpretes: " + interpretes + "\nProductora: " + productora);
	}


	@Override
	public void reproducir() {
		System.out.println("Reproduciendo DVD "+getTitulo());
		
	}

}
