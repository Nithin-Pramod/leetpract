class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int count = 0;
        
        if(n==0) return true;
        
        for(int i = 0 ; i < flowerbed.length ; i++){
            
            if(flowerbed[i] == 0){
                
                boolean leftIndex = (i==0) || (flowerbed[i-1]==0);
                
                boolean rightIndex = (i== flowerbed.length-1) || (flowerbed[i+1]==0);
                
                
                if(leftIndex && rightIndex){
                    flowerbed[i]=1;
                    count++;
                    
                    if(count >=n) return true;
                }
            }
            
        }
        
        return false;
        
    }
}