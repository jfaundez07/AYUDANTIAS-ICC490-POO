package Domain;

import java.util.ArrayList;

/**
 * Class alumno representa a un etudiante de la UFRO
 *
 */
public class Alumno {

	private String nombre;
	private String apellido;
	private int rut;
	private String correo;
	private ArrayList<Integer> notas;

	/**
	 * Constructor de la calse alumno
	 * @param nombre Atributo de tipo string
	 * @param apellido Atributo de tipo string
	 * @param rut Atributo de tipo int
	 * @param correo Atributo de tipo string
	 */
	public Alumno(String nombre, String apellido, int rut, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.correo = correo;
		this.notas = new ArrayList<>();
	}

	/**
	 * Constructor de la calse alumno sin parametros
	 */
	public Alumno() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public ArrayList<Integer> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}

	/**
	 * Metodo que agrega notas al alumno
	 */
	public void addNotas(){
		notas.add(70);
		notas.add(60);
		notas.add(50);
	}

	/**
	 * Metodo que agrega notas al alumno
	 * @param nota Atributo de tipo int
	 */
	public void addNota(int nota){
		notas.add(nota);
	}

	/**
	 * Metodo que calcula el promedio de las notas del alumno
	 * @return Retorna el promedio de las notas del alumno
	 */
	@Override
	public String toString() {
		return "Alumno{" + '\n' +
			"       nombre='" + this.nombre + '\n' +
			"       apellido='" + this.apellido + '\n' +
			"       rut=" + this.rut + '\n' +
			"       correo='" + this.correo + '\n' +
			"       notas=" + this.notas + '\n' +
			'}';
	}

	// ALT + INS
	// ALT + FN + INS
}
