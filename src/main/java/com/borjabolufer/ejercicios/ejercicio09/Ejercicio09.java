package com.borjabolufer.ejercicios.ejercicio09;

import com.borjabolufer.lib.ConsoleMenu;
import com.borjabolufer.lib.LibIO;

import java.util.Scanner;

/**
 * Clase principal del ejercicio 8 que gestiona el diccionario mediante un menú interactivo.
 *
 * @author Borja Bolufer Sala
 * @version 1.0
 * @since 1.0
 */

public class Ejercicio09 {
    private final Diccionario diccionario;
    private final Juego juego;

    /**
     * Constructor que inicializa el diccionario y el menú principal.
     */
    public Ejercicio09() {
        // Inicializamos el diccionario y del juego
        Scanner scanner = new Scanner(System.in);
        this.diccionario = new Diccionario();
        this.juego = new Juego();

        // MENU PRINCIPAL
        ConsoleMenu menuPrincipal = new ConsoleMenu("*  GESTIÓN DICCIONARIO  *");
        menuPrincipal.addOpcion("Añadir palabra");
        menuPrincipal.addOpcion("Modificar palabra");
        menuPrincipal.addOpcion("Eliminar palabra");
        menuPrincipal.addOpcion("Consultar palabara");
        menuPrincipal.addOpcion("Mostrar diccionario");
        menuPrincipal.addOpcion("Jugar");
        menuPrincipal.addOpcion("Mejores puntuaciones");
        menuPrincipal.addOpcion("Salir");
        int opcion;
        String palabra;
        String definicion = "";
        boolean valido;
        int puntos = 0;
        boolean seguirJugando = true;
        String nombre = "";
        do {
            opcion = menuPrincipal.mostrarMenu();
            switch (opcion) {
                case 1:
                    do {
                        palabra = LibIO.solicitarString("Introducé una palabra en el diccionario (o sal con exit): ", 2, 50);
                        valido = diccionario.consultarPalabraBoolean(palabra);
                        if (palabra.equals("exit")) {
                            break;
                        }
                        if (!valido) {
                            definicion = LibIO.solicitarString("Introducé la definicion de la palabra " + palabra + " en el diccionario: ", 2, 60);
                            diccionario.anyadirPalabra(palabra, definicion);
                            System.out.println("La palabra ha sido añadido correctamente en el diccionario");
                        }else {
                            System.err.println("La palabra ya existe en el diccionario.");
                            System.err.println("¡¡Vuelve a intentarlo!!");
                        }
                    } while (valido);
                    break;
                case 2:
                    do {
                        palabra = LibIO.solicitarString("Introducé una palabra para modificar su definicion en el diccionario (o sal con exit): ", 2, 50);
                        if (palabra.equals("exit")) {
                            break;
                        }
                        valido = diccionario.modificarPalabra(palabra, definicion);
                        if (valido) {
                            definicion = LibIO.solicitarString("Introducé una nueva definicion de la palabra " + palabra + " en el diccionario: ", 2, 60);
                            diccionario.modificarPalabra(palabra, definicion);
                        } else {
                            System.err.println("La palabra no existe en el diccionario. Añadela");
                        }
                    } while (valido);
                    break;
                case 3:
                    do {
                        palabra = LibIO.solicitarString("Introducé una palabra para eliminarla del diccionario (o introducé exit para salir): ", 2, 50);
                        if (palabra.equals("exit")) {
                            break;
                        }
                        valido = diccionario.eliminarPalabra(palabra);
                        if (valido) {
                            diccionario.eliminarPalabra(palabra);
                            System.out.println("La palabra y su definicion han sido eliminadas correctamente");
                        } else {
                            System.err.println("La palabra no existe en el diccionario. Añadela");
                        }
                    } while (!valido);
                    break;
                case 4:
                    palabra = LibIO.solicitarString("¿Que palabar quieres consultar? (o si no quieres consultar ninguna palabera introducé exit para salir): ", 2, 50);
                    definicion = diccionario.consultarPalabraString(palabra);
                    if (definicion != null) {
                        System.out.println("La definicion de la palabra " + palabra + " es: " + definicion);
                    } else {
                        System.out.println("La palabra " + palabra + " no se encontró en el diccionario.");
                    }
                    break;
                case 5:
                    System.out.println("DICCIONARIO");
                    diccionario.mostrarDiccionario();
                    break;
                case 6:
                    while (seguirJugando) {
                        definicion = juego.generarDefinicionAleatoria();
                        System.out.println("\nDefinición:");
                        System.out.println(definicion);
                        System.out.print("Introduce tu respuesta: ");
                        String respuesta = scanner.nextLine().toLowerCase();

                        if (respuesta.equals(juego.obtenerPalabraDeDefinicion(definicion).toLowerCase())) {
                            System.out.println("¡Correcto!");
                            puntos++;
                        } else {
                            System.out.println("Incorrecto. La respuesta correcta era: " + juego.obtenerPalabraDeDefinicion(definicion));
                        }

                        System.out.print("¿Quieres seguir jugando? (sí/no): ");
                        String continuar = scanner.nextLine().toLowerCase();
                        if (continuar.equals("si")) {
                            seguirJugando = true;
                        }if (continuar.equals("no")) {
                            seguirJugando = false;
                        }
                    }

                    System.out.println("\nFin del juego.");
                    System.out.println("Tu puntuación final es: " + puntos);

                    if (puntos >= juego.obtenerPuntuacionMinimaTop5()) {
                        System.out.print("¡Has entrado en el top 5! Introduce tu nombre: ");
                        nombre = scanner.nextLine();
                        juego.guardarPuntuacionTop5(nombre, puntos);
                        juego.mostrarMejoresPuntuaciones(nombre);
                    }
                    break;
                case 7:
                    juego.mostrarMejoresPuntuaciones(nombre);
                default:
                    System.err.println("Introducé una opcion correcta");
            }
        } while (opcion != 0);
    }
}
