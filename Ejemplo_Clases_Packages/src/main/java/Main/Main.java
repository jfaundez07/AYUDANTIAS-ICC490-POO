package Main;

import Domain.Alumno;

public class Main {
	public static void main(String[] args) {
		Alumno alumnoNuevo = new Alumno("Joaquin", "Faundez", 1234, "j.faundez07@ufromail.cl");
		System.out.println(alumnoNuevo);

		alumnoNuevo.addNotas();
		System.out.println(alumnoNuevo);
	}

}
