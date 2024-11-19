package Array;

class largestElement {
    public static void main(String[] args) {
        int arr[] = { 2, 8, 5, 63, 7 };

        int largest = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element is : " + largest);
    }
}