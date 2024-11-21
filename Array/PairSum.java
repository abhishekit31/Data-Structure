// this approah is work only if array is sorted in asscending order.

package Array;

import java.util.Arrays;

public class PairSum {
    public static int[] findArraySum(int[] arr, int target) {
        int[] newArray = new int[2];

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int pairSum = arr[start] + arr[end];
            if (pairSum > target) {
                end--;
            } else if (pairSum < target) {
                start++;
            } else {
                newArray[0] = start;
                newArray[1] = end;
                return newArray;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 18;

        int[] result = findArraySum(arr, target);
        if (result.length == 0) {
            System.out.println("No pair found for the target sum.");
        } else {
            System.out.println("Pair indices with target sum " + target + ": " + Arrays.toString(result));
        }
    }
}
