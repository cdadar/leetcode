package removeElement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SoletionTest {
  @Test
  void test_removeElement() {
    Solution sln = new Solution();
    int[] nums1 = {3, 2, 2, 3};
    Assertions.assertEquals(2, sln.removeElement(nums1, 3));
    int[] nums2 = {3, 2, 2, 3};
    int len2 = sln.removeElement(nums2, 3);
    Assertions.assertArrayEquals(new int[] {2, 2}, Arrays.copyOf(nums2, len2));
    // Assertions.assertEquals(5, sln.removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
    int[] nums4 = {0, 1, 2, 2, 3, 0, 4, 2};
    int len4 = sln.removeElement(nums4, 2);
    Assertions.assertArrayEquals(new int[] {0, 1, 3, 0, 4}, Arrays.copyOf(nums4, len4));
  }
}
