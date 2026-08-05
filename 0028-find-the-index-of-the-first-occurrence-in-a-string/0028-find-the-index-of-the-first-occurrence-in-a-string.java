class Solution {
    public int strStr(String haystack, String needle) {
        
        int size=needle.length();
        int i=0;
        int j=size;
        while(i+j<=haystack.length()){
            String str=haystack.substring(i,i+j);
            if(needle.equals(str)){
                return i;
            }
            else{
                i++;
               
            }
        }return -1;
       

    }
}