class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;
        for (int end = k; end < nums.length; end++) {
            windowSum += nums[end] - nums[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return (double) maxSum / k;
    }
}
