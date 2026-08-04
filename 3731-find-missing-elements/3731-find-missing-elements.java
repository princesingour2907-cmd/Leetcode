class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
            set.add(num);

        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
            
        }return list;
    }
}