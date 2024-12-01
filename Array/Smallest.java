package Array;

public class Smallest {
    public static void main(String[] args) {
        int[] nums = { 5, 15, 22, 1, -15, 24, 55 };

        int smallest = nums[0];
        int smallestIndex = 0;
        int largest = nums[0];
        int largestIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
                smallestIndex = i;
            }
            if (nums[i] > largest) {
                largest = nums[i];
                largestIndex = i;
            }
        }
        System.out.println("The smallest number is " + smallest + " present at index " + smallestIndex);
        System.out.println("The largest number is " + largest + " present at index " + largestIndex);
    }

}
