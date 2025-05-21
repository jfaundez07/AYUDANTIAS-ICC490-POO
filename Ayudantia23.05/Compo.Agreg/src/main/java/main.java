import Agregacion.*;
import Composicion.*;

public class main {
    public static void main(String[] args) {
        Auto auto = new Auto("patente", "modelo", 2020);
        Persona persona = new Persona("nombre", "apellido", "rut", 1990);
        persona.adquirirAuto(auto);

        Circulo circulo = new Circulo(0, 0, 10);

    }
}
