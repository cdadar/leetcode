package isPalindrome;

class Solution {

  public boolean isPalindrome(int x) {
    String str = String.valueOf(x);
    int i = 0, j = str.length() - 1;
    while (i <= j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isPalindrome(121));
  }
}
