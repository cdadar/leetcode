package plusOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

  @Test
  void plusOne() {
    PlusOne sln = new PlusOne();
    Assertions.assertArrayEquals(new int[] {4, 3, 2, 0}, sln.plusOne(new int[] {4, 3, 1, 9}));
    Assertions.assertArrayEquals(new int[] {1}, sln.plusOne(new int[] {0}));
    Assertions.assertArrayEquals(new int[] {1, 0}, sln.plusOne(new int[] {9}));
    Assertions.assertArrayEquals(new int[] {4, 3, 2, 2}, sln.plusOne(new int[] {4, 3, 2, 1}));
    Assertions.assertArrayEquals(new int[] {1, 0}, sln.plusOne(new int[] {9}));
  }
}
