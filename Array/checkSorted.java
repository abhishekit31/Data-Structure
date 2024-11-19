package Array;

public class checkSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 3, 4, 5, 6 };
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
