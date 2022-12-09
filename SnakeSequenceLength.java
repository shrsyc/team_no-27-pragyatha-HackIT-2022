public class SnakeSequenceLength {

    public static int maxSequence(int [][] board){

        int row = board.length , col = board[0].length;
        int maxLenth =1;
        
        
        int [][] result = new int [row][col];

        
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                result[i][j] =1;
            }
        }

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if(i!=0 || j!=0){
                    
                    if(i>0 && Math.abs(board[i][j]-board[i-1][j])==1){
                        result[i][j] = Math.max(result[i][j],result[i-1][j]+1);
                        if(maxLenth<result[i][j]){
                            maxLenth = result[i][j];
                        }
                    }

                    
                    if(j>0 && Math.abs(board[i][j]-board[i][j-1])==1){
                        result[i][j] = Math.max(result[i][j],result[i][j-1]+1);
                        if(maxLenth<result[i][j]){
                            maxLenth = result[i][j];   
                        }
                    }
                }
            }
        }

      
        System.out.println("Snake Sequence of max length : " + maxLenth);
        
        return 0;
    }

   

    public static void main(String[] args) {
        int board [][] =  {{7, 5, 2, 3, 1},
                          {3, 4, 1, 4, 4},
                          {1, 5, 6, 7, 8},
                          {3, 4, 5, 8, 9},
                          {3, 2, 2, 7, 6}};
         maxSequence(board);
    }
}