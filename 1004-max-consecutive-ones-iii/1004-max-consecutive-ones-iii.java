class Solution {
    public int longestOnes(int[] nums, int k) {
        int rr=0; int ll=0; int zeroes=0; int maxlength=0;
        while(rr<nums.length){
             if(nums[rr]==0){
                zeroes++;
             }
             while(zeroes>k){
                if(nums[ll]==0) zeroes--;
                ll++;
                
             }
             maxlength=Math.max(maxlength,rr-ll+1);
             rr++;
        }return maxlength;
    }
}