class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char [][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        fillq(0,board);
        return ans;
    }
    public void fillq(int row,char[][] board){
        if(row==board.length){
            ans.add(constructboard(board));
            return;
        }
        for(int i=0;i<board.length;i++){
            if(issafe(row,i,board)){
                board[row][i]='Q';
                fillq(row+1,board);
                board[row][i]='.';
            }
        }
    }
    public boolean issafe(int row,int col,char[][] board){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        } return true;
    }
    public List<String> constructboard(char [][] board){
        List<String> list=new ArrayList<>();
        for(char[] rows:board){
            list.add(new String(rows));
        }
        return list;
    }
}