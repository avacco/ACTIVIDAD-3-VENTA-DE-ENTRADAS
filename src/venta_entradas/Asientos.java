package venta_entradas;

public class Asientos {
	
	private int asiento;
	private boolean estado;

	public Asientos(int asiento, boolean estado) {
		this.asiento = asiento;
		this.estado = estado;
	}


	public Asientos() {
	}


	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}
