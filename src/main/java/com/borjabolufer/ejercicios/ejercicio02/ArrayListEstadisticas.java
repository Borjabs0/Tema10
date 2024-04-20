package com.borjabolufer.ejercicios.ejercicio02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ArrayListEstadisticas extends ArrayList<Integer> implements IEstatdisticas {
    private static final int DEFAULT_CAPACITY = 10;


    public ArrayListEstadisticas() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayListEstadisticas(int capacity) {
        super();
    }

    public ArrayListEstadisticas(Collection<Integer> collection) {
        super(collection);
    }

    @Override
    public double minimo() {
        double min = Double.MAX_VALUE;
        for(int i = 0; i < size(); i++) {
            double value = get(i);
            if(value < min) {
                min = value;
            }
        }
        return min;
    }

    @Override
    public double maximo() {
        double max = Double.MIN_VALUE;
        for(int i = 0; i < size(); i++) {
            double value = get(i);
            if(value > max) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public double sumatorio() {
        double sum = 0;
        for(int i = 0; i < size(); i++) {
            double value = get(i);
            sum += value;
        }
        return sum;
    }

    @Override
    public double media() {
        return sumatorio() / size();
    }

    @Override
    public double moda() {
        //ESTRUCTURA HASMAPS
        HashMap<Double, Integer> repeticiones = new HashMap<>();
        int maxReps = 0;
        double valorMasRepetido = get(0);
        for (int i = 0; i < size(); i++) {
            double numero = get(i);
            int valor = 0;
            Integer reps = repeticiones.get(numero);
            if (reps != null)// Si es distinto de null
                valor = reps + 1; // Aumenta el numero de veces que sale ese valor

            if(maxReps < valor) {
                valorMasRepetido = numero;//Valor mas repetido
                maxReps = valor; // Cuantas veces se repite
            }
            repeticiones.put(numero, valor);
        }

        return valorMasRepetido;
    }
}

