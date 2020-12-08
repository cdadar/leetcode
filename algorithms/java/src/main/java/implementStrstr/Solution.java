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

    int j = 0;
    while (j < haystack.length()) {
      if (haystack.charAt(j) == needle.charAt(0)) {
        int k = 0;
        while (k < needle.length()) {
          if (haystack.charAt(j) == needle.charAt(k)) {
            k++;
            j++;
          }
        }
        return j - k;
      }
      j++;
    }
    return -1;
  }
}
