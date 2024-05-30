public class reversearr{
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,4,2,1};
    reverse(arr);

    //printing reversed array array passed in a function by refrence
    for(int i = 0; i< arr.length;i++){
        System.out.println(arr[i]);
    }
}public static void reverse(int arr[]){
     int start = 0;
     int end = arr.length -1;

     while (start < end) {
        //swapping first and last array
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          
          start++;
          end--;
     }
}
}