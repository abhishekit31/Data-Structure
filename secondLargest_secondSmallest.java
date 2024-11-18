public class secondLargest_secondSmallest {
    public static void main(String[] args) {
        int arr[] = { 2, 8, 5, 63, 7 };

        int largest = arr[0];
        int slargest = -1;
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < smallest) {
                ssmallest = smallest;
                smallest = arr[j];
            } else if (arr[j] < ssmallest && arr[j] != smallest) {
                ssmallest = arr[j];
            }
        }
        System.out.println("Second largest is : " + slargest);
        System.out.println("Second smallest is : " + ssmallest);
    }
}
