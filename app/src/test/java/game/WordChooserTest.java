package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordChooserTest {
  @Test public void testDictionary() {
    WordChooser obj = new WordChooser();
    assertEquals(obj.getDictionary()[0], "MAKERS");
  }
}