package generateParentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        this.backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private void backtrack(List<String> ans, String current, int open, int close, int max) {
        if (current.length() == 2 * max) {
            ans.add(current);
            return;
        }

        if (open < max) {
            this.backtrack(ans, current + "(", open + 1, close, max);
        }
        if (close < open) {
            this.backtrack(ans, current + ")", open, close + 1, max);
        }

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result = solution.generateParenthesis(4);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
