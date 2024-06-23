public class Solution {

    /**
     * This method counts the number of pairs (i, j) such that the i-th row is equal to the j-th column in the given grid.
     * @param grid A 2D array of integers representing the grid.
     * @return The number of equal pairs (i, j).
     */
    public int equalPairs(int[][] grid) {
        // Get the size of the grid (number of rows/columns, since it's a square grid)
        int n = grid.length;
        
        // Initialize a counter to keep track of the number of equal pairs
        int cnt = 0;
        
        // Iterate over each row i of the grid
        for (int i = 0; i < n; i++) {
            // Iterate over each column j of the grid
            for (int j = 0; j < n; j++) {
                // Initialize a flag to check if the current row i is equal to the current column j
                int flag = 0;
                
                // Compare the elements of the i-th row with the j-th column
                for (int k = 0; k < n; k++) {
                    // Check if the element in the i-th row and k-th column is equal to the element in the k-th row and j-th column
                    if (grid[i][k] == grid[k][j]) {
                        // If they are equal, continue to the next element
                        continue;
                    } else {
                        // If they are not equal, set the flag to 1 and break out of the loop
                        flag = 1;
                        break;
                    }
                }
                
                // If flag is still 0 after the inner loop, it means the i-th row is equal to the j-th column
                if (flag == 0) {
                    // Increment the counter for equal pairs
                    cnt++;
                }
            }
        }
        
        // Return the total count of equal pairs
        return cnt;
    }

    public static void main(String[] args) {
        // Example usage of the equalPairs method
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {1, 2, 3}
        };
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Call the equalPairs method and store the result
        int result = solution.equalPairs(grid);
        
        // Print the result
        System.out.println(result); // This should print the number of equal pairs
    }
}
