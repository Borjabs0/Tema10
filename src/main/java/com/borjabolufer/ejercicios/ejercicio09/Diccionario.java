package com.borjabolufer.ejercicios.ejercicio09;

import com.borjabolufer.lib.LibIO;

import java.util.*;

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
    public final Map<String, String> diccionario;
    private final Random random;


    /**
     * Constructor que inicializa el diccionario con algunas palabras y sus definiciones
     */
    public Diccionario() {
        this.diccionario = new HashMap<>();
        this.random = new Random();

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
    public boolean anyadirPalabra(String palabra, String definicion) {
        if (diccionario.containsKey(palabra))
            return false;
        diccionario.put(palabra, definicion);
        return true;
    }

    /**
     * Solicitará la palabra a modificar y si existe pedirá su
     * definición y la modificará
     */
    public boolean modificarPalabra(String palabra, String definicion) {
        if (!diccionario.containsKey(palabra))
            return false;
        diccionario.put(palabra, definicion);
        return true;
    }

    /**
     * Solicitará la palabra a borrar y si existe la borrará
     */
    public boolean eliminarPalabra(String palabra) {
            if (!diccionario.containsKey(palabra)) {
                return false;
            } else {
                diccionario.remove(palabra);
                return true;
            }
    }

    /**
     * Solicitará la palabra a consultar y si existe, mostrará su definición
     */
    public String consultarPalabraString(String palabra) {
        if (diccionario.containsKey(palabra)) {
            return diccionario.get(palabra);
        }
        return null;
    }
        public boolean consultarPalabraBoolean(String palabra) {
            return diccionario.containsKey(palabra);
        }
    public String consultarPalabra(String definicion) {
        for (Map.Entry<String, String> entry : diccionario.entrySet()) {
            if (entry.getValue().equals(definicion)) {
                return entry.getKey();
            }
        }
        return null; // Si no se encuentra la definición, devuelve null
    }

    /**
     * Mostrará todas las palabras y definiciones que hay actualmente en el diccionario
     */
    public void mostrarDiccionario() {
        for (Map.Entry claves : diccionario.entrySet()) {
            System.out.println("\t" + "- " + claves.getKey() + ": " + claves.getValue());
        }
    }
}