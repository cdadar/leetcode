package maxArea;

/**
 * @author chens
 * @date 4/27/19
 */
class Solution {

  public int maxArea(int[] height) {
    int len = height.length;
    int area = 0;
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        int result = (j - i) * (height[i] > height[j] ? height[j] : height[i]);
        if (area < result) {
          area = result;
        }
      }
    }
    return area;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.printf(String.valueOf(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})));
  }
}