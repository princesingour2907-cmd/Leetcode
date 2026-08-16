class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
               if((i>=1 && j>=1) && matrix[i][j]!=0){
                int min=Math.min(matrix[i-1][j],matrix[i][j-1]);
                int fmin=Math.min(min,matrix[i-1][j-1]);
                
                matrix[i][j]+=fmin;
                c+=matrix[i][j];
               }
               else{
                  if(matrix[i][j]!=0){
                    c+=matrix[i][j];
                  }
                 
                
               }
            }
        }
        return c;
    }
}