
/**
 * This class provides a solution to find distinct integers in two integer arrays.
 * The method findDifference returns a list of size 2 where:
 * - The first list contains all distinct integers in nums1 that are not in nums2.
 * - The second list contains all distinct integers in nums2 that are not in nums1.
 */
public class Solution {

    /**
     * This method finds the distinct integers in nums1 that are not in nums2 and vice versa.
     * 
     * @param nums1 The first array of integers.
     * @param nums2 The second array of integers.
     * @return A list of two lists:
     *         - The first list contains all distinct integers in nums1 that are not in nums2.
     *         - The second list contains all distinct integers in nums2 that are not in nums1.
     */
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        // Create sets to store the unique integers from both arrays.
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Add all elements from nums1 to set1. 
        // This removes any duplicates in nums1.
        for (int n : nums1) {
            set1.add(n);
        }
        
        // Add all elements from nums2 to set2. 
        // This removes any duplicates in nums2.
        for (int n : nums2) {
            set2.add(n);
        }
        
        // Create a set for unique elements in nums1 not present in nums2.
        Set<Integer> unique1 = new HashSet<>(set1);
        // Remove all elements in set2 from unique1.
        unique1.removeAll(set2);
        
        // Create a set for unique elements in nums2 not present in nums1.
        Set<Integer> unique2 = new HashSet<>(set2);
        // Remove all elements in set1 from unique2.
        unique2.removeAll(set1);
        
        // Convert the unique sets to lists.
        List<Integer> list1 = new ArrayList<>(unique1);
        List<Integer> list2 = new ArrayList<>(unique2);
        
        // Prepare the final answer list.
        List<List<Integer>> answer = new ArrayList<>();
        // Add list1 and list2 to the answer list.
        answer.add(list1);
        answer.add(list2);

        // Return the final answer.
        return answer;
    }
}