class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                char num=board[i][j];
                if(num=='.') continue;
                if(set.contains(num)) return false;
                set.add(num);
               
               }
            } 
        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                char num=board[j][i];
                if(num=='.') continue;
                if(set.contains(num)) return false;
                set.add(num);
               
               }
            }
         for(int i=0;i<9;i+=3){
                for(int j=0;j<9;j+=3){
                  HashSet<Character> set=new HashSet<>();
                  for(int k=i;k<i+3;k++){
                     for(int l=j;l<j+3;l++){
                       char num=board[k][l];
                       if(num=='.') continue;
                       if(set.contains(num)) return false;
                       set.add(num);
                       }
                     }
                 } 

        
           }  return true;
        }}
        
           