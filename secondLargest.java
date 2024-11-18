public class secondLargest {
    public static void main(String[] args) {
        int arr[] = { 2, 8, 5, 63, 7, 10 };

        int largest = arr[0];
        int second = -1;
        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println("The second largest is: " + second);
    }
}
