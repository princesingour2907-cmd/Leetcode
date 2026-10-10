class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    max=Math.max(dp[j],max);
                }
            }dp[i]=max+1;
        }
            int max=dp[0];
        for(int i=0;i<dp.length;i++){
            if(dp[i]>max) max=dp[i];
        }
        return max;
    }
}