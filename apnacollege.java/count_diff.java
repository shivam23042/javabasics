public class count_diff {
    
    public static void main(String[] args) {
        int arr[] = {10,10,10,10,10};

        count_dif(arr);

    }static void count_dif(int arr[]){
        int count  = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+ 1; j <arr.length;j++){
                int first = arr[i];
                int second = arr[j];

                for(; first != 0; first /= 10){
                    int rem1 = first % 10;
                    int rem2 = second % 10;

                    if(rem1 != rem2){
                        count++;
                    }
                    second /= 10;
                }
            }
        }
        System.out.println(count);
    }
}
