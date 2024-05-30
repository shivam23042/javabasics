public class pairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        pair(arr);
        

    }public static void pair(int arr[]){
        
        //1st loop for 1st array
        for(int i = 0; i < arr.length;i++){

            //for printing 2nd array
            for(int j = i + 1; j < arr.length;j++){
                 
                System.out.print(arr[i] + " " + arr[j]);
                System.out.println();
            }
        }
    }
}
