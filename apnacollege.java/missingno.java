public class missingno {

    public static void main(String[] args) {
        int nums[] = {9,6,4,2,3,5,7,0,1};
        missno(nums);

    }public static void missno(int nums[]){
        int sum = 0;

        for(int i = 0; i <= nums.length;i++){
            sum += i;
        }
        int sum2 = 0;
        for(int i = 0; i < nums.length;i++){
            sum2 += nums[i];
        }

        int ans = sum - sum2;

        System.out.println(ans);
    }
    
}
