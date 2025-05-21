package Agregacion;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellido;
	private String rut;
	private int anioNac;
	private ArrayList<Auto> autos;

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param rut
	 * @param anioNac
	 */
	public Persona(String nombre, String apellido, String rut, int anioNac) {
		this.nombre = nombre;
		this.apellido = apellido;
		// TODO - implement Persona.Persona
		throw new UnsupportedOperationException();
	}

	public void imprimir() {
		// TODO - implement Persona.imprimir
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nuevoAuto
	 */
	public void adquirirAuto(Auto nuevoAuto) {
		autos.add(nuevoAuto);
		// TODO - implement Persona.adquirirAuto
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param autoVendido
	 */
	public void venderAuto(int autoVendido) {
		// TODO - implement Persona.venderAuto
		throw new UnsupportedOperationException();
	}

}