class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
         return helper(nums,k)- helper(nums,k-1);
       
    }
    public int helper(int []nums,int k){
        if(k<0) return 0;
        int r=0;int l=0; int c=0; int sum=0;
        while(r<nums.length){
            sum=sum+(nums[r]%2);
            while(sum>k){
                sum=sum-(nums[l]%2);
                l++;
            }
            c=c+(r-l+1);
            r++;
        }
        return c;
    }
}
