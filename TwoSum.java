import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the complement of each number and its index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                // If the complement is in the map, return the indices
                return new int[] { map.get(complement), i };
            }
            // Otherwise, put the current number and its index in the map
            map.put(nums[i], i);
        }

        // No solution found, return an empty array or handle it as needed
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of two numbers that add up to the target: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
