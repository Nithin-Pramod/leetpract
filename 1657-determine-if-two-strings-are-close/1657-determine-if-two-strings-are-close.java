import java.util.Collection;
class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length()!=word2.length()) return false;
        
        char[] ar1 = word1.toCharArray();
        char[] ar2 = word2.toCharArray();
        
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(char i : ar1){
            if(map1.containsKey(i)) map1.put(i,map1.get(i)+1);
            else map1.put(i,1);
        }
        for(char i : ar2){
            if(map2.containsKey(i)) map2.put(i,map2.get(i)+1);
            else map2.put(i,1);
        }
        
        Set<Character> keySet1 = map1.keySet();
        Set<Character> keySet2 = map2.keySet();
        
         if (!keySet1.equals(keySet2)) {
            return false;
        }
        
        
        Integer[] valuesArray1 = map1.values().toArray(new Integer[0]);
        Integer[] valuesArray2 = map2.values().toArray(new Integer[0]);
        Arrays.sort(valuesArray1);
        Arrays.sort(valuesArray2);
        
        return Arrays.equals(valuesArray1, valuesArray2);
        
    }
}