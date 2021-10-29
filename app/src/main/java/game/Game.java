package game;

import java.util.ArrayList;

public class Game {
  // Fields/atttributes
  private String wordToGuess;
  private int remainingAttempts = 10;
  WordChooser wordChooser;
  private ArrayList<Character> guessedLetters = new ArrayList<Character>();

  // Constructor
  public Game(WordChooser wordChooser) {
    this.wordChooser = wordChooser;
    this.wordToGuess = wordChooser.getRandomWordFromDictionary();
  }
  public String getWordToGuess() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < this.wordToGuess.length(); i++) {
      char currentLetter = wordToGuess.charAt(0);
      if (i == 0) {
        builder.append(currentLetter);
      } else {
        builder.append("_");
      }
    }
    return builder.toString();
  }

  public Boolean guessLetter(Character letter) {
    if (this.wordToGuess.indexOf(letter) != -1) {
      guessedLetters.add(letter);
      return true;
    } else {
      remainingAttempts--;
      return false;
    }
  }

  public int getRemainingAttempts() {
    return remainingAttempts;
  }
}
