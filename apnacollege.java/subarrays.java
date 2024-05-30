public class subarrays {
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    subarr(arr);
    
}  public static void subarr(int arr[]){
    
    //intialiising 1st  subarray  part
    for(int i = 0;i < arr.length;i++){
        
        
        //intialling  subarray 1st parts
        for(int j = i + 1;j<arr.length;j++){
           
            for(int k = i; k <= j;k++){
                System.out.print( " "+ arr[k]+" ");
            }
            System.out.print("           ");
        }
        System.out.println();
    }
}
}

