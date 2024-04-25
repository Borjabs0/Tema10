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
        cambioMoneda.put("USD (Dólar USA)", 1.07);
        cambioMoneda.put("GBP (Libra esterlina)", 0.86);
        cambioMoneda.put("INR (Rupia India)", 88.42);
        cambioMoneda.put("AUD (Dólar Australiano)", 1.57);
        cambioMoneda.put("CAD (Dólar Canadiense)", 1.48);
        cambioMoneda.put("ARS (Peso Argentino)", 116.25);
        cambioMoneda.put("BOB (Boliviano Boliviano)", 8.17);
        cambioMoneda.put("CLP (Peso Chileno)", 872.50);
        cambioMoneda.put("VEZ (Peso Colombiano)", 4_000_000.0);
        cambioMoneda.put("CRC (Colón Costarricense)", 717.50);
        cambioMoneda.put("CUP (Peso Cubano)", 26.50);
        cambioMoneda.put("DOP (Peso Dominicano)", 68.50);
        cambioMoneda.put("MXN (Peso Mexicano)", 24.50);

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
            System.out.println("La conversión de Euros a " + conversor.getKey() + " es: " + totalCambio);
        }
    }
}