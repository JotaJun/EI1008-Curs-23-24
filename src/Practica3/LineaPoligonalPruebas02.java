package Practica3;  // Indica aquí el nombre del paquete que utilizas.

import Practica2.Punto; // Importa aquí la clase Punto

// ATENCIÓN: Este programa crea una línea poligonal enorme (con cien mil puntos)
// con el objetivo de verificar que la estrategia de redimensionado del vector
// de puntos en el método añadir es la que se indica en el enunciado.
// * Si se ejecuta en un instante, la estrategia es probablemente correcta.
// * Si, por el contrario, tarda mucho tiempo y el ritmo en el que se añaden puntos
//   es cada vez más lento, la estrategia es probablemente incorrecta.
/*
public class LineaPoligonalPruebas02 {

    private static final int LÍMITE = 100000;

    public static void main(String[] args) {
        LineaPoligonal línea = new LineaPoligonal();
        System.out.println("Creada línea poligonal vacía");
        System.out.println("\nAñadiendo puntos a la línea...");
        for (int i = 1; i <= LÍMITE; i++) {
            if (i % 10000 == 0)
                System.out.println("  " + i + " puntos");
            línea.añadir(new Punto(i, i));
        }
        double longitud = línea.longitud();
        double esperado = (LÍMITE - 1) * Math.sqrt(2);
        System.out.println("\nLongitud de la línea: " + longitud);
        if (Math.abs(longitud - esperado) < 1E-3) {
            System.out.println(" --> BIEN");
        } else {
            System.out.println(" --> MAL: Debería ser " + esperado);
        }
    }

}
*/