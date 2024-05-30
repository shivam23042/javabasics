public class binarysearch{
 public static void main(String[] args) {
    int arr [] = {2,4,6,8,10,12};
    int key = 12;

    int result = binary(arr, key);
    System.out.println(result);
 }public static int binary(int arr[] , int key){

    int start = 0;
    int end  = arr.length-1;
     
    while(start <= end){
        int mid = (start + end) / 2;
        
        if(arr[mid] == key){
            return mid;
        }
        if(arr[mid] < key){
            start = mid + 1;
        }else{
            end = mid -1;
        }
       
    }
    return -1;
 }
}