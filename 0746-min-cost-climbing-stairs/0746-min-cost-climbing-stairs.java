class Solution {
    static int dp[];
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
       int ans= Math.min(helper(cost,0),helper(cost,1));
       return ans;
    }
    public int helper(int arr[],int i){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        return dp[i]=arr[i]+Math.min(helper(arr,i+1),helper(arr,i+2));
    }
}