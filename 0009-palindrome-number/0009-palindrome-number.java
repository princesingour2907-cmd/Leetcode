class Solution {
    
    public boolean isPalindrome(int x) {
        if (x < 0) {
    return false;
}

if (x % 10 == 0 && x != 0) {
    return false;
}
        int y=x;
        int n=0;
        while(y!=0){
            int rem=y%10;
             n=n*10+rem;
            y=y/10;
        }
        if(n==x){
            return true;
        }
        else{
            return false;
        }
    }
}