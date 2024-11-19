package Array;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 3, 6, 2, 8, 9, 10 };

        int[] reversedArray = InnerreverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.print(arr[i] + " ");
        // }
    }

    public static int[] InnerreverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        return arr;
    }
}
