package JavaCollection.ListInterface;

import java.util.Stack;

public class StackExample {
    public static boolean isValidParentheses(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "(a + b) * (c - d)";
        System.out.println("Biểu thức hợp lệ ? " + isValidParentheses(expression)); // true
    }
}
