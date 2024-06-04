class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int totalProduct = 1, zeroCount=0;
        boolean zeroVal = false;
        int[] retArr =  new int[nums.length];
        
        for(int i : nums){
            if(i!=0) totalProduct*=i;
            if(i==0){    
                zeroVal = true;
                zeroCount++;     
                }
        }
        
        if(zeroCount==nums.length) return nums;
        
        if(zeroVal){
            if(zeroCount>1){
                for(int i = 0 ; i < nums.length ; i ++ ){
                    retArr[i]=0;
            }
            }
        else{
            for(int i = 0 ; i < nums.length ; i ++ ){
                
                if(nums[i]==0) retArr[i]=totalProduct;
                else retArr[i]=0;
            }
            
        }
            
        }
        
        
        else {
            for(int i = 0 ; i < nums.length ; i ++ ){
            
                if(nums[i]!=0) retArr[i] = totalProduct/nums[i];

                } 
        }
        
        return retArr;
    }
}