import java.util.Arrays;

public class removethrice {
   public static void main(String[] args) {


    int arr[] = {1,1,2,2,2,3,3,3,4,4};
    removethrice(arr);

    

    
   } static void removethrice(int arr[]){
    for(int i = 0; i < arr.length;i++){
        int count = 2;
        for(int j = i + 1; j < arr.length;j++){
            if(arr[i] == arr[j]){
                count--;
            }if(count == 0){
                arr[i] = Integer.MAX_VALUE;
            }
        }
    }

    Arrays.sort(arr);
    int k = 0;

    for(int i = 0; i < arr.length;i++){
        
        if(arr[i] != Integer.MAX_VALUE){
            k++;
            
        }
    }
    System.out.println(k);
}
    
}
