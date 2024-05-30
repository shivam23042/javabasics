public class encrypt {

    public static void main(String[] args) {
        int arr[] = {107,19,13};
    
        encrypt(arr);
    
      }static void encrypt(int arr[]){
        int sum = 0;
        int max [] = new int [arr.length]; 
    
        for(int i = 0; i < arr.length;i++){
            int maxi = 0;
            int count = 0;
            for(int j = arr[i] ; j != 0; j/= 10){
                int rem = j % 10;
                maxi = Math.max(maxi, rem);
                
                count = (count * 10) + 1;
            }
            max[i] = count * maxi;
            sum += max[i];
        }
        System.out.println(sum);
      }
    
}
