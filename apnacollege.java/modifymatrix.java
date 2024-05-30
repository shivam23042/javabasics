public class modifymatrix {

    public static void main(String[] args) {
        
        int arr[][] = {
            {2,-1,2,-1,2},
            {1,0,-1,2,-1},
            {2,-1,-1,-1,2},
            {2,1,2,-1,2},
            {0,1,0,0,0},
            {0,0,0,0,-1},
            {2,-1,2,2,0},
            {0,1,0,2,2},
            {2,2,0,1,-1},
    };
    int ma[] = new int [arr[0].length];

    Find_Max(arr, ma);
    ve(arr, ma);


    }static int[] Find_Max(int arr[][],int ma[]){

       int row = arr.length;
       int column = arr[0].length;
        int k = 0;
        for(int i = 0; i < column;i++){
            int max = 0;
            for(int j = 0; j < row;j++){
                int maxi = arr[j][i];
                max = Math.max(max,maxi); 
            }
            ma[k] = max;
            k++;
        }
        return ma;
    }
    
    static void ve(int arr[][] ,int ma[]){

        int row = arr.length;
        int column = arr[0].length;
        
        for(int i = 0; i < column;i++){
            for(int j = 0; j < row;j++){
               if( arr[j][i] == -1){
                arr[j][i] = ma[i];
               }
            }
        }
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr[0].length;j++){
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
    
}
