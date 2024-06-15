class Solution {
    public int longestOnes(int[] nums, int k) {
        // Initialize the starting index of the window, count of zeroes in the window, and the maximum length of 1s sequence
        int start = 0, zero_count = 0, max_ones = 0;
        
        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is 0, increment the zero count
            if (nums[i] == 0) {
                zero_count++;
            }
            
            // If the count of zeroes in the current window exceeds k, shrink the window from the start until it doesn't
            while (zero_count > k) {
                // If the element at the start of the window is 0, decrement the zero count
                if (nums[start] == 0) zero_count--;
                
                // Move the start of the window to the right
                start++;
            }
            
            // Calculate the maximum length of the window containing at most k zeroes
            max_ones = Math.max(max_ones, i - start + 1);
        }
        
        // Return the maximum length of contiguous 1s that can be achieved with at most k flips of 0s to 1s
        return max_ones;
    }
}
