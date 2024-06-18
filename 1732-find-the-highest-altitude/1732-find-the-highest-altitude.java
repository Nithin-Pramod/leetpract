class Solution {
    public int largestAltitude(int[] gain) {
        
        // Initialize the current altitude and the maximum altitude to 0.
        // The journey starts at sea level, which is 0 altitude.
        int currentAlt = 0, maxAlt = 0;
        
        // Iterate through the gain array to calculate the altitude changes.
        for (int i = 0; i < gain.length; i++) {
            // Update the current altitude by adding the current gain value.
            currentAlt += gain[i];
            
            // Check if the current altitude is greater than the maximum altitude recorded so far.
            // If true, update the maximum altitude to the current altitude.
            if (currentAlt > maxAlt) {
                maxAlt = currentAlt;
            }
        }
        
        // After processing all gain values, return the maximum altitude recorded.
        return maxAlt;
    }
}
