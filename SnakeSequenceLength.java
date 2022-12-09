public class SnakeSequenceLength {

    public static int maxSequence(int [][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxLenth =1;
        
        
        int [][] result = new int [rows][cols];

        
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                result[i][j] =1;
            }
        }

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                if(i!=0 || j!=0){
                    
                    if(i>0 && Math.abs(matrix[i][j]-matrix[i-1][j])==1){
                        result[i][j] = Math.max(result[i][j],result[i-1][j]+1);
                        if(maxLenth<result[i][j]){
                            maxLenth = result[i][j];
                            
                        }
                    }

                    
                    if(j>0 && Math.abs(matrix[i][j]-matrix[i][j-1])==1){
                        result[i][j] = Math.max(result[i][j],
                                result[i][j-1]+1);
                        if(maxLenth<result[i][j]){
                            maxLenth = result[i][j];
                           
                        }
                    }
                }
            }
        }

      
        System.out.println("Max Snake Sequence : " + maxLenth);
        
        return 0;
    }

   

    public static void main(String[] args) {
        int arrA [][] =  {{7, 5, 2, 3, 1},
                          {3, 4, 1, 4, 4},
                          {1, 5, 6, 7, 8},
                          {3, 4, 5, 8, 9},
                          {3, 2, 2, 7, 6}};
         maxSequence(arrA);
    }
}