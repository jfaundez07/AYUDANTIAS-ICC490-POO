package model.buenaPractica;

/**
 * Represents a garden with plants that can be watered.
 */
public class Jardin {

    /**
     * Waters a plant if it requires water.
     *
     * @param planta the name of the plant
     * @param requiereAgua determines if the plant needs water
     */
    public void regarPlanta(String planta, Boolean requiereAgua) {

        if (requiereAgua) {                       /* Si requiereAgua es verdadero (true) entra en el condicional if */
            System.out.println("Regando la planta:  " + planta);

        } else {                                            /*  Si requiereAgua no es verdadero (es decir, es falso), entra en el condicional else */
            System.out.println("La planta " + planta + " no necesita agua en este momento");
        }

    }


}
