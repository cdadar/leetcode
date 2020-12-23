package removeDuplicatesFromSortedArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void test_removeDuplicates() {
    Solution sln = new Solution();
    Assertions.assertEquals(6, sln.removeDuplicates(new int[] {0, 1, 2, 2, 3, 3, 3, 4, 5, 5}));
  }
}
