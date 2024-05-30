public class kadnesalgo {

    public static void main(String[] args) {
        
        int nums[] = {1,2,3,-40,69};
        sum(nums);
    }public static void sum(int nums[]){

        int max_sum = 0;
        int sum = 0;

        for(int i = 0; i < nums.length;i++){
            sum = sum + nums[i];

            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println(sum);

    }
    
}
