package Array;

public class SwapMax_Min {

    public static void main(String[] args) {
        int[] arr = { 5, 15, 22, 1, 24, 55 };
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("before sawap the max is :" + max);
        System.out.println("before sawap the min is : " + min);

        int temp = max;
        max = min;
        min = temp;
        System.out.println("after sawap the max is : " + max);
        System.out.println("after sawap the min is : " + min);
    }

}
