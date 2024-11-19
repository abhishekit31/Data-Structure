package Array;

public class targetedElement {
    public static void main(String[] args) {
        int target = 4;
        int[] arr = { 1, 4, 5, 8, 4, 2, 3 };
        boolean indexFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element prsent at index :" + i);
                indexFound = true;
                break;
            }
        }
        if (!indexFound) {
            System.out.println("Element not present in the array");
        }
    }
}
