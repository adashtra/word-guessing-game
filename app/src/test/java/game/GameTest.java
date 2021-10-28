package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    WordChooser wordChooser = new WordChooser();
    Game game = new Game(wordChooser);
    assertEquals(game.getWordToGuess(), "M_____");
  }
  @Test public void testGetsInitialRemainingAttempts() {
    WordChooser wordChooser = new WordChooser();
    Game game = new Game(wordChooser);
    assertEquals(game.getRemainingAttempts(), 10);
  }
}