package com.borjabolufer.ejercicios.ejercicio03;

import com.borjabolufer.ejercicios.ejercicio04.ICola;

import java.util.ArrayList;

public class Pila<T> implements IPila<T> {
    private ArrayList<T> datos;

    public Pila(ArrayList<T> datos) {
        this.datos = new ArrayList<>();
    }

    @Override
    public T push(T elemento) {
        datos.add(elemento);
        return elemento;
    }

    @Override
    public T pop() {
        T e = top();
        datos.remove(datos.size() - 1);
        return e;
    }

    @Override
    public int size() {
        return datos.size();
    }

    @Override
    public T top() {
        return datos.get(datos.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return datos.isEmpty();
    }

    @Override
    public String toString() {
        return "Pila{" +
                "datos=" + datos +
                '}';
    }
}
