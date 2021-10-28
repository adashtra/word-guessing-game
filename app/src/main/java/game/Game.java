package game;

public class Game {
  // Fields/atttributes
  String wordToGuess;
  int remainingAttempts = 10;
  WordChooser wordChooser;

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

  public int getRemainingAttempts() {
    return remainingAttempts;
  }
}
