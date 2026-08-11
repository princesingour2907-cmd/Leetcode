class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left=1;
         int ans[]=new int[n];
         ans[0]=1;
        for(int i=1;i<n;i++){
           left=left*nums[i-1];
           ans[i]=left;
        }
        int right=nums[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=ans[i]*right;
            right=right*nums[i];
           
        }
        return ans;
    }
}