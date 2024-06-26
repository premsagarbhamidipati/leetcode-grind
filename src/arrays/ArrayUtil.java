package arrays;

public class ArrayUtil {

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        // initialize a new array
        int[] myArray = new int[5];
        printArray(myArray);
    }

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
    }

}
