package leetcode.easy.stack;

import java.util.Scanner;
import java.util.Stack;

public class BaseBallGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 7;
        String[] operations = new String[length];

        for (int index=0; index < operations.length; index++) {
            System.out.println("Enter operation: ");
            // Enter the value at each index
            operations[index] = scanner.nextLine();
        }
        int callPoints = callPoints(operations);
        System.out.println("Final Result: " + callPoints);
    }

    public static int callPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (String str : operations) {
            if (str.equals("C")) {
                stack.pop();
            } else if (str.equals("D")) {
                // Get the top element from the stack and multiply by 2 and push it to stack
                stack.push(stack.peek()*2);
            } else if (str.equals("+")) {
                // Scenario: Record a new score that is the sum of the previous two scores

                // remove top element into a variable
                int top = stack.pop();
                // sum removed top element + top element from the stack
                int newTop = top + stack.peek();
                //push both top and newTop to stack
                stack.push(top);
                stack.push(newTop);

            } else {
                // if score is integer, push the value to the stack
                stack.push(Integer.valueOf(str));
            }
        }

        // iterate stack and add score to answer
        for (int score: stack) answer = answer+score;
        return answer;
    }
}
