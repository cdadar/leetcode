package generateParentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();
        this.generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    private void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (this.valid(current)) {
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            this.generateAll(current, pos + 1, result);
            current[pos] = ')';
            this.generateAll(current, pos + 1, result);
        }

    }

    private boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return (balance == 0);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result = solution.generateParenthesis(4);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
