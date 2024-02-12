package leetcode.easy.math;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isPalindrome = isPalindrome(x);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reversed_int = 0;
        // iterate half of the number
        while (x > reversed_int) {
            int pop = x % 10;   //quotient
            x = x/10;           //reminder

            reversed_int = (reversed_int * 10) + pop;
        }

        if (x == reversed_int || x == reversed_int / 10) {
            return true;
        } else {
            return false;
        }
    }
}
