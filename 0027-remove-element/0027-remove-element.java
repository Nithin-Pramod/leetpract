class Solution {
 public int removeElement(int[] nums, int val) {

        int count = 0;

        for (int i : nums) {
            if (val != i)
                nums[count++] = i;
        }
        return count;

    }
}