class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int expect=1;
        while(i<nums.length){
            if(nums[i]<expect){
                i++;
            }
            else if(nums[i]==expect){
               expect++;
               i++;
            }
            else if(nums[i]>expect){
                return expect;
            }
        }
        return expect;
    }
}