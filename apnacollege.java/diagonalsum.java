public class diagonalsum {
    public static void main(String[] args) {
        int matrix[][] = {
            {15,1,1},
            {1,12,1},
            {1,1,10},
            
        };
        int row = matrix.length;
        int column = matrix[0].length;
        int ans;

        
            odd_sum(matrix,row,column);
         
       
        
   
        
    }static void even_diagonal(int matrix[][] , int row, int column){


        int primary_sum = 0;
        for(int i = 0; i < row;i++){
           primary_sum += matrix[i][i];
        }
        System.out.println(primary_sum);
        int secondry_sum = 0;
        int i = 0;
        int j = column -1;
        while(i < row){
            secondry_sum += matrix[i][j];
            i++;
            j--;
        }

        System.out.println(secondry_sum);

        int total_sum = primary_sum + secondry_sum;

       System.out.println(total_sum);
    }static void odd_sum(int matrix[][], int row, int column){

        int primary_sum = 0;
        int secondry_sum = 0;

        for(int i = 0; i < row; i++){
            primary_sum += matrix[i][i];
        }

        for (int i = 0, j = column - 1; i < row; i++, j--) {
            if(i == j){
                continue;
            }
            secondry_sum += matrix[i][j];
        }

        
        int total_sum = primary_sum + secondry_sum;
        System.out.println(total_sum);
    }

    }

