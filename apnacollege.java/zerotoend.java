public class zerotoend {

    public static void main(String[] args) {
        int nums[] = {0,0,0,1};

        zeroend(nums);
    }public static void zeroend(int nums[]){

        int start = 0;
        int end = nums.length -1;

        while(start < end){

           if(nums[start] != 0){
                start++;
            } else if(nums[start] == 0 && nums[end] == 0){
                 end--;
            }
            else{
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                
                start++;
                end--;
            }
        }
        for(int i = 0 ; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}