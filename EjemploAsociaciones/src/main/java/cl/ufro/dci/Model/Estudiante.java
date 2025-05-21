package cl.ufro.dci.Model;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String rut;
	private String direccion;
	private String contacto;
	private ArrayList<Curso> cursosInscritos;

	/**
	 *
	 * @param nombre
	 * @param apellido
	 * @param rut
	 */

	public Estudiante(String nombre, String apellido, String rut) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.cursosInscritos = new ArrayList<Curso>();
	}

	public ArrayList<Curso> getCursosInscritos() {
		return this.cursosInscritos;
	}

	/**
	 * 
	 * @param curso
	 */
	public void inscribirCurso(Curso curso) {
		this.cursosInscritos.add(curso);
	}

	/**
	 * 
	 * @param curso
	 */
	public void desinscribirCurso(Curso curso) {
		this.cursosInscritos.remove(curso);
	}
}