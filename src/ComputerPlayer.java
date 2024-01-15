import java.util.Random;

class ComputerPlayer extends Player {
    private final Random random;
    public ComputerPlayer (String name) {
        super(name);
        this.random = new Random();

    }

    @Override
    public void getName() {
        this.name="Computadora";
    }

    @Override
    public void makeGuess() {
        int guessNumber = random.nextInt(100);
        guesses.add(guessNumber);
    }
}
