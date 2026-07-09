class Solution {
    public int rob(int[] nums) {
     int dp[]= new int[nums.length];
     Arrays.fill(dp,-1);
      return chorr(0,nums,dp); 
       
    }
    public int chorr(int i,int[] nums,int [] dp){
        if(i>=nums.length){
            return 0 ;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick=nums[i]+chorr(i+2,nums,dp);
        int skip=chorr(i+1,nums,dp);
        return dp[i]=Math.max(pick,skip);
    }
}