public class rotate{
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int rot = 2;
        ro(arr,rot);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }public static void ro(int arr[], int rotate){
 
        int end = arr.length -1;
        int j = 0;
        while(j < rotate){

        for(int  i = 0; i < arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }
        j++;
    }

}
}