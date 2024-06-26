class RecentCounter {

    // Queue to store the timestamps of the pings
    Queue<Integer> queue;

    // Constructor initializes the queue
    public RecentCounter() {
        queue = new LinkedList<>();
    }

    /**
     * Records a ping at time t.
     * @param t The current timestamp (in milliseconds).
     * @return The number of pings that have been made in the past 3000 milliseconds (including the current ping).
     */
    public int ping(int t) {
        
        // Add the current ping timestamp to the queue
        queue.add(t);
        
        // Remove pings from the queue that are older than 3000 milliseconds
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        
        // Return the number of pings in the past 3000 milliseconds
        return queue.size();
    }
}