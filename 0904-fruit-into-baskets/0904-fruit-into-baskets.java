class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int r=0; int l=0; int max=0;
        while(r<fruits.length){
            if(map.containsKey(fruits[r])){
                map.put(fruits[r],map.get(fruits[r])+1);
            }
            else{
                map.put(fruits[r],1);
            }
            if(map.size()>2){
                while(map.size()>2){
                    if(map.containsKey(fruits[l])){
                        map.put(fruits[l],map.get(fruits[l])-1);
                    }
                    if(map.get(fruits[l])==0) map.remove(fruits[l]);
                    l++;
                }
            }
            if(map.size()<=2){
                max=Math.max(max,r-l+1);
            }

           r++;
        }
         return max;
    }
}