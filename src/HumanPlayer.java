package src;
import java.util.Scanner;

class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }
    @Override
    public void getName() {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
        //Ask player name
        System.out.print("Ingrese su nombre: ");
        // String input
        this.name= sc.nextLine();
        // Print the values to check if the input was
        // correctly obtained.
        //System.out.println("Tu turno " + this.name + ":");
    }
    @Override
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", ingresa tu suposición: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
}

