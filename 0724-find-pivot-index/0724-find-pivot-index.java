/**
 * This class contains methods to solve the problem of finding the pivot index in an array.
 * The pivot index is the index where the sum of the numbers to the left is equal to the sum of the numbers to the right.
 */
class Solution {

    /**
     * This method calculates the total sum of elements in an array.
     * @param nums The input array of integers.
     * @return The sum of all elements in the array.
     */
    int totalSum(int[] nums) {
        int sum = 0;
        // Iterate through each element in the array and accumulate the sum.
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }

    /**
     * This method finds the pivot index of the array.
     * The pivot index is the index where the sum of the numbers to the left is equal to the sum of the numbers to the right.
     * @param nums The input array of integers.
     * @return The pivot index if it exists, otherwise -1.
     */
    public int pivotIndex(int[] nums) {
        // Get the length of the input array.
        int numsLength = nums.length;

        // Calculate the total sum of all elements in the array.
        int totalSums = totalSum(nums);

        // Initialize variables to store the sum of elements to the left and right of the current index.
        int left_sum = 0, right_sum = 0;

        // Special case: Check if the first element is the pivot index.
        // This is true if the total sum minus the first element is zero.
        if (totalSums - nums[0] == 0) return 0;

        // Iterate through the array starting from the second element.
        for (int i = 1; i < nums.length; i++) {
            // Update the left sum by adding the previous element.
            left_sum += nums[i - 1];

            // Calculate the right sum by subtracting the left sum and the current element from the total sum.
            right_sum = totalSums - left_sum - nums[i];

            // If the left sum equals the right sum, we have found the pivot index.
            if (left_sum == right_sum) {
                return i;
            }
        }

        // If no pivot index is found, return -1.
        return -1;
    }
}
