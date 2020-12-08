package removeElement;

public class Solution1 {
  public int removeElement(int[] nums, int val) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int n = nums.length;
    int i = 0;
    while (i < n) {
      if (nums[i] == val) {
        nums[i] = nums[n - 1];
        n--;
      } else {
        i++;
      }
    }
    return n;
  }
}
