package src;
import java.util.Random;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        // Crear un jugador humano
        Player player = new HumanPlayer("DefaultName");
        // Llamar al método playerName() para que el jugador humano ingrese su nombre y realice alguna acción
        player.getName();
        player.makeGuess();
    }
}