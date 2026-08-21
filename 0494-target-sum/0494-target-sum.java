class Solution {
    int sum=0;
    public int findTargetSumWays(int[] nums, int target) {
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int [][] dp= new int [nums.length][2*sum+1];
        for(int i=0;i<dp.length;i++){
             for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
             }
        }
         return helper(nums,target,0,0,dp);
    }
    public int helper(int[] nums, int target,int i,int res,int [][] dp){
        if(i==nums.length){
            if(res==target) return 1;
            else return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
         int add=helper(nums,target,i+1,res+nums[i],dp);
        int sub=helper(nums,target,i+1,res-nums[i],dp);
       
        return dp[i][res+sum]=add+sub;
    }
}