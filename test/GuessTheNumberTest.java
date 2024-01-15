import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class GuessTheNumberTest {
    @Test
    public void testCheckGuess() {
        Random mockRandom = Mockito.mock(Random.class);
        when(mockRandom.nextInt(100)).thenReturn(3);
        // Crear un mock de Player
        Player mockPlayer1 = Mockito.mock(Player.class);

        // Configurar el comportamiento del mock de Player para getGuesses
        ArrayList<Integer> guesses1 = new ArrayList<>();
        guesses1.add(2);
        when(mockPlayer1.getGuesses()).thenReturn(guesses1);

        Player mockPlayer2 = Mockito.mock(Player.class);

        ArrayList<Integer> guesses2 = new ArrayList<>();
        guesses2.add(3);
        when(mockPlayer2.getGuesses()).thenReturn(guesses2);

        Player mockPlayer3 = Mockito.mock(Player.class);

        ArrayList<Integer> guesses3 = new ArrayList<>();
        guesses3.add(4);
        when(mockPlayer3.getGuesses()).thenReturn(guesses3);

        GuessTheNumber game = new GuessTheNumber(mockRandom);
        // Crear un jugador y realizar una suposición menor al número objetivo
        assertFalse(game.checkGuess(mockPlayer1));
        // Crear un jugador y realizar una suposición igual al número objetivo
        assertTrue(game.checkGuess(mockPlayer2));
        // Crear un jugador y realizar una suposición mayor al número objetivo
        assertFalse(game.checkGuess(mockPlayer3));
    }
}