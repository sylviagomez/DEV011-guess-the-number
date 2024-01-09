package src;
import java.util.ArrayList;
import java.util.List;

abstract class Player {
    protected String name;
    protected List<Integer> guesses;

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }
    // Método abstracto que deben implementar las clases hijas
    public abstract void getName();
    public abstract void makeGuess();
    public List<Integer> getGuesses() {
        return guesses;
    }


}
