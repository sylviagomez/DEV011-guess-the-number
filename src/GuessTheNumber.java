package src;
import java.util.Random;
public class GuessTheNumber {
    //private static final Random random = new Random();
    //public static final int targetNumber = random.nextInt(100);
    private final Random random;
    private final int targetNumber;
    public GuessTheNumber () {
        this.random = new Random();
        this.targetNumber = random.nextInt(100);
    }
    private boolean checkGuess (){
        int guess = Player.makeGuess();
        if (guess < GuessTheNumber.targetNumber) {
            System.out.println("Tú número es muy bajo >.<");
        } else if (guess > GuessTheNumber.targetNumber){
            System.out.println("Tú número es muy alto >.<");
        } else {
            System.out.println("¡Felicidades, lo encontraste! ^.^");
        }
    }
public void GuessTheNumberGame (){
        // Crear un jugador humano
        Player player = new HumanPlayer("DefaultName");
        // Llamar al método getName() para que el jugador humano ingrese su nombre y realice alguna acción
        player.getName();
        player.makeGuess();
        System.out.println("Número objetivo:" + targetNumber);
}
    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        game.GuessTheNumberGame();
    }
}

