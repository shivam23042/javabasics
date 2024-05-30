

public class transposematri {

    public static void main(String[] args) {
        
        int arr[][] = {
            {1,2,3}, 
            {4,0,8}, 
            {0,5,7}, 
        };

        int row = arr.length;
        int column = arr[0].length;

        int trans[][] = new int [column][row];

        for(int i =0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){

                trans[j][i] = arr[i][j];

            }
        }
    }
    
}
