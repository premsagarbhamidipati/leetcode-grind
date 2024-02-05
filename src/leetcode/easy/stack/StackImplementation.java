package leetcode.easy.stack;

import java.util.Stack;

public class StackImplementation {

    public static void main(String[] args) {
        Stack<String> stkStr = new Stack<>();


        stkStr.push("Minecraft");
        stkStr.push("Skyrim");
        stkStr.push("FFVII");

/*        stkStr.pop();
        stkStr.pop();
        stkStr.pop();*/

        // to peek top most element in stack, use peek
        //System.out.println(stkStr.peek());
        System.out.println(stkStr.search("FFVII"));

        System.out.println(stkStr.empty());
    }
}
