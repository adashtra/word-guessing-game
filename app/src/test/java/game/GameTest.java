package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuessWithRandomWord() {
    WordChooser mockedChooser = mock (WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

    Game game = new Game(mockedChooser);

    assertEquals(game.getWordToGuess(), "D________");
  }
  // @Test public void testGetsWordToGuess() {
  //   WordChooser wordChooser = new WordChooser();
  //   Game game = new Game(wordChooser);
  //   assertEquals(game.getWordToGuess(), "M_____");
  // }
  @Test public void testGetsInitialRemainingAttempts() {
    WordChooser wordChooser = new WordChooser();
    Game game = new Game(wordChooser);
    assertEquals(game.getRemainingAttempts(), 10);
  }
  @Test public void testGuessLetterRightAndDisplayGuessedLetter() {
    WordChooser mockedChooser = mock (WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");

    Game game = new Game(mockedChooser);
    assertEquals(game.guessLetter('K'), true);
  }
  @Test public void testGuessLetterWrong() {
    WordChooser mockedChooser = mock (WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");

    Game game = new Game(mockedChooser);
    assertEquals(game.guessLetter('O'), false);
  }
}