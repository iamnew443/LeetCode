import java.util.*;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        /****method 1*******/
        // Map<Integer, Integer> hashmap = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        //     if (hashmap.containsKey(nums[i]))
        //         return true;
        //     hashmap.put(nums[i], i);
        // }

        // return false;

        /****method 2******/
        Set<Integer> hashset = new HashSet<>();
        
        for (int i=0; i < nums.length; i++)
            hashset.add(nums[i]);

        if (hashset.size() == nums.length)
            return false;
        
        return true;
    }
}