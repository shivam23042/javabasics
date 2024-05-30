public class leftrota {
    public static void main(String[] args) {
        int ro = 1;
        int nums[] = {4,0,3,2,5};

        leftro(nums, ro);

    }
    public static void leftro(int nums[], int ro){
        int end = ro -1;
        int start = 0;
       //reversing till from 0 to till where you want rotate
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[ end];
            nums[end] = temp;
            start++;
            end--;
        }

        start = ro;
        end = nums.length -1;
        //reversing for ro to end
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[ end];
            nums[end] = temp;
            start++;
            end--;
        
        }
        //reversing from 0 th to end
        start = 0;
        end = nums.length -1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[ end];
            nums[end] = temp;
            start++;
            end--;
        
        }
        for(int i = 0; i < nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}
