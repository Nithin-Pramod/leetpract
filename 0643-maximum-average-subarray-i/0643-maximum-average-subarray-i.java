class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        
        double max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > max) {
                max = sum;
            }
        }

        
        return max/k;
        
        
    }
}