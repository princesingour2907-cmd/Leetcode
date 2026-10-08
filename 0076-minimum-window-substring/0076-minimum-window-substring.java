class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int n=t.length();
        int m=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int right=0; int left=0; int count=0; int min=Integer.MAX_VALUE; int start=0;
        while(right<m){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                if(map.get(c)>0){
                    count++;
                }
            
           
            } map.put(c,map.getOrDefault(c,0)-1);
        while(count==t.length()){
            if((right-left+1)<min){
                min=right-left+1;
                start=left;
            }
             char ch=s.charAt(left);
             if(map.containsKey(ch)){
               map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch)>0){
                    count--;
                    
                }
            } 
            left++;
        }right++;
        }
        if (min == Integer.MAX_VALUE) return "";
        return s.substring(start,start+min);
    }
}