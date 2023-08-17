package org.platform.programers.level2;

import java.util.Stack;

public class ValidParentheses {

    boolean solution(String s) {
        if (s.isBlank() || s.isEmpty()) return false;

        Stack<Character> stack = new Stack<>();


        for (char character : s.toCharArray()) {
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else {
                if (stack.isEmpty()) return false;

                Character pop = stack.pop();
                if (character == ')' && pop != '(' || character == ']' && pop != '[' || character == '}' && pop == '{')
                    return false;
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        System.out.println(validParentheses.solution(s));

    }
}
