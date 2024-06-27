class Solution {
    public String predictPartyVictory(String senate) {
        // Convert the senate string to a character array for easier manipulation
        char[] senateArr = senate.toCharArray();
        
        int length = senateArr.length;
        
        // Initialize two queues to store the indices of 'R' (Radiant) and 'D' (Dire) senators
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();
        
        // Populate the queues with the initial indices of Radiant and Dire senators
        for (int i = 0; i < length; i++) {
            if (senateArr[i] == 'R') rQueue.add(i);
            else dQueue.add(i);
        }
        
        // Process the queues until one of them is empty
        while (dQueue.size() != 0 && rQueue.size() != 0) {
            // Get the indices of the current senators from both queues
            int dTurn = dQueue.poll();
            int rTurn = rQueue.poll();
            
            // The senator with the smaller index gets to ban the other
            // The winner's index is increased by the length of the senate array and added back to the queue
            if (rTurn < dTurn) rQueue.add(rTurn + length);
            else dQueue.add(dTurn + length);
        }
        
        // Determine the winning party based on the remaining senators in the queues
        return rQueue.size() > dQueue.size() ? "Radiant" : "Dire";
    }
}
