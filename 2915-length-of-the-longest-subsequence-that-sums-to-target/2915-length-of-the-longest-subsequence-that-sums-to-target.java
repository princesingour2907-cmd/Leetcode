class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int dp[][]=new int[nums.size()][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-2;
            }
        }
         return helper(nums,target,0,dp);
    }
    public int helper(List<Integer> nums, int target,int i,int[][] dp){
        if(i==nums.size()){
            if(target==0) return 0;
            else return -1;
        }
        if(dp[i][target]!=-2)  return dp[i][target];
        int skip=helper(nums,target,i+1,dp);
        int pick=-1;
        if(nums.get(i)<=target) {
             int result=helper(nums,target-nums.get(i),i+1,dp);
             if(result!=-1){
                pick=1+result;
             }
        }
        dp[i][target]=Math.max(skip,pick);
        return dp[i][target];
    }
}