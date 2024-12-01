package Array;

public class SumOfAllNumber {

    public static int Addition(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int sum = 0;

        System.out.println(Addition(arr, sum));
    }
}
