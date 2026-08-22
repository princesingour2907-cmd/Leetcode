class Solution {
    public int longestPalindromeSubseq(String s) {
        int dp[][]=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++){
             for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
             }
        }
         return helper(s,0,s.length()-1,dp);
    }
    public int helper(String s,int i,int j,int [][]dp){
        if(i>j) return 0;
        if(i==j) return 1;
        if( dp[i][j]!=-1) return  dp[i][j];
        if(s.charAt(i)==s.charAt(j)) {
            return dp[i][j]=2+helper(s,i+1,j-1,dp);

        }
            return  dp[i][j]=Math.max(helper(s,i+1,j,dp),helper(s,i,j-1,dp));
        
    }
}