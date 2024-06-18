class Solution {
    
    int totalSum(int[] nums){
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        return sum;
    }
    
    public int pivotIndex(int[] nums) {
        
        int numsLength = nums.length;
        boolean foundIndex = false;
        int totalSums = totalSum(nums);
        int left_sum=0,right_sum=0;
        if(totalSums-nums[0]==0) return 0; 
        for(int i = 1 ; i < nums.length ; i++){
            left_sum += nums[i-1];
            right_sum=totalSums - left_sum - nums[i];
            
            if(left_sum == right_sum){
                return i;  
            } 
        }
        
        return -1;
        
    }
}