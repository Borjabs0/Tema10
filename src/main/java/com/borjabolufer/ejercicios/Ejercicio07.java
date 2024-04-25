package com.borjabolufer.ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Esta clase implementa un conversor de monedas que permite convertir euros a otras monedas.
 *
 * @author Borja Bolufer Sala
 * @version 1.0
 * @since 1.0
 */
public class Ejercicio07 {
    public Ejercicio07() {
        Scanner scanner = new Scanner(System.in);
        // Creamos un HashMap para almacenar los tipos de cambio
        Map<String, Double> cambioMoneda = new HashMap<>();

        // Inicializamos el HashMap con los tipos de cambio
        System.out.println("Cambio del euro de las siguientes monedas:");
        cambioMoneda.put("USD", 1.07);
        cambioMoneda.put("GBP", 0.86);
        cambioMoneda.put("INR", 89.24);
        cambioMoneda.put("AUD", 1.65);
        cambioMoneda.put("CAD", 1.47);
        cambioMoneda.put("ARS", 936.53);
        cambioMoneda.put("BOB", 7.42);
        cambioMoneda.put("CLP", 1_018.14);
        cambioMoneda.put("VEZ", 38.9657);
        cambioMoneda.put("CRC", 538.66);
        cambioMoneda.put("CUP", 25.72);
        cambioMoneda.put("DOP", 62.96);
        cambioMoneda.put("MXN", 18.47);

        // Solicitamos al usuario la cantidad de euros a convertir.
        System.out.println("Introduce una cantidad de euros a cambiar por otras monedas");
        Double montoEuro = Double.parseDouble(scanner.nextLine());

        // Mostramos el título de la sección de cambio de monedas
        System.out.println("Cambio del euro a las siguientes monedas:");

        // Recorremos el HashMap para realizar las conversiones
        for (Map.Entry<String, Double> conversor : cambioMoneda.entrySet()) {
                // Obtenemos el tipo de cambio de la moneda actual
                Double monedaAConvertir = conversor.getValue();

                // Calculamos el total a convertir en la moneda actual
                double totalCambio = montoEuro * monedaAConvertir;

                // Mostramos el resultado de la conversión
                System.out.println("La conversión de Euros a " +  conversor.getKey() + " es: " + totalCambio);
        }
    }
}