package org.alvarowau.ejercicio2.model;

import java.util.HashMap;
import java.util.Map;

public class ScoreManager {

    private final Map<String, Integer> scoreboard;

    public ScoreManager() {
        scoreboard = new HashMap<>();
    }

    /**
     * Utiliza putIfAbsent para añadir un jugador solo si no está presente en el marcador.
     * Si el jugador ya existe, no se añade una nueva entrada.
     */
    public void addPlayer(String playerName, int score) {
        Integer existingScore = scoreboard.putIfAbsent(playerName, score);
        if (existingScore == null) {
            System.out.println("Jugador agregado: " + playerName + " con puntuación: " + score);
        } else {
            System.out.println("El jugador " + playerName + " ya existe con una puntuación de: " + existingScore);
        }
    }

    /**
     * Actualiza la puntuación de un jugador si este ya existe en el marcador.
     * Si el jugador no está presente, no se realiza ninguna acción.
     */
    public void updateScore(String playerName, int newScore) {
        if (scoreboard.containsKey(playerName)) {
            scoreboard.put(playerName, newScore);
            System.out.println("Puntuación actualizada para " + playerName + ": " + newScore);
        } else {
            System.out.println("El jugador " + playerName + " no está en el marcador.");
        }
    }

    /**
     * Consulta la puntuación de un jugador.
     * Si el jugador no está presente en el marcador, se muestra un mensaje indicando que no se encuentra.
     */
    public void checkScore(String playerName) {
        Integer score = scoreboard.get(playerName);
        if (score != null) {
            System.out.println("La puntuación de " + playerName + " es: " + score);
        } else {
            System.out.println("El jugador " + playerName + " no está en el marcador.");
        }
    }

    /**
     * Imprime todas las puntuaciones en el marcador.
     * Si el marcador está vacío, se muestra un mensaje indicando que está vacío.
     */
    public void printAllScores() {
        if (scoreboard.isEmpty()) {
            System.out.println("El tablero está vacío.");
        } else {
            System.out.println("Puntuaciones en el marcador:");
            for (Map.Entry<String, Integer> entry : scoreboard.entrySet()) {
                System.out.println("Jugador: " + entry.getKey() + ", Puntuación: " + entry.getValue());
            }
        }
    }
}
