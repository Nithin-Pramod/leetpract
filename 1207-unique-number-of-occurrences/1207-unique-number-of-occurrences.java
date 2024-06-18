
public class Solution {
    /**
     * Checks if each number in the input array has a unique count of occurrences.
     *
     * @param arr The input array of integers.
     * @return true if each number has a unique count of occurrences, false otherwise.
     */
    public boolean uniqueOccurrences(int[] arr) {
        // Step 1: Initialize a HashMap to store the count of occurrences of each number
        Map<Integer, Integer> numMap = new HashMap<>();

        // Step 2: Populate the HashMap with counts of each number in the array
        for (int i : arr) {
            if (numMap.containsKey(i)) {
                // If number i is already in the map, increment its count
                numMap.put(i, numMap.get(i) + 1);
            } else {
                // If number i is not in the map, add it with a count of 1
                numMap.put(i, 1);
            }
        }

        // Step 3: Use a HashSet to track unique occurrences counts
        Set<Integer> uniqueValues = new HashSet<>();
        for (int value : numMap.values()) {
            if (!uniqueValues.add(value)) {
                // If adding the value to the set returns false, it means the value already exists
                // This indicates a duplicate count, so return false
                return false;
            }
        }

        // Step 4: If all counts are unique, return true
        return true;
    }
}