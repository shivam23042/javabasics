public class binarymatrix {


    public static void main(String[] args) {
        
        int mat[][] = {
            {1,1,0},
            {1,0,1},
            {0,0,0},
        };
        int row = mat.length;
        int column = mat[0].length;

        int matrix[][] = new int [row][column];
        
        System.out.println("Changed matrix elements from o to 1 and vice versa -> \n");
        change(mat);
        System.out.println("changed elmntes of row from end to first and first to end -> \n");
        rowend(mat ,matrix);

        

    }static void change(int mat[][]){
        int row = mat.length;
        int column = mat[0].length;

        for(int i = 0; i < row;i++){
            for(int j = 0; j < column; j++){

                if(mat[i][j] == 0){
                    mat[i][j] = 1;
                }else{
                    mat[i][j] =0;
                }
            }
        }
        for(int i = 0; i < row;i++){
            for(int j = 0; j < column;j++){
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void rowend(int mat[][] ,int matrix[][] ){

        int row = mat.length;
        int column = mat[0].length;
        
          for(int i = 0; i < row ; i++){
            int k = 0;
            for(int j = column -1 ; j >= 0; j--){
                matrix[i][k] = mat[i][j];
                k++;
            }
          
          }
          for(int i = 0; i < row;i++){
            for(int j = 0; j < column;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }
    
}
