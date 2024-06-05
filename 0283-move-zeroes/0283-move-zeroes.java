class Solution {
    public void moveZeroes(int[] nums) {
        
        int numsLength = nums.length , nonZeroIndex=0;
        
        for(int i = 0 ; i < numsLength ; i++){
            if(nums[i]!=0){
                nums[nonZeroIndex++]=nums[i];
            }
        }
        
        for(int i = nonZeroIndex ; i < numsLength ; i++){
            nums[i]=0;
        }
    }
}