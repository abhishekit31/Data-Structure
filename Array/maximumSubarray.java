package Array;

public class maximumSubarray {

    public static int Subarray(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int ele : arr) {
            currSum += ele;
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println("Maximum Subarray Sum: " + Subarray(arr));
    }
}