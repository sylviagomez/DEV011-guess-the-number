package src;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.LinkedList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class GuessTheNumberTest {
    @Test
    public void testCheckGuess() {
        Random mockRandom = Mockito.mock(Random.class);
        when(mockRandom.nextInt(100)).thenReturn(3);

        // Crear un mock de Player
        Player mockPlayer = Mockito.mock(Player.class);

        // Configurar el comportamiento del mock de Player para getGuesses
        LinkedList<Integer> guesses = new LinkedList<>();
        guesses.add(2);
        guesses.add(3);
        guesses.add(4);
        when(mockPlayer.getGuesses()).thenReturn(guesses);

        GuessTheNumber game = new GuessTheNumber(mockRandom);

        // Crear un jugador y realizar una suposición menor al número objetivo
        mockPlayer.getGuesses().getFirst();
        assertFalse(game.checkGuess(mockPlayer));

        // Crear un jugador y realizar una suposición igual al número objetivo
        mockPlayer.getGuesses().get(1);
        assertTrue(game.checkGuess(mockPlayer));

        // Crear un jugador y realizar una suposición mayor al número objetivo
        mockPlayer.getGuesses().getLast();
        assertFalse(game.checkGuess(mockPlayer));
    }
}