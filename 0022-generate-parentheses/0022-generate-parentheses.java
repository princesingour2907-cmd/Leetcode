class Solution {
    List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(n,0,0,"");
        return list;
        }
    
    public void helper(int n,int open,int close,String ans){
        if(ans.length()==n*2){
            list.add(ans);
            return;
        }
        if(open<n){
            helper(n,open+1,close,ans+'(');
        }
        if(close<open){
            helper(n,open,close+1,ans+')');
        }
    }}
