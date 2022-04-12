package venta_entradas;

import java.time.LocalDate;


public class Ventas {
	
	private LocalDate fechaVenta;
	private Entradas entrada = new Entradas();
	private Clientes cliente = new Clientes();
	

	public Ventas(LocalDate fechaVenta, Entradas entrada, Clientes cliente) {
		this.fechaVenta = fechaVenta;
		this.entrada = entrada;
		this.cliente = cliente;
	}

	public Ventas() {
		
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Entradas getEntrada() {
		return entrada;
	}

	public void setEntrada(Entradas entrada) {
		this.entrada = entrada;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
} 
