class Solution {
    public boolean isSubsequence(String s, String t) {
        
        char[] str = s.toCharArray();
        char[] mainStr = t.toCharArray();
        
        boolean found = false;
        int a =0 , b = 0;
        if(str.length==0) return true;
        while(b<mainStr.length){
            if(str[a] == mainStr[b]){
                a++;
            }
            if(a==str.length) return true;
            b++;  
        }
        
        return false;
        
    }
}