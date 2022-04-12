package venta_entradas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Consola {
	static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Ventas> ventas = new ArrayList<Ventas>();
	private static ArrayList<Asientos> asientos = new ArrayList<Asientos>();
	
	// constantes para el menu
		public final static int OPCION_MENU_COMPRAR_TICKET = 1;
		public final static int OPCION_MENU_VER_VENTAS= 2;
		public final static int OPCION_MENU_ENTRADAS_DISPONIBLES = 3;
		public final static int OPCION_MENU_VER_RECAUDACIONES = 4;
		public final static int OPCION_MENU_SALIR = 0;
	

	public static void main(String[] args) {
		
		inicializar();		
		menu();
	}

	private static void inicializar() {

		for (int i = 1; i <= 30; i++) {
			Asientos asiento = new Asientos(i, true);
			asientos.add(asiento);
		}
		
	}

	//MENU
//////////////////////////////////////////////
	private static void menu() {
		int opcion;		
		
		do {
			opcion = opcionMenu();
			System.out.printf("Ha seleccionado la opcion %d \n \n", opcion);		
			switch(opcion) {
				case OPCION_MENU_COMPRAR_TICKET:
					comprarTicket();
					break;
				case OPCION_MENU_VER_VENTAS:
					verEntradasVendidas();
					break;
				case OPCION_MENU_ENTRADAS_DISPONIBLES:
					verEntradasDisponibles();
					break;
				case OPCION_MENU_VER_RECAUDACIONES:
					verRecaudaciones();
					break;
				case OPCION_MENU_SALIR:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion escogida no valida. Vuelva a intentarlo");
					break;
			}
		}while(opcion!= OPCION_MENU_SALIR);
		
	}
	
	private static int opcionMenu() {
		System.out.println("SISTEMA ENTRADAS:\n");
		System.out.println("1. COMPRAR TICKET");
		System.out.println("2. VER VENTAS");
		System.out.println("3. ENTRADAS DISPONIBLES");
		System.out.println("4. VER RECAUDACIONES");
		System.out.println("0. Salir \n");

		System.out.println("Seleccione una opcion del 1 al 4. Seleccione 0 para salir.");

		int opcionSeleccionada = scanner.nextInt(); 
		return opcionSeleccionada;
	}
//////////////////////////////////////////////
	
	//VER RECAUDACIONES
///////////////////////////////////////////////
	private static void verRecaudaciones() {
		int valorTotal = 0;
		
		for (Ventas venta : ventas) {
			valorTotal += venta.getEntrada().getValor();
		}
		System.out.println("Recaudaciones: "+valorTotal);
		
	}
///////////////////////////////////////////////
	private static void verEntradasDisponibles() {
		int entradasDisponibles = 30;
		for (Asientos asiento : asientos) {
			if(asiento.isEstado() == false){
			entradasDisponibles--;
			}
		}
		System.out.println("Entradas disponibles:"+ entradasDisponibles);
		
	}
	//VER ENTRADAS VENDIDAS
///////////////////////////////////////////////
	private static void verEntradasVendidas() {
		
		System.out.println("Nombre Evento | Valor Entrada | Fecha del evento | Nombre del Cliente | Numero de Asiento");
		System.out.println("-----------------------------------------------------------------------------------------\n");

		for (Ventas listaVenta : ventas) {
			
			System.out.print(listaVenta.getEntrada().getNomEvento()+"|");
			System.out.print(" "+listaVenta.getEntrada().getValor()+"|");
			System.out.print(" "+listaVenta.getEntrada().getFechaEvento()+"|");
			System.out.print(" "+listaVenta.getCliente().getNombre()+" "+listaVenta.getCliente().getApellido()+"|");
			System.out.print(" "+listaVenta.getEntrada().getAsiento().getAsiento()+"|\n");
		}
		
		
	}
///////////////////////////////////////////////
	// COMPRAR TICKET
///////////////////////////////////////////////
	private static void comprarTicket() {
		
		// CREACION DE CLIENTE
		scanner.nextLine();
		System.out.println("Ingrese nombre del cliente");
		String nombreCliente = scanner.nextLine();
		
		System.out.println("Ingrese apellido del cliente");
		String apellidoCliente = scanner.nextLine();
		
		System.out.println("Ingrese RUT del cliente");
		String rutCliente = scanner.nextLine();
		
		Clientes cliente = new Clientes(rutCliente,nombreCliente,apellidoCliente);
		
		// CREACION DE VENTA PARA EL CLIENTE
		LocalDate fecha = LocalDate.now();

		final String NOMBRE_EVENTO = "Pelicula";
		final int VALOR_EVENTO = 500;
		final LocalDate fechaEvento = LocalDate.of(2022, 5, 1);
		boolean estadoEntrada = false;
		
		for (Asientos asiento : asientos) {
			if (asiento.isEstado() == true) {
				asiento.setEstado(false);
				Entradas entrada = new Entradas(VALOR_EVENTO,estadoEntrada,fechaEvento,NOMBRE_EVENTO,asiento);
				Ventas venta = new Ventas(fecha,entrada,cliente);
				ventas.add(venta);
				
				break;
			}
		}
		

		
	}
}
