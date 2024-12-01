package Array;

public class LinearSerachFnc {
    public static int LinearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 8, 1, 2, 5 };
        int target = 10;

        System.out.println(LinearSearch(arr, target));
    }
}
