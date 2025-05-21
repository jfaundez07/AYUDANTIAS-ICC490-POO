package cl.ufro.dci.Model;

import java.util.ArrayList;

public class Estacionamiento {

	private int capacidad;
	private String ubicacion;
	private String horario;
	private Administrador administrador;
	private ArrayList<Vehiculo> vehiculos;

	public Estacionamiento(int capacidad, String ubicacion, String horario, Administrador administrador) {
		/*
		* Implementar
		* Recuerde instanciar la ArrayList
		*/
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		/*
		* Implementar
		* Recuerde que debe verificar la cantidad de autos antes de ingresar uno nuevo
		*/
	}

	public void eliminarVehiculo(String patente) {
		/* Implementar */
	}

	public void mostrarVehiculos() {
		/* Implementar */
	}

	public void buscarVehiculo(String patente) {
		/* Implementar */
	}



}
