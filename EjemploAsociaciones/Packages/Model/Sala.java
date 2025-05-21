package cl.ufro.dci.Model;

public class Sala {

	private String nombre;
	private String edificio;
	private String pabellon;

	/**
	 *
	 * @param nombre
	 * @param edificio
	 * @param pabellon
	 */
	public Sala(String nombre, String edificio, String pabellon) {
		// TODO - implement Sala.Sala
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getEdificio() {
		return this.edificio;
	}

	public String getPabellon() {
		return this.pabellon;
	}

}