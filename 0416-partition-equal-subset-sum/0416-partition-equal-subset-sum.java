class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
       for( int num:nums) sum+=num;
       if(sum%2!=0) return false;
       int target=sum/2;
       int dp[][]=new int[nums.length][target+1];
       for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            dp[i][j]=-1;
        }
       }
        return helper(target,0,nums,dp);
    }
    public boolean helper(int target,int i,int[] nums,int dp[][]){
        if(i==nums.length){
            if(target==0) return true;
            else  return false;
            
        }
        if(dp[i][target]!=-1){
           return dp[i][target]==1;
        }
        boolean ans=false;
        boolean skip=helper(target,i+1,nums,dp);
        if(target-nums[i]<0){
          ans=skip;
        }
        else{
            boolean pick=helper(target-nums[i],i+1,nums,dp);
            ans= pick|| skip;
        }
       
       if(ans) dp[i][target]=1;
       else dp[i][target]=0;
       return ans;

    }
}