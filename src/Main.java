//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         * // left shift << it will extra zeros
         * int a = 2; // 1 0 0 0
         * // in this case it is two zeroes will be added
         * int b = a << 10; //
         * System.out.println(b);
         * 
         * // shifts zeroes towards right that means it is removed
         * b = a >> 2;
         * System.out.println(b);
         * 
         * 
         * a = 1023;
         * b = 1026;
         * 
         * int c = 1 | (a & b) << 10;
         * System.out.println(c);
         */

        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}