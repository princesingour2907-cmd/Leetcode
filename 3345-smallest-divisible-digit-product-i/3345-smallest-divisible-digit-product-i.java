class Solution {
    public int smallestNumber(int n, int t) {
        while(check(n)%t!=0){
            n++;
        }
        return n;


    }
    public int check(int n){
        int product=1;
        while(n!=0){
           int rem=n%10;
           n=n/10;
           product=product*rem;
        }
        return product;
    }
}