public class rotatearray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int ro = 2 ;
        rotate(arr,ro);


        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }public static int [] rotate(int arr[],int ro){
        int end = arr.length -1;
         int j = 1; 
         while (j <= ro) {
            
         
        for(int i = 0; i <arr.length;i++){
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }
        j++;
    }
       return arr;
    }
}