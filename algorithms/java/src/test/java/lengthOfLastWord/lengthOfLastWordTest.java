package lengthOfLastWord;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class lengthOfLastWordTest {

  @Test
  void lengthOfLastWord() {
    LengthOfLastWord sln = new LengthOfLastWord();
    Assertions.assertEquals(1, sln.lengthOfLastWord("a"));
    Assertions.assertEquals(5, sln.lengthOfLastWord("Hello World"));
    Assertions.assertEquals(8, sln.lengthOfLastWord("Hello World123"));
    Assertions.assertEquals(5, sln.lengthOfLastWord("Hello World "));
    Assertions.assertEquals(5, sln.lengthOfLastWord("Hello World  "));
    Assertions.assertEquals(0, sln.lengthOfLastWord("   "));
  }
}
