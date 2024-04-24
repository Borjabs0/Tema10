//package com.borjabolufer.ejercicios.ejercicio06;
//
//import java.security.Key;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Traductor {
//    private final Map<String, String> traductor;
//    private final Scanner scanner;
//    public Traductor() {
//        this.traductor  = new HashMap<>();
//        this.scanner = new Scanner(System.in);
//    }
//    public void traduccirValenciano(){
//        int numParejas;
//        String palabraIngles;
//        String palabraValenciano;
//        System.out.print("¿Cuántas parejas deseas introducir?");
//        numParejas = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < numParejas; i++) {
//            System.out.println();
//            System.out.print("Introduce palabra en inglés:");
//            palabraIngles = scanner.nextLine();
//            System.out.print("Introduce palabra en valenciano:");
//            palabraValenciano = scanner.nextLine();
//            traductor.put(palabraIngles, palabraValenciano);
//        }
//    }
//}