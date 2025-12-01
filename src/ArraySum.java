public class ArraySum {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to start fresh at nums[i],
            // or continue the previous subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the global maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
