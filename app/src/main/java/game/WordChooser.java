package game;

import java.util.Random;

public class WordChooser {
  static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

  public String getRandomWordFromDictionary() {
    int rnd = new Random().nextInt(DICTIONARY.length);
    return DICTIONARY[rnd];
  }
  public String[] getDictionary() {
    return DICTIONARY;
  }
}



