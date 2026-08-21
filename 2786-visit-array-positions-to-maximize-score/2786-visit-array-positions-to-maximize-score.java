class Solution {
  
    public long maxScore(int[] nums, int x) {
        
        long dp[][]=new long[nums.length][2];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
       return  nums[0]+ helper(nums,x,1,nums[0]%2,dp);
    }
    public long helper(int[] nums, int x,int i,int prev,long [][]dp){
        if(i==nums.length){
          return 0;
        }
        if(dp[i][prev]!=Integer.MIN_VALUE) return dp[i][prev];
        long skip=helper(nums,x,i+1,prev,dp);
        long pick;
        if(nums[i]%2==prev){
              pick=nums[i]+helper(nums,x,i+1,nums[i]%2,dp);
        }
        else{
            pick=nums[i]-x+helper(nums,x,i+1,nums[i]%2,dp);
         }
        return dp[i][prev]=Math.max(pick,skip);
    }
}