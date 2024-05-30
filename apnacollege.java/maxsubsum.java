public class maxsubsum {
    public static void main(String[] args) {
        int arr[]= {2,40,12,3,4,23,-123};
        int sum = sum(arr);
        System.out.println(sum);
    }public static int sum(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i <arr.length;i++){
            for (int j= 0; j<arr.length;j++) {
                int sum = 0;

                for(int k = i; k<= j; k++){
                
                sum += arr[k];
                if(sum > max_sum){
                   max_sum= sum;
                }          
                }
            }
        }
        return max_sum;
    }
}
