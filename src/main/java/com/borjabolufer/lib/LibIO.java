package com.borjabolufer.lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LibIO {
    private  static  final Scanner scanner = new Scanner(System.in);
    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima){
        String result;
        boolean valido;
        do {
            System.out.println(mensaje);
            result = scanner.nextLine();
            valido = result.length() >= longitudMinima && result.length() <= longitudMaxima;
            if (!valido)
                System.err.printf("La longitud debe estar entre %d y %d \n", longitudMinima, longitudMaxima);

        }while(!valido);
        return result;
    }
    public  static Date solicitarFechaDate(String mensaje, SimpleDateFormat formato){
        Date fecha = null;
        boolean valido;
        do {
            System.out.println(mensaje);
            String fechaStr = scanner.nextLine();
            try {
                fecha = formato.parse(fechaStr);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            valido = fecha != null;
            if (!valido){
                System.out.println("El formato de la fecha no es válido");
            }
        }while (!valido);
        return fecha;
    }
    public static  double solicitarDouble(String mensaje, double valorMinimo, double valorMaximo){
        double result;
        boolean valido;
        do {
            System.out.println(mensaje);
            result = Double.parseDouble(scanner.nextLine());
            valido = result >= valorMinimo && result <= valorMaximo;
            if (!valido)
                System.err.printf("La longitud debe estar entre %d y %d \n", valorMinimo, valorMaximo);

        }while(!valido);
        return result;
    }
    public static  int solicitarInt(String mensaje, int valorMinimo, int valorMaximo){
        int result = 0;
        boolean valido;
        do {
            try {
                System.out.println(mensaje);
                result = Integer.parseInt(scanner.nextLine());
                valido = result >= valorMinimo && result <= valorMaximo;
                if (!valido)
                    System.err.printf("La longitud debe estar entre %d y %d \n", valorMinimo, valorMaximo);

            }catch (NumberFormatException NFE){
                System.out.println("Se ha insertado una letra vuelve a intentarlo");
                valido = false; // Setear válido a falso para continuar el bucle
            }

        }while(!valido);
        return result;
    }
    public static float solicitarFloat(String mensaje, int valorMinimo, int valorMaximo){
        float result = 0;
        boolean valido;
        do {
            try {
                System.out.println(mensaje);
                result = Float.parseFloat(scanner.nextLine());
                valido = result >= valorMinimo && result <= valorMaximo;
                if (!valido) {
                    System.err.printf("La longitud debe estar entre %d y %d \n", valorMinimo, valorMaximo);
                }
            }catch (NumberFormatException NFE){
                System.out.println("Se ha insertado una letra vuelve a intentarlo");
                valido = false;
            }
        }while(!valido);
        return result;
    }
}
