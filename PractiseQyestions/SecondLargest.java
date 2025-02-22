package PractiseQyestions;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };
        int largest = arr[0];
        int slargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }
        System.out.println("The Second Largest Element is : " + slargest);
    }
}
