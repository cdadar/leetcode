package letterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chens
 * @date 5/13/19
 */
class Solution {

  public List<String> letterCombinations(String digits) {
    Map<String, List<String>> dicts = new HashMap<>();
    dicts.put("2", Arrays.asList("a", "b", "c"));
    dicts.put("3", Arrays.asList("d", "e", "f"));
    dicts.put("4", Arrays.asList("g", "h", "i"));
    dicts.put("5", Arrays.asList("j", "k", "l"));
    dicts.put("6", Arrays.asList("m", "n", "o"));
    dicts.put("7", Arrays.asList("p", "q", "r", "s"));
    dicts.put("8", Arrays.asList("t", "u", "v"));
    dicts.put("9", Arrays.asList("w", "x", "y", "z"));

    List<String> ans = new ArrayList<>();

    for (int i = 0; i < digits.length(); i++) {//对每个digits遍历
      int len = ans.size();
      List<String> subStr = dicts.get(String.valueOf(digits.charAt(i)));
      if (len == 0) {
        for (int j = 0; j < subStr.size(); j++) {
          ans.add("" + subStr.get(j));//第一次不用覆盖，直接加
        }
      } else {
        for (int k = 0; k < len; k++) {
          for (int m = 1; m < subStr.size(); m++) {
            ans.add(ans.get(k) + subStr.get(m));//加入除了第一组的其他组合
          }
          ans.set(k, (ans.get(k) + subStr.get(0)));//用第一组组合覆盖之前的低维组合
        }
      }
    }
    return ans;

  }


  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.letterCombinations("23"));
  }
}
