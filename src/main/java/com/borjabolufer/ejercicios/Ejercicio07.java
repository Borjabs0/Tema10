package com.borjabolufer.ejercicios;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio07 {
    public Ejercicio07() {
        Map<String, Double> cambioMoneda = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cantidad de euros a cambiar por otras monedas");
        Double montoEuro = Double.parseDouble(scanner.nextLine());
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

        for (Map.Entry conversor : cambioMoneda.entrySet()) {
            Double monedaAConvertir = (Double) conversor.getValue();
            Double totalCambio = montoEuro * monedaAConvertir;
            System.out.println("La conversion de Euros a " + conversor.getKey() + " és: " + totalCambio);
        }
    }
}