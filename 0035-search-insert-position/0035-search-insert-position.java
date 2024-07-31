class Solution {
    public int searchInsert(int[] nums, int target) {

            // Initialize the left and right pointers for binary search
            int l = 0;
            int r = nums.length;

            // Perform binary search
            while (l < r) {
                // Calculate the middle index
                final int m = (l + r) / 2;

                // Check if the target is at the middle index
                if (nums[m] == target) {
                    // Target found, return the index
                    return m;
                }

                // If the target is greater than the middle element, adjust the left pointer
                if (nums[m] < target) {
                    l = m + 1;
                } else {
                    // If the target is less than the middle element, adjust the right pointer
                    r = m;
                }
            }

            // If the target was not found, return the insertion point
            // 'l' is the index where the target should be inserted to maintain order
            return l;
        }
}