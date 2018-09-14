package Ejercicio02;

import java.util.Scanner;

public abstract class Ejemplar {
	
	private String codIdentificacion;
	private String titulo;
	private String fecha;
	protected Scanner s;
	
	public Ejemplar() {
		
		s = new Scanner(System.in);		
		System.out.println("Introduce el Codigo: ");
		codIdentificacion = s.nextLine();
		System.out.println("Introduce el titulo: ");
		titulo = s.nextLine();
		System.out.println("Introduce la fecha: ");
		fecha = s.nextLine();
		
	}
	
	public Ejemplar(String codIdentificacion, String titulo, String fecha) {
		this.codIdentificacion = codIdentificacion;
		this.titulo = titulo;
		this.fecha = fecha;
	}

	public String getCodIdentificacion() {
		return codIdentificacion;
	}

	public void setCodIdentificacion(String codIdentificacion) {
		this.codIdentificacion = codIdentificacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void imprimir()
	{
		System.out.println("Identificacion: " + codIdentificacion + "\nTitulo: " + titulo + "\nFecha: " + fecha);
	}
	
	public abstract void reproducir();
}
