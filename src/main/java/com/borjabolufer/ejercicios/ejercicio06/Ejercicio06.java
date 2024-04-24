package com.borjabolufer.ejercicios.ejercicio06;

import com.borjabolufer.lib.ConsoleMenu;

import java.util.*;

public class Ejercicio06 {
    private Scanner scanner = new Scanner(System.in);
    private final Map<String, String> traductor = new HashMap<>();

    public Ejercicio06() {
        //CREACCION DEL MENU
        ConsoleMenu menuPrincipal = new ConsoleMenu("MENÚ PRINCIAL");
        menuPrincipal.addOpcion("Introducir parejas de palabras.");
        menuPrincipal.addOpcion("Traducir palabras");
        menuPrincipal.addOpcion("Salir de la aplicacion");
        int opcion;
        int numParejas = 0;
        int eleccion;
        String palabraIngles = "";
        String palabraBuscar;
        String palabraValenciano = "";
        do {
            opcion = menuPrincipal.mostrarMenu();
            switch (opcion){
                case 1:
                    System.out.print("¿Cuántas parejas deseas introducir?");
                    numParejas = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numParejas; i++) {
                        System.out.println();
                        System.out.print("Introduce palabra en inglés:");
                        palabraIngles = scanner.nextLine();
                        System.out.print("Introduce palabra en valenciano:");
                        palabraValenciano = scanner.nextLine();
                        traductor.put(palabraIngles, palabraValenciano);
                    }
                    break;
                case 2:
                    System.out.println("Palabra a buscar:");
                    palabraBuscar = scanner.nextLine();
                    System.out.println(traductor.get(palabraBuscar));
                    break;
            }
        }
        while(opcion != 0);

    }
}
