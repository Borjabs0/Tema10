package com.borjabolufer.ejercicios.ejercicio08;

import com.borjabolufer.lib.ConsoleMenu;
/**
 * Clase principal del ejercicio 8 que gestiona el diccionario mediante un menú interactivo.
 *
 * @author Borja Bolufer Sala
 * @version 1.0
 * @since 1.0
 */

public class Ejercicio08 {
    private Diccionario diccionario;

    /**
     * Constructor que inicializa el diccionario y el menú principal.
     */
    public Ejercicio08(){
        // Inicializamos el diccionario
        diccionario = new Diccionario();

        // MENU PRINCIPAL
        ConsoleMenu menuPrincipal = new ConsoleMenu("*  GESTIÓN DICCIONARIO  *");
        menuPrincipal.addOpcion("Añadir palabra");
        menuPrincipal.addOpcion("Modificar palabra");
        menuPrincipal.addOpcion("Eliminar palabra");
        menuPrincipal.addOpcion("Consultar palabara");
        menuPrincipal.addOpcion("Mostrar diccionario");
        menuPrincipal.addOpcion("Salir");
        int opcion = 0;
        do {
            opcion = menuPrincipal.mostrarMenu();
            switch (opcion) {
                case 1:
                    diccionario.anyadirPalabra();
                    break;
                case 2:
                    diccionario.modificarPalabra();
                break;
                case 3:
                    diccionario.eliminarPalabra();
                    break;
                case 4:
                    diccionario.consultarPalabra();
                    break;
                case 5:
                    diccionario.mostrarDiccionario();
                    break;
                default:
                    System.err.println("Introducé una opcion correcta");
            }
        }while (opcion != 0);
    }
}
