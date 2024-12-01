package Array;

public class Smallest {
    public static void main(String[] args) {
        int[] nums = { 5, 15, 22, 1, -15, 24 };

        int smallest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        System.out.println("The smallest number is : " + smallest);
    }

}
