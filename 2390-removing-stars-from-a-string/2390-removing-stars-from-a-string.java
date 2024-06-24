class Solution {
    public String removeStars(String s) {
        
        // Initialize a stack to hold characters
        Stack<Character> st = new Stack<>();
        
        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            if (c != '*') {
                // If the character is not an asterisk, push it onto the stack
                st.push(c);
            } else if (!st.isEmpty()) {
                // If the character is an asterisk and the stack is not empty, pop the top element
                st.pop();
            }
        }
        
        // Use a StringBuilder to build the resulting string
        StringBuilder sb = new StringBuilder();
        
        // Iterate over the elements in the stack and append each to the StringBuilder
        for (Character ch : st) {
            sb.append(ch);
        }
        
        // Convert the StringBuilder to a string and return it
        return sb.toString();
    }
}
