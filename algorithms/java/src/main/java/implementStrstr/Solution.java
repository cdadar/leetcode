package implementStrstr;

public class Solution {
  public int strStr(String haystack, String needle) {
    if (needle == null || "".equals(needle)) {
      return 0;
    }

    if (haystack == null || "".equals(haystack)) {
      return -1;
    }
    if (haystack.length() < needle.length()) {
      return -1;
    }

    int j = 0, k = 0;
    while (j < haystack.length()) {
      if (haystack.charAt(j) == needle.charAt(k)) {
        k++;
      } else {
        if (k > 0) {
          j = j - k;
        }
        k = 0;
      }
      if (k == needle.length()) {
        return j - k + 1;
      }
      j++;
    }
    return -1;
  }
}
