package maximumSubarray;

public class MaxSubArray {
  public int maxSubArray(int[] nums) {
    int pre = 0, max = nums[0];
    for (int x : nums) {
      pre = Math.max(pre + x, x);
      max = Math.max(max, pre);
    }
    return max;
  }
}
