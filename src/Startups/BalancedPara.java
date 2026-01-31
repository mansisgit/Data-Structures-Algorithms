package Startups;

import java.util.Stack;

public class BalancedPara {
    public static void main(String[] args) {
        String str = "((({}{{()";
        System.out.println(isBalanced(str));
    }
    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            // opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // closing brackets
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
