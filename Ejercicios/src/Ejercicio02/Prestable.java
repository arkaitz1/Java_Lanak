package Ejercicio02;

public abstract class Prestable extends Ejemplar{

	public Prestable() {
		super();
	
		System.out.println("Introduce el estado: ");
		estado = s.nextBoolean();
		System.out.println("Introduce la fecha de prestamo: ");
		fPrestado = s.next();
		System.out.println("Introduce la fecha de devolucion: ");
		fDevolucion = s.next();
		System.out.println("Introduce el numero de socio: ");
		numSocio = s.nextInt();
	}
	
	public Prestable(String codIdentificacion, String titulo, String fecha, boolean estado, String fPrestado,
			String fDevolucion, int numSocio) {
		super(codIdentificacion, titulo, fecha);
		this.estado = estado;
		this.fPrestado = fPrestado;
		this.fDevolucion = fDevolucion;
		this.numSocio = numSocio;
	}

	private boolean estado;
	private String fPrestado;
	private String fDevolucion;
	private int numSocio;
	
	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getfPrestado() {
		return fPrestado;
	}

	public void setfPrestado(String fPrestado) {
		this.fPrestado = fPrestado;
	}

	public String getfDevolucion() {
		return fDevolucion;
	}

	public void setfDevolucion(String fDevolucion) {
		this.fDevolucion = fDevolucion;
	}

	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}
	
	@Override
	public void imprimir() 
	{
		super.imprimir();
		System.out.println("Fecha Prestamo: " + fPrestado + "\nFecha Devolucion: " + fDevolucion + "\nNumSocio: " + numSocio);
	}
	
	public void prestar(int numSocio)
	{
		
	}
}