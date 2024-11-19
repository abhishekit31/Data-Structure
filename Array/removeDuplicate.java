package Array;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        int newlength = i + 1;
        System.out.println("lenght of the array");
        for (int j = 0; j < newlength; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
