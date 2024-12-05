package Array;

public class MajorityElement {
    // ======BRUTE FORCE SOLUTION======
    // public static int InnerMajorityElement(int[] arr) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // int count = 0;
    // for (int j = 0; j < n; j++) {
    // if (arr[i] == arr[j]) {
    // count++;
    // }
    // }
    // if (count > n / 2) {
    // return arr[i];
    // }
    // }
    // return -1;

    // }
    // ======OPTIMIZE SOLUTION======
    public static int InnerMajorityElement(int[] arr) {
        int count = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                res = arr[i];
            }
            if (res == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        for (int ele : arr) {
            if (ele == res) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return res;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 3, 1, 1, 3 };
        System.out.println(InnerMajorityElement(arr));
    }
}
