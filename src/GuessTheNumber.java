package src;
import java.util.Random;
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
            System.out.println("Tú número es más bajo que el objetivo >.<");
        } else if (guess > targetNumber) {
            System.out.println("Tú número es más alto que el objetivo >.<");
        } else {
            System.out.println("¡Felicidades lo encontraste! ^.^");
        }
    }

    public void GuessTheNumberGame() {
        // Crear un jugador humano
        Player player = new HumanPlayer("DefaultName");
        // Llamar al método getName() para que el jugador humano ingrese su nombre y realice alguna acción
        player.getName();
        System.out.println("Número objetivo:" + targetNumber);
        while (true) {
            player.makeGuess();
            checkGuess(player);
            if (player.getGuesses().getLast() == targetNumber) {
                break; // Salir del bucle si la suposición es correcta
            }
        }
        System.out.println("Tus intentos:" + player.guesses);
    }


    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        game.GuessTheNumberGame();
    }
}



