class Solution {
    public int reverse(int x) {
         int nn=0;
        while(x!=0){
            int rem=x%10;
             if (nn > Integer.MAX_VALUE / 10 ||
                (nn == Integer.MAX_VALUE / 10 && rem > 7))
                return 0;

            // Negative overflow
            if (nn < Integer.MIN_VALUE / 10 ||
                (nn == Integer.MIN_VALUE / 10 && rem < -8))
                return 0;

            nn=nn*10+rem;
            x=x/10;


        }
        return nn;
        
    }
}