class Solution {
    
    int maxValue(int[] candies){
        
        int maxVal = -1;
        
        for(int i : candies){
            if(i>maxVal) maxVal=i;
        }
        
        return maxVal;
    }
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> retArr = new ArrayList();
        int maxVal = maxValue(candies);
        for(int i : candies){
            if((i+extraCandies) >= maxVal ){
                retArr.add(true);
            }
            else{
                retArr.add(false);
            }
        }
        
        return retArr;
        
    }
}