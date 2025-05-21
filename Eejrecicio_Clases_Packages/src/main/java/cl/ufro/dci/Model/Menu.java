package cl.ufro.dci.Model;

import java.util.Scanner;

public class Menu {

	private Scanner scanner;

	public void menu() {
		scanner = new Scanner(System.in);
		String opcion = "";

		do {
			opciones();
			System.out.print("-> ");
			opcion = scanner.nextLine();
			switch (opcion) {
				case "0":
					System.out.println("Saliendo...");
					scanner.close();
					System.exit(0);
					break;
				case "1":
					menuIngresarVehiculo();
					break;
				case "2":
					menuRetirarVehiculo();
					break;
				case "3":
					menuMostrarInformacionEstacionamiento();
					break;
				case "4":
					menuMostrarVehiculos();
					break;
				case "5":
					menuMostrarInformacionVehiculo();
					break;
				default:
					System.out.println("Opcion no valida");
					break;
			}

		} while (true);
	}

	public void opciones() {
		System.out.println("\n######## MENU ########\n");
		System.out.println("Seleccione una opcion:");
		System.out.println("    [0] Salir");
		System.out.println("    [1] Ingresar Vehiculo");
		System.out.println("    [2] Retirar Vehiculo");
		System.out.println("    [3] Mostrar Informacion del estacionamiento");
		System.out.println("    [4] Mostar Vehiculos");
		System.out.println("    [5] Mostrar informacion de un vehiculo");
	}

	public void menuIngresarVehiculo() {
		System.out.println("Ingresar Vehiculo");
		/* Implementar */
	}

	public void menuRetirarVehiculo() {
		System.out.println("Retirar Vehiculo");
		/* Implementar */
	}

	public void menuMostrarInformacionEstacionamiento() {
		System.out.println("Mostrar Informacion del estacionamiento");
		/* Implementar */
	}

	public void menuMostrarVehiculos() {
		System.out.println("Mostar Vehiculos");
		/* Implementar */
	}

	public void menuMostrarInformacionVehiculo() {
		System.out.println("Mostrar informacion de un vehiculo");
		/* Implementar */
	}
}
