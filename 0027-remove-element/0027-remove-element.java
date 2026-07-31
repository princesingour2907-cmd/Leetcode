class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        int arr[]=new int[nums.length];
        for(int num:nums){
            if(num!=val) {
                nums[c]=num;
                c++;

            }
        }
        return c;
    }
}