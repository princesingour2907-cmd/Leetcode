class Solution {
    public List<String> letterCombinations(String digits) {
        
       List<String> ans=new ArrayList<>();
       if(digits.length()==0) return ans;
         String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs",
            "tuv", "wxyz"
        };
         return helper(digits,map,ans,0,"");
    }
    public List<String> helper(String digits,String []map,List<String> ans,int idx,String str){
        if(idx==digits.length()){
            ans.add(str);
            return ans;
        }
        int digit = digits.charAt(idx) - '0';
        String letters=map[digit];
        for(int i=0;i<letters.length();i++){
            char c=letters.charAt(i);
            helper(digits,map,ans,idx+1,str+c);

        }return ans;
    }
}