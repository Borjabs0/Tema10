package com.borjabolufer.ejercicios.ejercicio09;

import com.borjabolufer.lib.LibIO;

import java.util.*;

/**
 * Esta clase representa un juego de adivinar palabras basado en definiciones.
 */
public class Juego {
    private final Random random;
    private final Diccionario diccionario;
    private final List<Integer> puntuaciones;

    /**
     * Constructor de la clase Juego.
     * Inicializa el juego y prepara las estructuras de datos necesarias.
     */
    public Juego() {
        this.random = new Random();
        this.diccionario = new Diccionario();
        this.puntuaciones = new ArrayList<>();
    }

    /**
     * Método que genera una definición aleatoria.
     * @return La definición generada.
     */
    public String generarDefinicionAleatoria() {
        if (diccionario.diccionario.isEmpty()) {
            throw new IllegalStateException("El diccionario está vacío. No se pueden generar definiciones aleatorias.");
        }

        int indiceAleatorio = random.nextInt(diccionario.diccionario.size());
        List<String> claves = new ArrayList<>(diccionario.diccionario.keySet());
        String palabra = claves.get(indiceAleatorio);
        return  diccionario.diccionario.get(palabra);
    }

    /**
     * Método que obtiene la palabra de una definición dada.
     * @param definicion La definición de la cual extraer la palabra.
     * @return La palabra correspondiente a la definición.
     */
    public String obtenerPalabraDeDefinicion(String definicion) {
        return diccionario.consultarPalabra(definicion);
    }

    /**
     * Método que guarda una puntuación en el top 5.
     * @param nombre El nombre del jugador.
     * @param puntos Los puntos obtenidos.
     */
    public void guardarPuntuacionTop5(String nombre, int puntos) {
        puntuaciones.add(puntos);
        Collections.sort(puntuaciones, Collections.reverseOrder());
        // Asegurémonos de que solo mantenemos las 5 mejores puntuaciones
        if (puntuaciones.size() > 5) {
            puntuaciones.remove(5);
        }
        // Aquí podrías guardar el nombre y la puntuación en una estructura de datos para mantener un registro.
    }

    /**
     * Método que muestra las mejores puntuaciones.
     */
    public void mostrarMejoresPuntuaciones(String nombre) {
        System.out.println("Top 5 puntuaciones:");
        for (int i = 0; i < Math.min(5, puntuaciones.size()); i++) {
            System.out.println((i + 1) + ". " + "Borja "+ puntuaciones.get(i) + " puntos");
        }
    }

    /**
     * Método que obtiene la puntuación mínima del top 5.
     * @return La puntuación mínima del top 5.
     */
    public int obtenerPuntuacionMinimaTop5() {
        // Comprobar si hay al menos 5 puntuaciones registradas
        if (puntuaciones.size() >= 5) {
            // Obtener la puntuación mínima del top 5
            return puntuaciones.get(4); // El quinto elemento en una lista ordenada
        } else {
            // Si no hay 5 puntuaciones, el mínimo para entrar es 0
            return 0;
        }
    }
}