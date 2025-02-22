package PractiseQyestions;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 2 };

        int largest = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element is : " + largest);
    }
}