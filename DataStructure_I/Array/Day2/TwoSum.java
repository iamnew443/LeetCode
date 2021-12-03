import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();

        hashmap.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            int compliment = target - nums[i];

            if (hashmap.containsKey(compliment))
                return new int[] { hashmap.get(compliment), i };
            
            hashmap.put(nums[i], i);
        }

        return new int[] { 0, 0 };
    }
}