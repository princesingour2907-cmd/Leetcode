class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        
        int j=0;
        for(int i=1;i<n;i++){
            grid[i][j]=grid[i-1][j]+grid[i][j];
            
        }
        for(int i=1;i<m;i++){
            grid[j][i]=grid[j][i-1]+grid[j][i];
        }
        int min=0;
        for(int i=1;i<n;i++){
            for(int k=1;k<m;k++){
                grid[i][k]+=Math.min(grid[i][k-1],grid[i-1][k]);
            }
        }
        return grid[n-1][m-1];
    }
}