package src;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class GuessTheNumber {
    private final int targetNumber;

    public GuessTheNumber(Random random) {
        //private static final Random random = new Random();
        //public static final int targetNumber = random.nextInt(100);*/
        this.targetNumber = random.nextInt(100);
    }

    public boolean checkGuess(Player player) {
        int guess = player.getGuesses().getLast();
        if (guess < targetNumber) {
            System.out.println(player.name + ", ingresaste: " + guess + ", tú número es más bajo que el objetivo >.<");
        } else if (guess > targetNumber) {
            System.out.println(player.name + ", ingresaste: " + guess + ", tú número es más alto que el objetivo >.<");
        } else {
            System.out.println(player.name + ", ingresaste: " + guess + ". ¡Felicidades lo encontraste! ^.^");
        return true;
        }
        return false;
    }

    public void PlayersTurn(List<Player> players) {
        for (Player player : players) {
            // Llamar al método getName() para que el jugador ingrese su nombre y realice alguna acción
            player.getName();
        }
        System.out.println("Número objetivo:" + targetNumber);
        int currentPlayerIndex = 0;
        boolean gameOver;
        do {
            Player currentPlayer = players.get(currentPlayerIndex);
            currentPlayer.makeGuess();
            gameOver = checkGuess(currentPlayer);
            if (currentPlayer.getGuesses().getLast() == targetNumber) {
                System.out.println("Tus intentos: " + currentPlayer.guesses);
                System.out.println("Cantidad de intentos: " + currentPlayer.getGuesses().size());
                System.out.println("¡" + currentPlayer.name + " ha ganado!");
            }
            // Alternar turno al siguiente jugador
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        } while (!gameOver) ;
        }

    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber(new Random());
        //Lista de jugadores para intercalar turnos
        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer("Player 1"));
        players.add(new ComputerPlayer("Player 2"));

        game.PlayersTurn(players);
    }
}
