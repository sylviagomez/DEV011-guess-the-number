package src;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class GuessTheNumber {
    private final int targetNumber;

    public GuessTheNumber() {
        //private static final Random random = new Random();
        //public static final int targetNumber = random.nextInt(100);*/
        Random random = new Random();
        this.targetNumber = random.nextInt(100);
    }

    public void checkGuess(Player player) {
        int guess = player.getGuesses().getLast();
        if (guess < targetNumber) {
            System.out.println(player.name + ", ingresaste: " + player.guesses + ", tú número es más bajo que el objetivo >.<");
        } else if (guess > targetNumber) {
            System.out.println(player.name + ", ingresaste: " + player.guesses + ", tú número es más alto que el objetivo >.<");
        } else {
            System.out.println(player.name + ", ingresaste: " + player.guesses + ". ¡Felicidades lo encontraste! ^.^");
        }
    }

    public void GuessTheNumberGame(List<Player> players) {
        for (Player player : players) {
            player.getName();
        }
        System.out.println("Número objetivo:" + targetNumber);
        int currentPlayerIndex = 0;
        while (true) {
            Player currentPlayer = players.get(currentPlayerIndex);
        // Llamar al método getName() para que el jugador ingrese su nombre y realice alguna acción
        currentPlayer.makeGuess();
        checkGuess(currentPlayer);
        if (currentPlayer.getGuesses().getLast() == targetNumber) {
        System.out.println("Tus intentos:" + currentPlayer.guesses);
        System.out.println("¡" + currentPlayer.name + " ha ganado!");
        break; // Salir del bucle si la suposición es correcta
        }
        // Alternar turno al siguiente jugador
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }

        }

    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        //Lista de jugadores para intercalar turnos
        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer("Player1"));
        players.add(new ComputerPlayer("Player 2"));

        game.GuessTheNumberGame(players);
    }
}



