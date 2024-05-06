package Practica3;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class ListaCadenasEnlaceSimple implements ListaCadenas{

    private static class Nodo{
        String dato;
        Nodo sig;

        Nodo(String dato, Nodo sig){
            this.dato = dato;
            this.sig = sig;
        }
    }

    private Nodo first;
    private int talla;


    @Override
    public boolean add(String s) {
        if (first == null) {
            first = new Nodo(s, null);
            talla += 1;
            return true;
        }
        else {
            Nodo aux = first;
            while(aux.sig != null){
                aux = aux.sig;
            }
            aux.sig = new Nodo(s, null);
            talla += 1;
            return true;
        }
    }

    @Override
    public void add(int i, String s) {
        if(i < 0 || i > talla)
            throw new IndexOutOfBoundsException("El índice no es válido");
        Nodo nuevo = new Nodo(s,null);

        if(i == 0){
            nuevo.sig = first;
            first = nuevo;
        }
        else {
            Nodo aux = first;
            for (int j = 0; j < i - 1; j++){
                aux = aux.sig;
            }
            nuevo.sig = aux.sig;
            aux.sig = nuevo;
        }
        talla += 1;

    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public String get(int i) {
        if(i < 0 || i >= talla)
            throw new IndexOutOfBoundsException("El índice no es válido");

        Nodo aux = first;
        for (int j = 0; j < i - 1; j++){
            aux = aux.sig;
        }
        return aux.dato;
    }

    @Override
    public int indexOf(String s) {
        Nodo aux = first;
        int cont = 0;
        while (aux.sig != null) {
            aux = aux.sig;
            if(aux.dato.equals(s))
                return cont;
            cont += 1;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String s) {
        Nodo aux = first;
        int cont = -1;
        for (int i = 0; i < talla - 1; i++){
            if (aux.sig.equals(s))
                cont = i;
        }
        return cont;
    }

    @Override
    public boolean isEmpty() {
        if (first == null)
            return true;
        return false;
    }

    @Override
    public String remove(int i) {
        if (i < 0 || i >= talla)
            throw new IndexOutOfBoundsException("Posición inválida");
        Nodo aux = first;
        if (i == 0) {
            first = first.sig;
            return aux.dato;
        }
        for(int j = 0; j < i; j++){
            aux = aux.sig;
        }
        String sol = aux.sig.dato;
        aux.sig = aux.sig.sig;
        talla -= 1;
        return sol;
    }

    @Override
    public boolean remove(String s) {

        return false;

    }

    @Override
    public String set(int i, String s) {
        return null;

    }

    @Override
    public int size() {
        return 0;
    }
}
