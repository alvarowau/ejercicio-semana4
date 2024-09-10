package org.alvarowau.ejercicio2;

import org.alvarowau.ejercicio2.model.ScoreManager;

public class Ejercicio2 {

    public static void main(String[] args) {
        ScoreManager tablero = new ScoreManager();

        // Añadir varios jugadores al marcador
        tablero.addPlayer("Álvaro", 100);
        tablero.addPlayer("Isabel", 150);
        tablero.addPlayer("Carmen", 200);
        tablero.addPlayer("Lucía", 120);

        // Intentar añadir un jugador que ya existe (no debería cambiar la puntuación de Álvaro)
        tablero.addPlayer("Álvaro", 250);

        // Actualizar las puntuaciones de los jugadores (todas deben cambiar)
        tablero.updateScore("Isabel", 175);
        tablero.updateScore("Carmen", 220);
        tablero.updateScore("Lucía", 130);

        // Intentar actualizar la puntuación de un jugador que no existe
        // (debería mostrar que el jugador no está en el tablero y no se puede cambiar)
        tablero.updateScore("Ana", 100);

        // Consultar la puntuación de algunos jugadores
        tablero.checkScore("Álvaro");    // Debería mostrar 100 (no se actualizó)
        tablero.checkScore("Isabel");
        tablero.checkScore("Carmen");
        tablero.checkScore("Lucía");
        tablero.checkScore("Ana");

        // Imprimir el estado completo del marcador
        tablero.printAllScores();
    }
}
