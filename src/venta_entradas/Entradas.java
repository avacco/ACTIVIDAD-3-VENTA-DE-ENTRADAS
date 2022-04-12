package venta_entradas;

import java.time.LocalDate;

public class Entradas {
	
	private int valor;
	private boolean estadoEntrada;
	private LocalDate fechaEvento;
	private String nomEvento;
	private Asientos asiento = new Asientos();
	
	public Entradas() {
		
	}
	
	
	public Entradas(int valor, boolean estadoEntrada, LocalDate fechaEvento, String nomEvento, Asientos asiento) {
		this.valor = valor;
		this.estadoEntrada = estadoEntrada;
		this.fechaEvento = fechaEvento;
		this.nomEvento = nomEvento;
		this.asiento = asiento;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean isEstadoEntrada() {
		return estadoEntrada;
	}
	public void setEstadoEntrada(boolean estadoEntrada) {
		this.estadoEntrada = estadoEntrada;
	}
	public LocalDate getFechaEvento() {
		return fechaEvento;
	}
	public void setFechaEvento(LocalDate fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	public String getNomEvento() {
		return nomEvento;
	}
	public void setNomEvento(String nomEvento) {
		this.nomEvento = nomEvento;
	}

	public Asientos getAsiento() {
		return asiento;
	}


	public void setAsiento(Asientos asiento) {
		this.asiento = asiento;
	}
	

}
