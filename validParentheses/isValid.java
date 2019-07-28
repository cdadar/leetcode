package validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author chens
 * @date 2019/7/28
 */
class Solution {

    public static boolean isValid(String s) {

        Map<Character, Character> data = new HashMap<>();
        data.put('(', ')');
        data.put('[', ']');
        data.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (data.keySet().contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                int finalI = i;
                Character temp = data.entrySet().stream().filter(entry -> entry.getValue().equals(s.charAt(finalI))).findFirst().map(entry -> entry.getKey()).orElse(null);
                if (stack.isEmpty() || !stack.pop().equals(temp)) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.isValid("{"));
    }
}
