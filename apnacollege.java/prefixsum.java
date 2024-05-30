public class prefixsum {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        prefixsum(nums);

    }public static void prefixsum(int nums[]){
        int prefix[] = new int [nums.length];

        prefix[0] = nums[0];
        for(int i = 1; i < nums.length;i++){
               int sum = prefix[i-1] + nums[i];
               prefix[i] = sum;
        }
        int max_sum = 0;

       for(int i = 0; i < nums.length; i++){

        for(int j = i; j < nums.length;j++){
            int curr = 0;
            if(i == 0){
               curr = prefix[j];
            }else{
                curr = prefix[j] - prefix[i -1];
            }
            if(max_sum < curr){
                max_sum = curr;
            }
        }
       }
        System.out.println(max_sum);
    }
}
