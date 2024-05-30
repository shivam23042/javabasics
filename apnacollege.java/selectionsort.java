public class selectionsort {

    public static void main(String[] args) {
        int arr[] = {1,3,45,6,78,3,2,56,7,};

        for(int i = 0 ; i < arr.length;i++){
            int miniindex = i;

            for(int j = i + 1; j < arr.length;j++){
                if(arr[j] <arr[miniindex]){
                    miniindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[miniindex];
            arr[miniindex] = temp;
            System.out.println(arr[i]);
        }
    }
    
}
