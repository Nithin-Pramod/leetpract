class Solution {
    public String removeStars(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c != '*'){
                st.push(c);
            }
            else if(!st.isEmpty()) st.pop();
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(Character ch : st){
            sb.append(ch);
        }
        
        return sb.toString();
        
        
    }
}