import java.util.Arrays;

//======BRUTE FORCE SOLUTION======
public class pairSum {
    // public static int[] findSumArray(int[] arr, int target) {
    // int[] newArray = new int[2];
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] + arr[j] == target) {
    // newArray[0] = i;
    // newArray[1] = j;
    // }
    // }
    // }
    // return newArray;

    // }

    // ======OPTIMIZE SOLUTION======
    public static int[] findSumArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int[] newArray = new int[2];

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
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 26;
        System.out.println(Arrays.toString(findSumArray(arr, target)));
    }
}
