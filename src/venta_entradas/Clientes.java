package venta_entradas;

public class Clientes {
	
	private String rut;
	private String nombre;
	private String apellido;
	
	public Clientes() {
		
	}
	
	public Clientes(String rut, String nombre, String apellido) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
