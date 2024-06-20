class Solution {
    // Method to check if two strings are "close" as defined by the problem
    public boolean closeStrings(String word1, String word2) {
        // Check if the lengths of word1 and word2 are not equal
        if (word1.length() != word2.length()) {
            return false; // If lengths are different, return false
        }
        
        // Count character frequencies in both strings using arrays of size 26 for lowercase letters
        int[] count1 = new int[26]; // Array to store frequency of characters for word1
        int[] count2 = new int[26]; // Array to store frequency of characters for word2
        
        // Count frequencies in word1
        for (char c : word1.toCharArray()) {
            count1[c - 'a']++; // Increment count1 at index corresponding to character c
        }
        
        // Count frequencies in word2
        for (char c : word2.toCharArray()) {
            count2[c - 'a']++; // Increment count2 at index corresponding to character c
        }
        
        // Sort character frequencies arrays
        Arrays.sort(count1);
        Arrays.sort(count2);
        
        // Compare sorted character frequencies arrays
        if (!Arrays.equals(count1, count2)) {
            return false; // If sorted arrays are not equal, return false
        }
        
        // Compare character sets using boolean arrays to track presence of characters
        boolean[] presentInWord1 = new boolean[26]; // Tracks which characters are present in word1
        boolean[] presentInWord2 = new boolean[26]; // Tracks which characters are present in word2
        
        // Mark characters present in word1
        for (char c : word1.toCharArray()) {
            presentInWord1[c - 'a'] = true; // Set true at index corresponding to character c
        }
        
        // Mark characters present in word2
        for (char c : word2.toCharArray()) {
            presentInWord2[c - 'a'] = true; // Set true at index corresponding to character c
        }
        
        // Compare if both sets of characters are the same
        if (!Arrays.equals(presentInWord1, presentInWord2)) {
            return false; // If character sets are not equal, return false
        }
        
        // If all conditions are satisfied, return true indicating word1 and word2 are "close"
        return true;
    }
}
