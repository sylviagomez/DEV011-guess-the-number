package src;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

abstract class Player {
    protected String name;
    public Player(String name) {
        this.name=name;
    }
    // Método abstracto que deben implementar las clases concretas
    public abstract void playerName();
}
    class HumanPlayer extends Player {
        public HumanPlayer(String name) {
            super(name);
        }
        @Override
        public void playerName() {
                // Declare the object and initialize with
                // predefined standard input object
                Scanner sc = new Scanner(System.in);
                //Ask player name
                System.out.print("Ingrese su nombre: ");
                // String input
                this.name= sc.nextLine();
                // Print the values to check if the input was
                // correctly obtained.
                System.out.println("Name: " + this.name);
            }
        }
public class Main {
    public static void main(String[] args) {
        // Crear un jugador humano
        Player player = new HumanPlayer("DefaultName");
        // Llamar al método play() para que el jugador humano ingrese su nombre y realice alguna acción
        player.playerName();
    }
}


