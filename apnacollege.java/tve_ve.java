public class tve_ve {

    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        rearrange(nums);

    }public static void rearrange(int nums[]){
        int no [] = new int [nums.length / 2];
        int no2 [] = new int [nums.length /2];

        //copying tve no to no array
        int start = 0;
        for(int i = 0; i < nums.length;i++){

            if(nums[i] >= 0){
                no[start] = nums[i];
                start++;
            }
        }
        //copying -ve no to no2 array from nums array
        int start2 = 0;
        for(int i = 0; i < nums.length;i++){

            if(nums[i] < 0){
                no2[start2] = nums[i];
                start2++;
            }
        }

        //mixing the no tve and ive from no and no2 array
        start = 0;
         start2 = 0;
        for(int i = 0; i < nums.length;i++){

            if(i % 2 == 0){
                nums[i] = no[start];
                start++;
            }
            else if(i % 2 != 0){
                nums[i] = no2[start2];
                start2++;
            }
        }
        //printing tve from no array
        for(int i = 0; i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    
}
