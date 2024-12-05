public class maxSubArray {
    // ======BRUTE FORCE SOLUTION======
    // public static int findSubArray(int[] arr) {
    // int maxsum = Integer.MIN_VALUE;
    // for (int start = 0; start < arr.length; start++) {
    // int currentSum = 0;
    // for (int end = start; end < arr.length; end++) {
    // currentSum = currentSum + arr[end];
    // maxsum = Math.max(maxsum, currentSum);
    // }
    // }
    // System.out.println(maxsum);
    // return 0;
    // }

    // ====== OPTIMAL APPROACH ======
    public static int findSubArray(int[] arr) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;

        for (int ele : arr) {
            currSum += ele;
            max = Math.max(currSum, max);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(findSubArray(arr));
    }
}
