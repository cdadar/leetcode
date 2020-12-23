package maximumSubarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxSubArrayTest {

  @Test
  void maxSubArray() {
    MaxSubArray maxSubArray = new MaxSubArray();
    Assertions.assertEquals(6, maxSubArray.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    Assertions.assertEquals(1, maxSubArray.maxSubArray(new int[] {-2, 1}));
    Assertions.assertEquals(1, maxSubArray.maxSubArray(new int[] {1}));
    Assertions.assertEquals(
        7, maxSubArray.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, 1, -5, 4}));
  }
}
