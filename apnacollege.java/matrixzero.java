public class matrixzero {
    public static void main(String[] args) {
        int arr[][] = {
            {0,1,1,0},
            {1,1,1,1},
            {1,1,1,1}
        };

       int row[] = {-1,-2,-2};
       int column[] = {-1,-2,-2};
       ij(row, column, arr);

       zero(arr, row, column);

    }


static void row_zero(int arr[][], int row,int column){

        for(int i = 0; i < arr[0].length;i++){
            arr[row][i] = 0;
        }   
        

        System.out.println("ROW ZERO FUNCT CALLWD ->\n");
        for(int i = 0; i < arr.length;i++){
            for(int j =0; j < arr[0].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }static void column_zero(int arr[][] , int row , int column){

        for(int i = 0 ; i < arr.length;i++){
            arr[i][column] = 0;
        }

        System.out.println("COLUMN ZERO FUNCT CALLED ->");
        for(int i = 0; i < arr.length;i++){
            for(int j =0; j < arr[0].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }


    }

    static void ij(int row[] , int column[] ,int arr[][]){


       int count = 0;

       for(int i = 0; i < arr.length;i++){
           for(int j = 0; j < arr[0].length;j++){
               if(arr[i][j] == 0){

                   row[count] = i;
                   column[count]  = j;
                   count++;
               }
           }
       }

    
    }

    static void zero(int arr[][] , int row[] , int column[]){

        for(int i = 0; i < row.length;i++){

            if(row[i] < 0 && column[i] < 0){
                return;
            }
            row_zero(arr, row[i], column[i]);
            column_zero(arr, row[i], column[i]);

        }
    }
}
