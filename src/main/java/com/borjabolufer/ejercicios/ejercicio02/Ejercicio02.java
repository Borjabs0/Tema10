package com.borjabolufer.ejercicios.ejercicio02;

import java.util.Random;

public class Ejercicio02 {
    private Random random;
    public Ejercicio02() {
        random = new Random();
        ArrayListEstadisticas numeros = new ArrayListEstadisticas();
        for (int i = 0; i < 20; i++) {
            numeros.add(random.nextInt(5));
        }
        System.out.println(numeros);
        metodoAmigo(numeros);
    }
    public void metodoAmigo(IEstatdisticas estadisticas) {
        double maximo = estadisticas.maximo();
        double minimo = estadisticas.minimo();
        double sumatorio = estadisticas.sumatorio();
        double media = estadisticas.media();
        double moda = estadisticas.moda();
        System.out.println();
        System.out.printf("MAXIMO: %.2f\n",maximo);
        System.out.printf("MINIMO: %.2f\n",minimo);
        System.out.printf("LA SUMA DE TODOS LOS ELEMENTOS ES: %.2f\n",sumatorio);
        System.out.printf("LA MEDIA DE TODOS LOS ELEMENTOS ES: %.2f\n",media);
        System.out.printf("LA MODA ES: %.2f\n",moda);
    }
}
