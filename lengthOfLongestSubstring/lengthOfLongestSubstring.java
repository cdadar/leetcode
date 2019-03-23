package lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.Set;

class Solution {

  public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (this.allUnique(s, i, j)) {
          ans = Math.max(ans, j - i);
        }
      }

    }
    return ans;
  }

  private boolean allUnique(String substring, int start, int end) {
    Set set = new HashSet();
    for (int i = start; i < end; i++) {
      Character ch = substring.charAt(i);
      if (set.contains(ch)) {
        return false;
      }
      set.add(ch);
    }
    return true;

  }
}
