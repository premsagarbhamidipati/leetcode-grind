package leetcode.easy.stack;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


// Time: O(n)
// Space: O(n)
public class ValidParentheses {
    private static final Map<Character, Character> map = Map.of('(',')','{','}','[',']');
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str = scanner.next();

        boolean callPoints = isValid(str);
        System.out.println("Valid Parentheses: " + callPoints);
    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if (map.get(open) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
