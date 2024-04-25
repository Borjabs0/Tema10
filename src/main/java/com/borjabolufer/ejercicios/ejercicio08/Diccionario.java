package com.borjabolufer.ejercicios.ejercicio08;

import com.borjabolufer.lib.LibIO;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase implementa un diccionario básico que permite agregar, modificar, eliminar y consultar palabras y sus definiciones.
 *
 * @author Borja Bolufer Sala
 * @version 1.0
 * @since 1.0
 */

public class Diccionario {
    /**
     * Diccionario que almacena las palabras y sus definiciones.
     */
    private Map<String, String> diccionario;

    /**
     * Constructor que inicializa el diccionario con algunas palabras y sus definiciones
     */
    public Diccionario() {
        diccionario = new HashMap<>();
        diccionario.put("Informática", "Conjunto de conocimientos científicos y técnicas que hacen posible el tratamiento automático de la información por medio de computadoras.");
        diccionario.put("Geografía", "Estudio de la superficie terrestre, sus características físicas, climáticas y humanas.");
        diccionario.put("Biología", "Ciencia que se ocupa del estudio de los seres vivos y sus procesos vitales.");
        diccionario.put("Física", "Disciplina que investiga las leyes que rigen el comportamiento de la materia y la energía.");
        diccionario.put("Química", "Estudio de las sustancias, sus propiedades, composición y reacciones.");
        diccionario.put("Literatura", "Conjunto de obras escritas que expresan ideas, emociones y experiencias humanas.");
        diccionario.put("Economía", "Ciencia social que analiza la producción, distribución y consumo de bienes y servicios.");
        diccionario.put("Filosofía", "Reflexión crítica sobre cuestiones fundamentales como la existencia, el conocimiento y la moral.");
        diccionario.put("Psicología", "Estudio científico del comportamiento y los procesos mentales.");
        diccionario.put("Sociología", "Investigación de las relaciones sociales, instituciones y dinámicas de grupos humanos.");
        diccionario.put("Arte", "Manifestación creativa que abarca pintura, música, danza, escultura y otras expresiones culturales.");
    }

    /**
     * Permite agregar una nueva palabra y su definicion en el diccionario
     */
    public void anyadirPalabra() {
        String palabra;
        do {
            palabra = LibIO.solicitarString("Introducé una palabra en el diccionario (o sal con exit): ", 2, 50);
            if (palabra.equals("exit")) {
                break;
            }
            if (diccionario.containsKey(palabra)) {
                System.err.println("La palabra ya existe en el diccionario.");
                System.out.println("¡¡Vuelve a intentarlo!!");
            } else {
                String definicion = LibIO.solicitarString("Introducé la definicion de la palabra " + palabra + " en el diccionario: ", 2, 60);
                diccionario.put(palabra, definicion);
            }
        } while (diccionario.containsKey(palabra));
    }

    /**
     * Solicitará la palabra a modificar y si existe pedirá su
     * definición y la modificará
     */
    public void modificarPalabra() {
        String palabra;
        do {
            palabra = LibIO.solicitarString("Introducé una palabra para modificar su definicion en el diccionario (o sal con exit): ", 2, 50);
            if (palabra.equals("exit")) {
                break;
            }
            if (diccionario.containsKey(palabra)) {
                String definicion = LibIO.solicitarString("Introducé una nueva definicion de la palabra " + palabra + " en el diccionario: ", 2, 60);
                diccionario.put(palabra, definicion);
            }
        } while (!diccionario.containsKey(palabra));
    }

    /**
     * Solicitará la palabra a borrar y si existe la borrará
     */
    public void eliminarPalabra() {
        String palabra;
        do {
            palabra = LibIO.solicitarString("Introducé una palabra para eliminarla del diccionario (o introducé exit para salir): ", 2, 50);
            if (palabra.equals("exit")) {
                return;
            }
            if (diccionario.containsKey(palabra)) {
                diccionario.remove(palabra);
                System.out.println("La palabra y su definicion han sido eliminada del diccionario correctamente");
            } else {
                System.out.println("La palabra introducida no existe en el dicionario: ");
            }
        } while (!diccionario.containsKey(palabra));
    }

    /**
     * Solicitará la palabra a consultar y si existe, mostrará su definición
     */
    public void consultarPalabra() {
        String palabra;
        palabra = LibIO.solicitarString("¿Que palabar quieres consultar? (o si no quieres consultar ninguna palabera introducé exit para salir): ", 2, 50);
        if (palabra.equals("exit")) {
            return;
        }
        if (diccionario.containsKey(palabra)) {
            System.out.println("La definicion de la palabra " + palabra + " es: " + diccionario.get(palabra));
        } else {
            System.out.println("La palabra introducida no existe en el dicionario: ");
        }
    }

    /**
     * Mostrará todas las palabras y definiciones que hay actualmente en el diccionario
     */
    public void mostrarDiccionario() {
        System.out.println("DICCIONARIO");
        for (Map.Entry claves : diccionario.entrySet()) {
            System.out.println("\t" + "- " + claves.getKey() + ": " + claves.getValue());
        }
    }
}