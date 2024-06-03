class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int m = word1.length();
        
        int n = word2.length();
        String res  = "";
        int i = 0 , j = 0 ;
        while( i < m || j < n){
            if(i < m){
                res = res + word1.charAt(i);
                i++;
            }
            if(j<n){
                res = res + word2.charAt(j);
                j++;
            }
        }
        
        return res;
        
    }
}