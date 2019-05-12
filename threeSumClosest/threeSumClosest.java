package threeSumClosest;

import java.util.Arrays;

/**
 * @author chens
 * @date 5/12/19
 */
class Solution {

  public int threeSumClosest(int[] nums, int target) {
    // 排序
    Arrays.sort(nums);
    int closestNum = nums[0] + nums[1] + nums[2];
    for (int c = 0; c < nums.length - 2; c++) {
      int i = c + 1, j = nums.length - 1;
      while (i < j) {
        int threeSum = nums[i] + nums[j] + nums[c];
        if (Math.abs(threeSum - target) < Math.abs(closestNum - target)) {
          closestNum = threeSum;
        }
        if (threeSum > target) {
          j--;
        } else if (threeSum < target) {
          i++;
        } else {
          // 如果已经等于target的话, 肯定是最接近的
          return target;
        }

      }

    }

    return closestNum;
  }
}
