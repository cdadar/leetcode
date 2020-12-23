package implementStrstr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void test_strStr() {
    Solution sln = new Solution();

    // Assertions.assertEquals(2, sln.strStr("hello", "ll"));
    // Assertions.assertEquals(-1, sln.strStr("aaaaa", "bba"));
    Assertions.assertEquals(4, sln.strStr("mississippi", "issip"));
  }
}
