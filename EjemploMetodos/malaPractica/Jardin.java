package model.malaPractica;

/**
 * Represents a garden with plants that can be watered.
 */
public class Jardin {

    /**
     * Waters a plant if it requires water.
     *
     * @param a the name of the plant
     * @param b determines if the plant needs water
     */
    public void metodo1(String a, Boolean b) {
        if  (b = true) {
            System.out.println("Regando la planta:  " + a);
        } else {
            System.out.println("La planta " + a + " no necesita agua en este momento");
        }
    }
}
