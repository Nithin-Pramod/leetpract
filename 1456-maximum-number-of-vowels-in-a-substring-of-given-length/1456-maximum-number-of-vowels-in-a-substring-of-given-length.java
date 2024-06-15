class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        
        int length = s.length() , vowelCount=0;
        
        for(int i = 0 ; i < k ; i++){
            if(vowelSet.contains(s.charAt(i))) vowelCount++;
        }
        
        int maxVowels = vowelCount;
        
        for(int i = k ; i <  s.length() ;  i ++){
            
            if(vowelSet.contains(s.charAt(i-k))) vowelCount--;
            if(vowelSet.contains(s.charAt(i))) vowelCount++;
            
            maxVowels = Math.max(maxVowels,vowelCount);
        }
        
        return maxVowels;
        
        
    }
} 