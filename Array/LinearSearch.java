package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 8, 1, 2, 5 };
        int target = 8;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("targeted element is present at index " + index);
        } else {
            System.out.println("targeted element is not present in array " + "returuning " + index);
        }
    }
}
