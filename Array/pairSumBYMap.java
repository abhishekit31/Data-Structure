package Array;

import java.util.HashMap;

public class pairSumBYMap {

    public static int[] findArraySum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 15, 7, 11, 15 };
        int target = 26;

        int[] result = findArraySum(nums, target);
        if (result.length == 0) {
            System.out.println("pair is not found :");
        }
        System.out.println("Indices of pair with target sum: [" + result[0] + ", " + result[1] + "]");
    }
}