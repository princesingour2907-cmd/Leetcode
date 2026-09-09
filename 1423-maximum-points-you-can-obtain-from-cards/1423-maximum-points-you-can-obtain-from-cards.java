class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        int n=cardPoints.length;
        for (int i=0;i<k;i++){
             leftsum+=cardPoints[i];
        }
        int max=leftsum;
        int rightsum=0;
        int rightidx=n-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=cardPoints[i];
            rightsum+=cardPoints[rightidx];
            rightidx--;
             max=Math.max(leftsum+rightsum,max);
        }
        return max;
       


    }
}