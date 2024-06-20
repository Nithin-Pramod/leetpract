import java.util.Collection;
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        
        // Count character frequencies in both strings
        int[] count1 = new int[26]; // to store frequency of characters for word1
        int[] count2 = new int[26]; // to store frequency of characters for word2
        
        for (char c : word1.toCharArray()) {
            count1[c - 'a']++;
        }
        
        for (char c : word2.toCharArray()) {
            count2[c - 'a']++;
        }
        
        // Compare character frequencies
        Arrays.sort(count1);
        Arrays.sort(count2);
        
        if (!Arrays.equals(count1, count2)) {
            return false;
        }
        
        // Compare character sets
        boolean[] presentInWord1 = new boolean[26];
        boolean[] presentInWord2 = new boolean[26];
        
        for (char c : word1.toCharArray()) {
            presentInWord1[c - 'a'] = true;
        }
        
        for (char c : word2.toCharArray()) {
            presentInWord2[c - 'a'] = true;
        }
        
        if (!Arrays.equals(presentInWord1, presentInWord2)) {
            return false;
        }
        
        return true;
    }
}