class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int [coins.length][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
         int ans=helper(coins,amount,0,dp);
         if(ans==Integer.MAX_VALUE){
            return -1;
         }
         return ans;
    }
    public int helper(int[] coins, int amount,int i,int dp[][]){
        if(amount==0) {
          return 0 ;
        }
        if(i==coins.length) return Integer.MAX_VALUE;
        if(dp[i][amount]!=-1) return dp[i][amount];
        int skip=helper(coins,amount,i+1,dp);
        int pick=Integer.MAX_VALUE;
        if(coins[i]<=amount){
            int result=helper(coins,amount-coins[i],i,dp);
            
            if(result!=Integer.MAX_VALUE) {
                pick=result+1;
        }}
        dp[i][amount]=Math.min(pick,skip);

        return dp[i][amount];
        
    }
}