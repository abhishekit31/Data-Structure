package Array;

public class UniqueElement {

    public static int findUnique(int[] arr) {
        int res = 0;
        for (int ele : arr) {
            res ^= ele;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3, 4 };
        System.out.println(findUnique(arr));

    }
}
