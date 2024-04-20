package com.borjabolufer.ejercicios;

import java.util.*;

public class Ejercicio01 {
    Random rnd;

    public Ejercicio01() {
        rnd = new Random();
        int[] arrayEnteros = new int[10];
        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = rnd.nextInt(51);
        }

        System.out.println(Arrays.toString(arrayEnteros));

        ArrayList<Integer> result = arrayToList(arrayEnteros);
        System.out.println(result.toString());

        List<Integer> resultList = arrayToList2(arrayEnteros);
        System.out.println(resultList);


    }

    public ArrayList<Integer> arrayToList(int[] array) {
        ArrayList<Integer> numeros = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numeros.add(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                numeros.add(array[i]);
            }
        }
        return numeros;
    }

    public List<Integer> arrayToList2(int[] array) {
        ArrayList<Integer> numeros = new ArrayList<>(array.length);

        for (int i = 0; i < array.length; i++) {
            numeros.add(0);
        }

        int indexPares = 0;
        int indexImpares = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numeros.set(indexPares++, array[i]);
            } else {
                numeros.set(indexImpares--, array[i]);
            }
        }
        return numeros;
    }

}