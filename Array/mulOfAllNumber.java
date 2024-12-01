package Array;

public class mulOfAllNumber {

    public static int Multiply(int[] arr, int mul) {
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        }
        return mul;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 2 };
        int mul = 1;

        System.out.println(Multiply(arr, mul));
    }
}
