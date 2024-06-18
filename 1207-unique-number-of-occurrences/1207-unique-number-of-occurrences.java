class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> numMap = new HashMap<>();
        
        for(int i : arr)
        {
            if(numMap.containsKey(i)) numMap.put(i,numMap.get(i)+1);
            else numMap.put(i,1);
        }
        Set<Integer> uniqueValues = new HashSet<>();
        for(int value : numMap.values()){
            if(!uniqueValues.add(value)){
                return false;
            }
        }
        
        return true;
    }
}