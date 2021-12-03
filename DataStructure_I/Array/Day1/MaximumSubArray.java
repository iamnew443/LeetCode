public class MaximumSubArray {
    public static int maximumSubArrray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        /***kadane's algorithm*****/
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0)
                sum = 0;
        }

        return max;
    }
}
