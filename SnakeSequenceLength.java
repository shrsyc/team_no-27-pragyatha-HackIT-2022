public class SnakeSequenceLength {

    public static void maxSequence(int [][] board){

        int row = board.length , col = board[0].length;
        int maxRow = 0,maxCol = 0;
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
                            maxRow = i;
                            maxCol = j;
                        }
                    }

                    
                    if(j>0 && Math.abs(board[i][j]-board[i][j-1])==1){
                        result[i][j] = Math.max(result[i][j],result[i][j-1]+1);
                        if(maxLenth<result[i][j]){
                            maxLenth = result[i][j]; 
                            maxRow = i;
                            maxCol = j;  
                        }
                    }
                }
            }
        }

      
        System.out.println("Snake Sequence of max length : " + maxLenth);
        
        Path(board, result, maxLenth, maxRow, maxCol);
    }

    public static void Path(int [][] matrix, int [][] result, int maxLength, int maxRow, int maxCol){
        while(maxLength>=1){
            System.out.print(" - " + matrix[maxRow][maxCol]);
            if(maxRow>0 && Math.abs(result[maxRow-1][maxCol]-result[maxRow][maxCol])==1 
                        && Math.abs(matrix[maxRow-1][maxCol]-matrix[maxRow][maxCol])==1){
                maxRow--;
            }else if(maxCol>0 && Math.abs(result[maxRow][maxCol-1]-result[maxRow][maxCol])==1
                              && Math.abs(matrix[maxRow][maxCol-1]-matrix[maxRow][maxCol])==1){
                maxCol--;
            }
            maxLength--;
        }
    }

   

    public static void main(String[] args) {
        int board [][] =  {{7, 5, 2, 3, 1},
                          {3, 4, 1, 4, 4},
                          {1, 5, 6, 7, 8},
                          {3, 4, 5, 8, 9},
                          {3, 2, 2, 7, 6}};

        //  int mat[][] = {{9, 6, 5, 2},
        //                 {8, 7, 6, 5},
        //                 {7, 3, 1, 6},
        //                 {1, 1, 1, 7}}; 
         maxSequence(board);
    }
}