package Practica3;

import Practica2.Punto;
import java.util.ArrayList;


public class LineaPoligonal {
    private ArrayList<Punto> puntos;
    private int numPuntos;

    public LineaPoligonal(){
        this.puntos = new ArrayList<>();
        this.numPuntos = 0;
    }

    public void añadir(Punto punto){
        puntos.add(punto);
    }

    public void quitar(int pos){
        puntos.remove(pos);
    }

    public void quitar(Punto punto){
        int pos = puntos.indexOf(punto);
        if (pos != -1)
            puntos.remove(pos);
    }


}
