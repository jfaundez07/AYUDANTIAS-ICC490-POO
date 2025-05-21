package cl.ufro.dci.Model;

import java.util.ArrayList;

public class Profesor {

	private String nombre;
	private String apellido;
	private String rut;
	private String direccion;
	private Long contacto;
	private ArrayList<Curso> cursosAsignados;

	/**
	 *
	 * @param nombre
	 * @param apellido
	 * @param rut
	 */
	public Profesor(String nombre, String apellido, String rut) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.cursosAsignados = new ArrayList<Curso>();
	}

	public ArrayList<Curso> getCursosAsignados() {
		return this.cursosAsignados;
	}

	/**
	 * 
	 * @param curso
	 */
	public void asignarCurso(Curso curso) {
		this.cursosAsignados.add(curso);
	}

	/**
	 * 
	 * @param curso
	 */
	public void desasignarCurso(Curso curso) {
		this.cursosAsignados.remove(curso);
	}
}