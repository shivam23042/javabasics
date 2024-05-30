public class bubblesort {

    public static void main(String[] args) {
        int nums[] = {1,3,4,2,3,54,500,2};
        bubble(nums);
    }public static void bubble(int nums[]){

        for(int i = 0; i < nums.length -1; i++){

            for(int j = 0; j < nums.length - i - 1; j++){

                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j +1] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length;i++){
          
            System.out.println(nums[i]);
        }
    }
}