package com.borjabolufer.ejercicios.ejercicio04;

import java.util.ArrayList;

public class Cola<T> implements ICola<T> {
    ArrayList<T> cola = new ArrayList<T>();

    @Override
    public boolean add(T value) {
        return cola.add(value);
    }

    @Override
    public T remove() {
        if (cola.isEmpty()){
            return null;
        }
        return cola.remove(0);
    }

    @Override
    public int size() {
        return cola.size();
    }

    @Override
    public T peek() {
        if (cola.isEmpty()){
            return null;
        }
        return cola.get(0);
    }

    @Override
    public boolean isEmpty() {
        System.out.println("La cola esta vacia");
        return cola.isEmpty();
    }

    @Override
    public String toString() {
        return "Cola{" +
                "cola=" + cola +
                '}';
    }
}
